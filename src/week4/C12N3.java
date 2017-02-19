/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class C12N3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] generatedArray;
        generatedArray = randomArray();
        System.out.println("Random array generated.");
        boolean continueInput = true;

        do{
          try{
            System.out.print("Enter an array index: ");
            int index = input.nextInt();
            
            System.out.println("The value at index " + index + " is: " + generatedArray[index]);
            continueInput = false;
          }
          catch (ArrayIndexOutOfBoundsException ex){
              System.out.println("Try Again. (Invalid input: highest index value is 99.)");
              input.nextLine();
          } 
        } while(continueInput);
}   
    /**
     *
     * @return Random Array with a length of 100.
     */
    public static int[] randomArray(){
        int[] rand = new int[100];
        
        for(int i = 0; i < 100; i++){
            rand[i] = (int) (Math.random() * 100); 
        }
        return rand;
    }

}
