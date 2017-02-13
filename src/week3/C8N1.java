package week3;

import java.util.Scanner;

/**
 * Read in user numbers into a multi-dimensional array. Print array. Sum and
 * print the sum of each column.
 * @author Andrew Schwenk
 */
public class C8N1 {

    public static String colSum() {

//Read in total number of rows and the number of numbers in each row.        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows?: ");
        int n = sc.nextInt();
        int[][] x = new int[n][];
        int[] y = new int[n];

        System.out.println("\n");

        int largestRow = 0;
        int rowNum = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("How many numbers are in row " + rowNum + "?: ");
            y[i] = sc.nextInt();
            if (y[i] > largestRow) {
                largestRow = y[i];
            }
            rowNum++;
        }
        System.out.println("\n");

//Store user entered numbers for each row. Each row is of largest row size.      
        int rowNumber = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("\n");
            System.out.println("Row " + rowNumber + ": ");
            System.out.println("------");
            x[i] = new int[largestRow];
            for (int j = 0; j < y[i]; j++) {
                System.out.print("Enter the number at index [" + i + "][" + j + "]: ");
                x[i][j] = sc.nextInt();
            }
            rowNumber++;
        }
        System.out.println("\n");

//Print multi-dimensional array.        
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");

//Sum columns and print each sum.        
        int colNum = 1;
        for (int col = 0; col < largestRow; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum += x[row][col];              
            }
            System.out.print("The sum of column " + colNum + " is: " + sum);
            colNum++;
            System.out.println("\n");
        }
        System.out.println("");
    return "";    
    }
    public static void main(String[] args) {
        System.out.println(colSum());
    }
}