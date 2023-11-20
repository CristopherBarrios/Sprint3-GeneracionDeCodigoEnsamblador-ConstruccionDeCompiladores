   
 .text    
 .globl main    
 main:    
 	sub $sp, $sp, 0    
 	la $a0, text0    
 	jal out_string,    
 	li $v0, 10    
 	syscall    
     
 out_string:    
 	li $v0, 4    
 	syscall    
 	jr $ra    
 .data    
 text0:	.asciiz "Hello, World.\n"    
   