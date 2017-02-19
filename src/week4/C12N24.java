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
public class C12N24 {
    
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Salary1.txt";
    
        java.io.File file = new java.io.File(fileName);
        if(file.exists()) {
            System.out.println("File already exists");
            try(Scanner reader = new Scanner(new File(fileName));){
                while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
                }
            }
            System.exit(1);
        }
        
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            for(int i = 1; i < 1001; i++){
                String rank;
                Double salary;
                int rand = (int) (3 * Math.random());
                rank = rankGenerator(rand);
                salary = salGenerator(rand);
                output.println("FirstName" + i + " LastName" + i + " " 
                        + rank + " " + salary);
            }
            System.out.println(fileName + " created.");
        }
        try(Scanner reader = new Scanner(new File(fileName));){
            while (reader.hasNext()) {
                System.out.print(reader.next());
            }
        }
    }
    
    public static String rankGenerator(int rand){
        String rank;
        if(0 <= rand && rand < 1){
            rank = "assistant";
        } else if (1 <= rand && rand < 2){
            rank = "associate";
        } else {
            rank = "full";
        }
        return rank;
    }
    
    public static double salGenerator(int rand) {
        double salary;
        if(0 <= rand && rand < 1){
            salary = (Math.random() * ((80000 - 50000) + 1)) + 50000;
        } else if (1 <= rand && rand < 2){
            salary = (Math.random() * ((110000 - 60000) + 1)) + 60000;
        } else {
            salary = (Math.random() * ((130000 - 75000) + 1)) + 75000;
        }
        return salary;
    }
 
       
    
}
