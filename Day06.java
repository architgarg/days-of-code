import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {

        String evenString = new String();
        String oddString = new String();

        Scanner s1 = new Scanner(System.in);
        int T = s1.nextInt();
        s1.nextLine();

        String[] strs = new String[T];

        for (int i = 0; i < T; i++) {
            strs[i] = s1.nextLine();
        }

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < (strs[i].length()); j += 2) {
                evenString = evenString + strs[i].charAt(j);
            }

            for (int j = 1; j < (strs[i].length()); j += 2) {
                oddString = oddString + strs[i].charAt(j);
            }
            System.out.println(evenString + " " + oddString);
            evenString = "";
            oddString = "";
        }
    }
}
