import java.io.*;
import java.util.*;

public class Day9{

    int result;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();

        Day9 day9 = new Day9();
        System.out.println(dp.factorial(N));
    }

    public  int factorial (int num){
        if(num == 0){
            return 1;
        }else{
            result = num * factorial(num-1);
            return result;
        }
    }
}