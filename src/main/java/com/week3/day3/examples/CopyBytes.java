package com.week3.day3.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/main/resources/xanadu.txt");
            out = new FileOutputStream("src/main/resources/outagain1.txt");
            int c;

            while ((c = in.read()) != -1) {
            	System.out.println(" COming in finally in loop");
                out.write(c);
            }
        } finally {
        	System.out.println(" COming in finally");
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}