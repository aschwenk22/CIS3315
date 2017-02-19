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
 * @author Administrator
 */
public class C11N11 {
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println("Sorted List: "+ list);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("List length: ");
        int length = sc.nextInt();
        
        for(int i = 0; i < length; i++){
            if(i == 0){
                System.out.print("Input first value: ");
                list.add(sc.nextInt());
            } else {
                System.out.print("Input next value: ");
                list.add(sc.nextInt());
            }
        }
        
        C11N11.sort(list);
        
        
    }
}
