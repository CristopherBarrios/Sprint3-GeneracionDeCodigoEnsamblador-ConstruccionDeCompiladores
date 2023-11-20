   
 .text    
 .globl main    
 Main:    
 	li $t0, 4    
 	sw $t0, 0($sp)    
 	li $t1, 4    
 	sw $t1, 4($sp)    
 suma:    
 	sub $sp, $sp, 8    
 	lw $s0, 0($sp)    
 	lw $s1, 0($sp)    
 	move $s0, $a0    
 	move $s1, $a1    
 	add $s0, $s0, $s1    
 	sw $s0, 4($sp)    
 	move $v0, $s0    
 	add $sp, $sp, 8    
 	jr $ra    
 multo:    
 	sub $sp, $sp, 8    
 	lw $s0, 0($sp)    
 	lw $s2, 0($sp)    
 	move $s0, $a0    
 	move $s2, $a1    
 	mul $s0, $s0, $s2    
 	sw $s0, 4($sp)    
 	move $v0, $s0    
 	add $sp, $sp, 8    
 	jr $ra    
 dinivion:    
 	sub $sp, $sp, 8    
 	lw $s0, 0($sp)    
 	lw $s3, 0($sp)    
 	move $s0, $a0    
 	move $s3, $a1    
 	div $s0, $s0, $s3    
 	sw $s0, 4($sp)    
 	move $v0, $s0    
 	add $sp, $sp, 8    
 	jr $ra    
 restita:    
 	sub $sp, $sp, 8    
 	lw $s0, 0($sp)    
 	lw $s4, 0($sp)    
 	move $s0, $a0    
 	move $s4, $a1    
 	sub $s0, $s0, $s4    
 	sw $s0, 4($sp)    
 	move $v0, $s0    
 	add $sp, $sp, 8    
 	jr $ra    
 main:    
 	jal Main    
 	sub $sp, $sp, 0    
 	move $a0, $t0    
 	move $a1, $t1    
 	jal suma,    
 	move $t2, $v0    
 	move $a0, $t2    
 	jal out_int,    
 	la $a0, text1    
 	jal out_string,    
 	move $a0, $t0    
 	move $a1, $t1    
 	jal multo,    
 	move $t3, $v0    
 	move $a0, $t3    
 	jal out_int,    
 	la $a0, text1    
 	jal out_string,    
 	move $a0, $t0    
 	move $a1, $t1    
 	jal dinivion,    
 	move $t4, $v0    
 	move $a0, $t4    
 	jal out_int,    
 	la $a0, text1    
 	jal out_string,    
 	move $a0, $t0    
 	move $a1, $t1    
 	jal restita,    
 	move $t5, $v0    
 	move $a0, $t5    
 	jal out_int,    
 	la $a0, text1    
 	jal out_string,    
 	la $a0, text0    
 	jal out_string,    
 	li $v0, 10    
 	syscall    
     
 out_int:    
 	li $v0, 1    
 	syscall    
 	jr $ra    
 out_string:    
 	li $v0, 4    
 	syscall    
 	jr $ra    
 .data    
 text0:	.asciiz "Hola mundo"    
 text1:	.asciiz "\n"    
   