/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class C12N13 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args == null || args.length != 1){
            throw new IllegalArgumentException(
                    "Illegal usage. This program takes one command line parameter to be processed.");
        }
        String fileName = args[0];
        int chars = 0;
        int words = 0;
        int lines = 0;
        
        java.io.File file = new java.io.File(fileName);
        
        Scanner input = new Scanner(file);
        
        while(input.hasNextLine())  {
            lines++;
            String line = input.nextLine();
           for(int i=0;i<line.length();i++)
            {
                if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
                chars ++;
            }
            words += new StringTokenizer(line, " ,").countTokens();
        }
        System.out.println("File " + fileName + "has");
        System.out.println(chars + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }
}
