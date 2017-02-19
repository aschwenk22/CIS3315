/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class C12N15 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a file name to be created: ");
        String fileName = input.nextLine();
        
        java.io.File file = new java.io.File(fileName);
        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            for(int i = 0; i < 100; i++){
                int rand = (int) (Math.random() * 100);
                output.print(rand + " ");
            }
            System.out.println(fileName + " created.");
        }
        try(Scanner reader = new Scanner(new File(fileName));){
            while (reader.hasNext()) {
                System.out.println(reader.next());
            }
        }
       
    }
}
