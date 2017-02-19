/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class C11N12 {
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for(Double d : list){
            sum += d;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.print("List length: ");
        int length = sc.nextInt();
        
        for(int i = 0; i < length; i++){
            if(i == 0){
                System.out.print("Input first double: ");
                list.add(sc.nextDouble());
                
            } else {
                System.out.print("Input next double: ");
                list.add(sc.nextDouble());
            }
        }

        System.out.println("Sum = " + C11N12.sum(list));
    }
}
