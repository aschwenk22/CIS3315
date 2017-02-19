/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Andrew Schwenk
 */
public class C11N4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar1 = new ArrayList<>();
        
        for(int i = 0; i < 100; i++){
            System.out.print("Enter a positive integer to add to the ArrayList, enter 0 to finish entry: ");
            int input = sc.nextInt();
            ar1.add(input);
            if(input == 0){
                break;
            }
        }
        System.out.println("The maximum value in the ArrayList is: " + max(ar1));
    }
    
    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty()){
            return null;
        } else {
            return Collections.max(list);               
        }
    }
}
