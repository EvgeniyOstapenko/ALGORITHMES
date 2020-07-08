package Tasks.TheirdList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList> listOfLines = new ArrayList<>();
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        while (numberOfLines-- > 0){
            ArrayList<Integer> line = new ArrayList<>();
            int numberOfIntegersInLine = scanner.nextInt(); //first number in line

            while (numberOfIntegersInLine-- > 0){
                int number = scanner.nextInt();
                line.add(number);
            }
            listOfLines.add(line);
        }
        System.out.println(listOfLines);
        scanner.nextLine();

        ArrayList<String> answers = new ArrayList<>();
        int numberOfQueries = Integer.parseInt(scanner.nextLine());

        while (numberOfQueries-- > 0){
            System.out.println("numberOfQueries - " + numberOfQueries);
            try{
                int line = scanner.nextInt() - 1;
                int index = scanner.nextInt() - 1;
                System.out.println("gets  -  " +  listOfLines.get(line).get(index));
                int numberFromQuery = (int) listOfLines.get(line).get(index);
                answers.add(String.valueOf(numberFromQuery));
            }catch (IndexOutOfBoundsException e){
                answers.add("ERROR!");
            }
        }
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
