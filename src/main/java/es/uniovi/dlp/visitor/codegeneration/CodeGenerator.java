package es.uniovi.dlp.visitor.codegeneration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import es.uniovi.dlp.ast.*;

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

    /**
     * SOURCE AND COMMENTS
     */

    private void source(String fileIn)  {
        writeAndFlush("#source \"" + fileIn +"\"");
    }

    private void comment(String comment) {
        writeAndFlush("'" + comment);
    }

    /**
     *  PUSH
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
     * LOAD Y STORE
     */


    public void load(char sufijo) {   //loadb, loadi, loadf
        writeAndFlush("\tload" + sufijo + "\t");
    }

    public void store(char sufijo) {   //storeb, store, storef
        writeAndFlush("\tstore" + sufijo + "\t");
    }

    /**
     * add[i], addf  Suma
     * sub[i], subf  Resta
     * mul[i], mulf  Multiplicación
     * div[i], divf  División
     * mod[i], modf  Resto (modulus)
     */

    public void add(char sufijo) { //addi, addf
        writeAndFlush("\tadd" + sufijo + "\t");
    }

    public void sub(char sufijo) { //subi, subf
        writeAndFlush("\tsub" + sufijo + "\t");
    }

    public void mul(char sufijo) { //muli, mulf
        writeAndFlush("\tmul" + sufijo + "\t");
    }



}
