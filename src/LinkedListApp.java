import java.util.*;

/**
 * This program reuses the code of Java Collection framework.
 * Creates a linked list based on user input and sorts the linked list.
 */
public class LinkedListApp {

    /**
     * Gets a list of string from the user.
     * Calls convertToInteger to get integer list.
     * Converts list into a Linked List and sorts in ascending order.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of Integer numbers separated by comma: ");
        String userInput = scanner.nextLine();
        List<Integer> numbers = convertToInteger(userInput);
        LinkedList<Integer> myLinkedList = new LinkedList<>(numbers);
        Collections.sort(myLinkedList);
        System.out.println("Sorted Linked list List: " + myLinkedList);
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