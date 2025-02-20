import java.io.*;
import java.util.*;
public class Java_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial number of elements
        int n = scanner.nextInt();

        // Read the list elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of queries
        int q = scanner.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            String command = scanner.next();
            if (command.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (command.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        // Print the final list
        for (int num : list) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
