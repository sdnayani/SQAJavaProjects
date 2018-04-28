package com.week3.day3.examples;
import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        //Scanner s1 = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("src/main/resources/xanadu.txt")));
            //s1 = new Scanner(System.in);
            s.useDelimiter(":");
            //Hello:World,How are you
            while (s.hasNext()) {
                System.out.println(s.next());
                
                System.out.println(" After Delimiter");
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
