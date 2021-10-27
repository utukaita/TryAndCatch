package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws IOException {
        try (BufferedReader reader =
                new BufferedReader(new FileReader("aasi.txt"))){
            String line = reader.readLine();
            System.out.println("got line: " + line);

        }
        catch (Exception e) {
            System.out.println("got exception: " + e);
            System.exit(1);
        }
        try (PrintWriter writer =
                new PrintWriter(new FileWriter ("aasi.txt"))) {
            writer.println("I've been looking for freedom!");
            System.out.println("done");
        }
        catch(Exception e) {
            System.out.println("got exception: " + e);
            System.exit (1);
        }
}
