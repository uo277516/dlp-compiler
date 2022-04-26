package es.uniovi.dlp.visitor.codegeneration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.RealType;
import es.uniovi.dlp.ast.types.Type;

public class CodeGenerator {

    private OutputStreamWriter out;
    private int lastLine=0;

    public CodeGenerator(OutputStreamWriter out,  String fileIn) {
        this.out=out;
            source(fileIn);

    }

    public void writeAndFlush(String text) {
        try {
            out.write(text+"\n");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getSuffix(Type type) {
        if (type instanceof CharType) return "b";
        else if (type instanceof RealType) return "f";
        else return "i";
    }

    public String getTypeString(Type type) {
        if (type instanceof CharType) return "char";
        else if (type instanceof RealType) return "double";
        else return "int";
    }


    /**
     * SOURCE, COMMENT and LINE
     */

    public void source(String fileIn)  {
        writeAndFlush("#source \"" + fileIn +"\"" + "\n");
    }

    public void comment(String comment) {
        writeAndFlush("' " + comment);
    }

    public void commentT(String comment) {
        writeAndFlush("\t' " + comment);
    }


    public void line(int number) {
        if (number==lastLine) return;
        lastLine=number;
        writeAndFlush("\n#line\t" + number);
    }

    public void newLine() { writeAndFlush("");}


    /**
     * PUSH
     */

    public void push(Type type, int cons) {
        writeAndFlush("\tpush" + getSuffix(type) + "\t" + cons);
    }

    public void push(Type type, double cons) {
        writeAndFlush("\tpush" + getSuffix(type) + "\t" + cons);
    }

    public void pusha(int addr) {
        writeAndFlush("\tpusha\t" + addr);
    }


    public void pushaBP ()  {
        writeAndFlush("\tpush\tbp");
    }


    /**
     * LOAD and STORE
     */

    public void load(Type type) {   //loadb, loadi, loadf
        writeAndFlush("\tload" + getSuffix(type) + "\t");
    }

    public void store(Type type) {   //storeb, store, storef
        writeAndFlush("\tstore" + getSuffix(type) + "\t");
    }


    /**
     * ADD, SUB, MUL, DIV and MOD
     * type can't be char
     */

    public void add(Type type) { //addi, addf
        writeAndFlush("\tadd" + getSuffix(type) + "\t");
    }

    public void sub(Type type) { //subi, subf
        writeAndFlush("\tsub" + getSuffix(type) + "\t");
    }

    public void mul(Type type) { //muli, mulf
        writeAndFlush("\tmul" + getSuffix(type) + "\t");
    }

    public void div(Type type) { //divi, divf
        writeAndFlush("\tdiv" + getSuffix(type) + "\t");
    }

    public void mod(Type type) { //modi, modf
        writeAndFlush("\tmod" + getSuffix(type) + "\t");
    }

    /**
     * OUT and IN
     */

    public void out(Type type) { //outb, outi, outf
        writeAndFlush("\tout" + getSuffix(type) + "\t");
    }

    public void in(Type type) { //inb, ini, inf
        writeAndFlush("\tin" + getSuffix(type) + "\t");
    }


    /**
     * POP and DUP
     */

    public void pop(Type type) { //popb, popi, popf
        writeAndFlush("\tpop" + getSuffix(type) + "\t");
    }

    public void dup(Type type) { //dupb, dupi, dupf
        writeAndFlush("\tdup" + getSuffix(type) + "\t");
    }


    /**
     * COMPARISON
     * type can't be char
     */

    public void gt(Type type) { //greater than
        writeAndFlush("\tgt" + getSuffix(type) + "\t");
    }

    public void lt(Type type) { //less than
        writeAndFlush("\tlt" + getSuffix(type) + "\t");
    }

    public void ge(Type type) { //greater equal than
        writeAndFlush("\tge" + getSuffix(type) + "\t");
    }

    public void le(Type type) { //less equal than
        writeAndFlush("\tle" + getSuffix(type) + "\t");
    }

    public void eq(Type type) { //equal
        writeAndFlush("\teq" + getSuffix(type) + "\t");
    }

    public void ne(Type type) { //distinct
        writeAndFlush("\tne" + getSuffix(type) + "\t");
    }

    /**
     * LOGICAL
     */

    public void and() {
        writeAndFlush("\tand" + "\t");
    }

    public void or() {
        writeAndFlush("\tor" + "\t");
    }

    public void not() {
        writeAndFlush("\tnot" + "\t");
    }


    /**
     * CONVERSIONS
     */

    public void b2i() {
        writeAndFlush("\tb2i" + "\t");
    }

    public void i2f() {
        writeAndFlush("\ti2f" + "\t");
    }

    public void f2i() {
        writeAndFlush("\tf2i" + "\t");
    }

    public void i2b() {
        writeAndFlush("\ti2b" + "\t");
    }


    /**
     * JUMPS AND LABELS
     */

    public void label(String id) {
        writeAndFlush(id + ":\t");
    }

    public void jmp(String label) {
        writeAndFlush("\tjmp\t" + label + "\t");
    }

    public void jz(String label) {
        writeAndFlush("\tjz\t" + label + "\t");
    }

    public void jnz(String label) {
        writeAndFlush("\tjnz\t" + label + "\t");
    }

    /**
     * FUNCTIONS
     */

    public void call(String id) {
        writeAndFlush("call " + id + "\t");
    }

    public void enter(int constant) {
        writeAndFlush("\tenter\t" + constant + "\t");
    }

    public void ret(int return_bytes, int locals_bytes, int args_bytes) {
        writeAndFlush("\tret\t" + return_bytes + ", " + locals_bytes + ", " + args_bytes + "\t");
    }

    public void halt() {
        writeAndFlush("halt" + "\t");
    }


    /**
     *
     */
    public void main() {
        call("main");
        halt();
    }

    public void convert(Type of, Type a) {
        if (of.equals(a)) // if(of.equivalent(a))
            return;
        if (of instanceof CharType) {
            b2i();
            if (a instanceof RealType)
                i2f();
        }
        if (of instanceof IntType) {
            if (a instanceof RealType)
                i2f();
            else if (a instanceof CharType)
                i2b();
        }
        if (of instanceof RealType) {
            f2i();
            if (a instanceof CharType)
                i2b();
        }
    }

    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+":
                add(type);
                break;
            case "-":
                sub(type);
                break;
            case "*":
                mul(type);
                break;
            case "/":
                div(type);
                break;
            case "%":
                mod(type);
                break;
        }
    }

    public void logic(String operator) {
        switch (operator) {
            case "&&":
                and();
                break;
            case "||":
                or();
                break;
        }
    }

    public void comparison(String operator, Type type) {
        switch (operator) {
            case ">":
                gt(type);
                break;
            case ">=":
                ge(type);
                break;
            case "<":
                lt(type);
                break;
            case "<=":
                le(type);
                break;
            case "!=":
                ne(type);
                break;
            case "==":
                eq(type);
                break;
        }
    }





}
