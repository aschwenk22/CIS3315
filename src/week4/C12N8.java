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
public class C12N8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
          try{
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            
            System.out.println("The decimal value for hex number "
              + hex + " is " + hexToDecimal(hex.toUpperCase()));
            continueInput = false;
          }
          catch (HexFormatException ex){
              System.out.println("Try Again. (Invalid input: must be a hex number.)");
          } 
        } while(continueInput);
        
        
        
        
    }
    
    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);            
        }
        return decimalValue;
    }
    
    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        } else if(ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            throw new HexFormatException("Input must be a hex number");
        }
    }
    
}   

class HexFormatException extends Exception {
    public HexFormatException(String message) {
        super(message);
    }
}
