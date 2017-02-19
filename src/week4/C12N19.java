/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class C12N19 {
        
    public static void main(String[] args) throws MalformedURLException, IOException {
        try{
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNextLine()){
                String line = input.nextLine().trim();
                
                if(line.length() > 0){
                    count += line.split("\\s+").length;
                }
            }
            System.out.println("The file has " + count + " words.");
        }
        catch (MalformedURLException ex ) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex){
            System.out.println("I/O Errors: no such file");
        }
    }
}
  



