package oops.abstraction.todos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Game Hub!");
        
        System.out.println("Choose a game: \n1. Addition \n2. Maximum Finder \n3. Multiplication \n4. Sum of Cubes");

        int choice = sc.nextInt();
        

        GameRule selectedGame = Player.chooseGame(choice);
        if (selectedGame != null) {
            selectedGame.startGame();
            // You can add code here to play the selected game using the input lists
            selectedGame.endGame();
        }

        sc.close();
    }
}