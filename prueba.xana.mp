#source "examples/codegeneration/simple.xana"

	' c :: char (offset 0)
	' a :: int (offset 1)
	' r :: double (offset 3)

' Invocation to the main function
call main	
halt	


#line	5

main:	
	' Parameters
	' Local variables
	' a :: int (offset -2)
	' i :: int (offset -4)
	enter	4	

#line	8
	pusha	0
	pushb	97
	storeb	

#line	9
	pusha	0
	loadb	
	outb	
#line	9
	pushb	10
	outb	
#line	11
	pusha	1
	pushi	1
	storei	

#line	12
	push	bp
	pushi	-4
	addi	
	pushb	48
	b2i	
	pushi	3
	muli	
	storei	

#line	13
	pusha	1
	loadi	
	outi	
#line	13
	pushb	32
	outb	
#line	13
	push	bp
	pushi	-4
	addi	
	loadi	
	outi	
#line	13
	pushb	10
	outb	
#line	16
	pushi	2
	i2f	
	pusha	3
	loadf	
	mulf	
	outf	
#line	16
	pushb	10
	outb	
#line	18
	pushi	3
	i2f	
	pushf	4.5
	subf	
	outf	
#line	18
	pushb	32
	outb	
#line	18
	pushb	48
	b2i	
	i2f	
	pushf	48.0
	divf	
	outf	
#line	18
	pushb	32
	outb	
#line	18
	pushb	48
	pushb	49
	modi	
	outi	
#line	18
	pushb	32
	outb	
#line	18
	pushb	48
	pushb	49
	addi	
	outi	
#line	18
	pushb	10
	outb	
#line	20
	pushi	1
	pushi	2
	lti	
	outi	
#line	20
	pushb	32
	outb	
#line	20
	pushi	4
	pushi	3
	gei	
	outi	
#line	20
	pushb	32
	outb	
#line	20
	pushi	5
	pushi	5
	eqi	
	outi	
#line	20
	pushb	32
	outb	
#line	20
	pushi	1
	pushi	2
	and	
	outi	
#line	20
	pushb	32
	outb	
#line	20
	pushi	0
	pushi	3
	or	
	outi	
#line	20
	pushb	32
	outb	
#line	20
	pushi	0
	not	
	outi	
#line	20
	pushb	10
	outb	
