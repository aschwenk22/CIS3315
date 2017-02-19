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
 * @author Andrew Schwenk
 */
public class C11N10 extends ArrayList {
    private ArrayList<Object> list = new ArrayList<>();

    public C11N10() {
    }
    

    public ArrayList<Object> getList() {
        return list;
    }

    public void setList(ArrayList<Object> list) {
        this.list = list;
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public int getSize() {
        return list.size();
    }
    
    public Object peek() {
        return list.get(getSize() - 1);
    }
    
    public Object pop() {
        Object o = list.get((getSize() - 1));
        list.remove((getSize() - 1));
        return 0;
    }
    
    public void push(Object o) {
        list.add(o);
    }
    
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}

class C11N10Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C11N10 test1 = new C11N10();
        ArrayList<Object> s1 = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a string to add to the list: ");
            s1.add(sc.nextLine());
        }
        test1.setList(s1);
        System.out.println("Is the list empty? " + test1.isEmpty());
        System.out.println("List size: " + test1.getSize());
        System.out.println("Last object in list: " + test1.peek());
    }
}