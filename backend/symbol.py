from backend.custom_error import Error
from .help import *
from tabulate import tabulate

class Symbol:
    def __init__(self):
        self.scopes = [GLOBAL]
        self.custom_error_listener = Error()
        self.ERRORS = self.custom_error_listener.ERRORS
        self.table = []
        self.offset = 0
        self.reserv = [{'name':'out_string','type':'SELF_TYPE','kind':'','scope':'','line':'1','value':''},
                                  {'name':'x','type':'String','kind':'parameter','scope':'out_string','line':'1','value':''},
                                  {'name':'out_int','type':'SELF_TYPE','kind':'','scope':'','line':'2','value':''},
                                  {'name':'x','type':'Int','kind':'parameter','scope':'out_int','line':'2','value':''},
                                  {'name':'in_string','type':'String','kind':'','scope':'','line':'3','value':''},
                                  {'name':'in_int','type':'Int','kind':'','scope':'','line':'4','value':''},
                                  {'name':'abort','type':'Object','kind':'','scope':'','line':'5','value':''},
                                  {'name':'type_name','type':'String','kind':'','scope':'','line':'6','value':''},
                                  {'name':'copy','type':'SELF_TYPE','kind':'','scope':'','line':'7','value':''},
                                  {'name':'length','type':'Int','kind':'','scope':'','line':'8','value':''},
                                  {'name':'concat','type':'String','kind':'','scope':'','line':'9','value':''},
                                  {'name':'s','type':'String','kind':'parameter','scope':'concat','line':'9','value':''},
                                  {'name':'substr','type':'String','kind':'','scope':'','line':'10','value':''},
                                  {'name':'i','type':'Int','kind':'parameter','scope':'substr','line':'10','value':''},
                                  {'name':'l','type':'Int','kind':'parameter','scope':'substr','line':'10','value':''}]

    def getTable(self):
        return self.table
    
    def getReserva(self):
        return self.reserv
    
    def push_scope(self, scope):
        self.scopes.append(scope)

    def pop_scope(self):
        self.scopes.pop()

    def insert(self, name, typ, kind, scope, line, value=None):

        scope_variables = filter(lambda x: x['scope'] == scope, self.table)
        if (name, kind, scope) in map(lambda x: (x['name'], x['kind'], x['scope']), scope_variables) and kind != 'parameter':
            self.custom_error_listener.error(KIND_TABLE_ERROR[kind] + ' ' + name + ' ya fue declarada ', line)

        size = self.getBytes(typ)

        self.table.append({'name': name, 'type': typ, 'kind': kind, 'scope': scope, 'line': line, 'value': value, 'size': size, 'address': self.offset})


    def get(self, name, line,scope=None):
        if scope is None:
            scope = self.get_scope()

        scope_variables = filter(lambda x: x['scope'] == scope, self.table)
        for variable in scope_variables:
            if variable['name'] == name:
                return variable

        self.custom_error_listener.error('Variable ' + name + ' no declarada', line)

    def set(self, name, line, value):
        for scope in reversed(self.scopes):
            for row in self.table:
                if row['name'] == name and row['scope'] == scope:
                    row['value'] = value
                    return

        self.custom_error_listener.error('Variable ' + name + ' no declarada', line)

    def getBytes(self, type):
        if type == 'String':
            self.offset += 30
            return 30
        elif type == 'Int':
            self.offset += 4
            return 4
        elif type == 'Bool':
            self.offset += 1
            return 1
        elif type == 'Object' or type == 'SELF_TYPE':
            self.offset += 100
            return 100

    def get_scope(self):
        return self.scopes[-1]

    def __str__(self):
        table = map(lambda x: x.values(), self.table)
        return tabulate(table, headers=['name', 'type', 'kind', 'scope', 'line', 'value', 'size', 'address'])
