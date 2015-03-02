package de.javatricks.util;

import java.io.*;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 02.03.15
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class PrintStreamVsPrintWriter {

    public static void main(String[] args) throws UnsupportedEncodingException {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out, true, "ISO-8859-1");
        printStream.println("öäü?");
        System.out.println(Arrays.toString(out.toByteArray()));
        out = new ByteArrayOutputStream();

        printStream = new PrintStream(out, true, "UTF-8");
        printStream.println("öäü?");
        System.out.println(Arrays.toString(out.toByteArray()));
        out = new ByteArrayOutputStream();

        printStream = new PrintStream(out, true, "UTF-16");
        printStream.println("öäü?");
        System.out.println(Arrays.toString(out.toByteArray()));

        out = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(out, true);
        printWriter.println("öäü?");
        System.out.println(Arrays.toString(out.toByteArray()));

        out = new ByteArrayOutputStream();
        printWriter = new PrintWriter(out, false);
        printWriter.println("öäü?");
        printWriter.flush();
        System.out.println(Arrays.toString(out.toByteArray()));


        out = new ByteArrayOutputStream();
        printWriter = new PrintWriter(out, true);
        printWriter.println("öäü?");
        System.out.println(Arrays.toString(out.toByteArray()));

    }
}
