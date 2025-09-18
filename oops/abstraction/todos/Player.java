package oops.abstraction.todos;

public class Player {
    public static GameRule chooseGame(int choice) {
        switch (choice) {
            case 1:
                return new Addition();
            case 2:
                return new MaxRule();
            case 3:
                return new MultiplicationRule();
            case 4:
                return new SumCube();
            default:
                System.out.println("Invalid choice. Please select a valid game.");
                return null;
        }
    }
}