package oops.abstraction.todos;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SumCube implements GameRule {
    Scanner sc = new Scanner(System.in);

    @Override
    public void startGame() {
        System.out.println("Starting the sum cube game...");
        
        System.out.println("Enter your two lists of numbers (comma-separated):");

        String list1 = sc.nextLine();
        String list2 = sc.nextLine();

        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        for (String num : list1.split(",")) {
            numbers1.add(Integer.parseInt(num.trim()));
        }
        for (String num : list2.split(",")) {
            numbers2.add(Integer.parseInt(num.trim()));
        }
        int result = sumOfCubes(numbers1, numbers2);
        System.out.println("The maximum sum of cubes of corresponding elements is: " + result);
    }

    @Override
    public void endGame() {
        System.out.println("Ending the sum cube game...");
    }

    public int sumOfCubes(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        int size = Math.min(l1.size(), l2.size());
        for (int i = 0; i < size; i++) {
            int sumCube = (int)(Math.pow(l1.get(i), 3) + Math.pow(l2.get(i), 3));
            result.add(sumCube);
        }
        int max = Integer.MIN_VALUE;
        for (int num : result) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}