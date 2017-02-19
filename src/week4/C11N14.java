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
public class C11N14 {
    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> unionList = new ArrayList<>();
        list1.forEach((n) -> {
            unionList.add(n);
        });
        list2.forEach((n) -> {
            unionList.add(n);
        });
        return unionList;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("List 1 length: ");
        int length1 = sc.nextInt();
        
        for(int i = 0; i < length1; i++){
            if(i == 0){
                System.out.print("Input first int: ");
                list1.add(sc.nextInt());
                
            } else {
                System.out.print("Input next int: ");
                list1.add(sc.nextInt());
            }
        }
        
        System.out.print("List 2 length: ");
        int length2 = sc.nextInt();
        
        for(int i = 0; i < length2; i++){
            if(i == 0){
                System.out.print("Input first int: ");
                list2.add(sc.nextInt());
                
            } else {
                System.out.print("Input next int: ");
                list2.add(sc.nextInt());
            }
        }
        
        System.out.println("The union of the lists is: "+ C11N14.union(list1, list2));
    }
}
