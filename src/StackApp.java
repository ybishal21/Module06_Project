import java.util.List;
import java.util.Stack;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program reuses the code of Java Collection framework.
 * Creates a List based on user input and sorts it in Ascending order.
 * Adds sorted List elements in Stack.
 */
public class StackApp {

    /**
     * Gets a list of string from the user.
     * Calls convertToInteger to get integer list.
     * Sort List in ascending order.
     * Add all the elements of sorted list into a Stack.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of Integer numbers separated by comma: ");
        String userInput = scanner.nextLine();
        List<Integer> numbers = convertToInteger(userInput);
        Collections.sort(numbers);
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(numbers);
        System.out.println("Sorted Stack: " + myStack);
    }

    /**
     * Parses the user input and returns a List of Integer numbers.
     * Filters out any user input that is not convertible to integer.
     * @param i the user input containing numbers separated by comma.
     * @return A List of Integer numbers.
     */
    public static List<Integer> convertToInteger(String i) {
        List<Integer> num = new ArrayList<>();
        List<String> invalidEntry = new ArrayList<>();
        String[] userInput = i.split(",");
        for (String x : userInput) {
            try {
                int number = Integer.parseInt(x.trim());
                num.add(number);
            } catch (NumberFormatException e) {
                invalidEntry.add(x);
            }
        }
        if(!invalidEntry.isEmpty()) {
            System.out.println("List of Invalid Entry = " + invalidEntry);
        }
        System.out.println("List of user Input to be sorted = " + num);

        return num;
    }
}