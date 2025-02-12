import java.io.*;
import java.util.*;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of lines
        List<List<Integer>> list = new ArrayList<>();

        // Reading the input lines
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // Number of elements in the current line
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                tempList.add(scanner.nextInt());
            }
            list.add(tempList);
        }

        int q = scanner.nextInt(); // Number of queries

        // Processing queries
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); // Line number
            int y = scanner.nextInt(); // Position in line

            if (x > 0 && x <= list.size() && y > 0 && y <= list.get(x - 1).size()) {
                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
