package es.uniovi.dlp.visitor.codegeneration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.RealType;
import es.uniovi.dlp.ast.types.Type;

public class CodeGenerator {

    private OutputStreamWriter out;

    public CodeGenerator(String fileOut, String fileIn) {
        FileOutputStream file;
        try {
            file = new FileOutputStream(fileOut);
            out = new OutputStreamWriter(file);
            source(fileIn);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeAndFlush(String text) {
        try {
            out.write(text);
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


    /**
     * SOURCE, COMMENT and LINE
     */

    private void source(String fileIn)  {
        writeAndFlush("#source \"" + fileIn +"\"");
    }

    private void comment(String comment) {
        writeAndFlush("'" + comment);
    }

    private void line(int number) {
        writeAndFlush("#line\t" + number);
    }


    /**
     * PUSH
     */

    public void pushi (int constant)  {
        writeAndFlush("\tpushi\t" + constant);
    }


    public void pushf (double constant) {
        writeAndFlush("\tpushf\t" + constant);
    }

    public void pushb (char constant)  {
        writeAndFlush("\tpushf\t" + Integer.valueOf(String.valueOf(constant)) );
    }

    public void pusha (int address)  {
        writeAndFlush("\tpusha\t" + address );
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
        writeAndFlush("\tout" + getSuffix(type) + "\t");
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



}
