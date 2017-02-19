/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Administrator
 */
public class C12N25 {
public static StringBuilder stringBuilder = new StringBuilder("");
public static void main(String[] args) {
    int numberOfAssistants = 0;
    int numberOfAssociates = 0;
    int numberOfFull = 0;
    
    double totalAssistantSalary = 0;
    double totalAssociateSalary = 0;
    double totalFullSalary = 0;
      
    try(BufferedReader br = new BufferedReader(new FileReader(new File("./Salary1.txt")))){
        while(br.ready()){
            char c = (char)br.read();
            stringBuilder.append(c);
            if(c == '\n'){
                String[] recordDetails = stringBuilder.toString().split(" ");
                stringBuilder.setLength(0);
                String rank = recordDetails[2];
                String salary = recordDetails[3];
                if(rank.equalsIgnoreCase("assistant")){
                    numberOfAssistants++;
                    totalAssistantSalary += Double.parseDouble(salary);
                }
                else if(rank.equalsIgnoreCase("associate")){
                    numberOfAssociates++;
                    totalAssociateSalary += Double.parseDouble(salary);
                }
                else if(rank.equalsIgnoreCase("full")){
                    numberOfFull++;
                    totalFullSalary += Double.parseDouble(salary);
                }
            }
        }
        System.out.println(String.format("%12s %12s %12s"," ", "Average Salary","Total Salary"));
        System.out.println(
            String.format("%12s %12.2f %12.2f","Assistant", totalAssistantSalary/numberOfAssistants,totalAssistantSalary));
        System.out.println(
            String.format("%12s %12.2f %12.2f","Associate", totalAssociateSalary/numberOfAssociates,totalAssociateSalary));
        System.out.println(
                String.format("%12s %12.2f %12.2f","Full", totalFullSalary/numberOfFull,totalFullSalary));
        int totalFaculty = numberOfAssistants + numberOfAssociates + numberOfFull;
        double totalSalary = totalAssistantSalary + totalAssociateSalary + totalFullSalary;
        System.out.println(
            String.format("%12s %12.2f %12.2f","All", totalSalary/totalFaculty,totalSalary));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
    
}

