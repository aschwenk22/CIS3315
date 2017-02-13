package week3;

import java.util.Scanner;

/**
 *
 * @author Andrew Schwenk
 */
public class ChessUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ChessBoard chess = new ChessBoard();
        int x = chess.count;
        int[] moveFrom = new int[2];
        int[] moveTo = new int[2];
        
        boolean endGame = false;
        
        System.out.println(chess);
        firstLoop:
        while (endGame == false) {
            if (x % 2 == 0) {
                System.out.println("Turn player WHITE:");
            }
            else {
                System.out.println("Turn player BLACK:");
            }
            while (true){
                System.out.print("Play a move = 1 , Quit = 2: ");
                
                if (sc.nextLine().equals("1")) {
                    break;
                }
                else if (sc.nextLine().equals("2")) {
                    break firstLoop;
                }
                else {
                    System.out.println("Please enter a 1 or a 2.");
                }
            }
            System.out.print("Enter move from (ex. 1 0) : ");
                for (int i=0; i<2; i++) {
                    moveFrom[i] = sc.nextInt();
                }
            System.out.print("Enter move to (ex. 1 0) : ");
                for (int i=0; i<2; i++) {
                    moveTo[i] = sc.nextInt();
                }
            System.out.println("\n");    
            System.out.println("Move from " + moveFrom[0] + "," + moveFrom[1] +
                " to " + moveTo[0] + "," + moveTo[1]);
            chess.move(moveFrom[0], moveFrom[1], moveTo[0], moveTo[1]);
            System.out.println("\n");
            System.out.println(chess);
            x++;
        }
        System.out.println("\n");
        System.out.println("Thanks for playing!");
    }
}