
#source "examen1.xana"


' Invocation to the main function
call main	
halt	


#line	3

f:	
	' Parameters
	' a :: boolean (offset 8)
	' b :: boolean (offset 6)
	' c :: boolean (offset 4)
	' Local variables
	enter	0	

#line	4
	' Return
	push	bp
	pushi	8
	addi	
	loadi	
	push	bp
	pushi	6
	addi	
	loadi	
	and	
	push	bp
	pushi	4
	addi	
	loadi	
	not	
	or	
	ret 2, 0, 6	

#line	7

main:	
	' Parameters
	' Local variables
	' b1 :: boolean (offset -2)
	' b2 :: boolean (offset -4)
	' b3 :: boolean (offset -6)
	' a :: int (offset -8)
	enter	8	

#line	11
	' Write
	pushi	1
	pushi	0
	pushi	0
	call		f	
	outi	

#line	12
	' Write
	pushi	1
	pushi	0
	pushi	1
	call		f	
	outi	

#line	13
	' Write
	pushi	0
	pushi	1
	pushi	1
	call		f	
	outi	

#line	14
	' Write
	pushi	0
	pushi	0
	pushi	0
	call		f	
	outi	

#line	16
	push	bp
	pushi	-2
	addi	
	pushi	1
	storei	

#line	17
	push	bp
	pushi	-4
	addi	
	pushi	3
	pushi	1
	gti	
	storei	

#line	18
	push	bp
	pushi	-6
	addi	
	pushf	4.5
	pushf	4.2
	lef	
	storei	

#line	19
	' Write
	push	bp
	pushi	-2
	addi	
	loadi	
	outi	

#line	20
	' Write
	push	bp
	pushi	-4
	addi	
	loadi	
	outi	

#line	21
	' Write
	push	bp
	pushi	-6
	addi	
	loadi	
	outi	

#line	23
	' If statement
	push	bp
	pushi	-2
	addi	
	loadi	
	jz  label0	
	' Body of the if branch

#line	24
	' Write
	pushb	89
	outb	
	jmp  label1	
label0:	
	' Body of the else branch

#line	26
	' Write
	pushb	78
	outb	
label1:	

#line	29
	push	bp
	pushi	-8
	addi	
	pushi	0
	storei	

#line	31
	' While statement
label2:	
	push	bp
	pushi	-8
	addi	
	loadi	
	pushi	10
	lti	
	jz  label3	
	' Body of the while statement

#line	32
	' Write
	push	bp
	pushi	-8
	addi	
	loadi	
	outi	

#line	33
	push	bp
	pushi	-8
	addi	
	push	bp
	pushi	-8
	addi	
	loadi	
	pushi	1
	addi	
	storei	
	jmp  label2	
label3:	
	ret 0, 8, 0	
