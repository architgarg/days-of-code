import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();

        int[] array = new int[N];
        for (int i = 0 ; i < N ; i++) {
            array[i] = s1.nextInt();
        }

        for (int i = N - 1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}