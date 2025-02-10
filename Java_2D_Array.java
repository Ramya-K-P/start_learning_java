import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_2D_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(arrRowTempItems[j]);
            }
        }

        bufferedReader.close();
        
        System.out.println(findMaxHourglassSum(arr));
    }

    public static int findMaxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        return maxSum;
    }
}
