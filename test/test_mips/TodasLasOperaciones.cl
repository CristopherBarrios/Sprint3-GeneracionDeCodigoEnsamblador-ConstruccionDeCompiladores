class Main inherits IO {
  a: Int <- 4;
  b: Int <- 4;
  x: String <- "Hola mundo";
  u: String <- "\n";
  
  suma(y : Int, k : Int) : Int { 
        y + k
  };

  multo(y : Int, k : Int) : Int { 
        y * k
  };
  dinivion(y : Int, k : Int) : Int { 
        y / k
  };
  restita(y : Int, k : Int) : Int { 
        y - k
  };
  main() : Object {
    {
      out_int(suma(a, b));
      out_string(u);
      out_int(multo(a, b));
      out_string(u);
      out_int(dinivion(a, b));
      out_string(u);
      out_int(restita(a, b));
      out_string(u);
      out_string(x);
    }
  };
};
