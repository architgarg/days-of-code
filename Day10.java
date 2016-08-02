// @author Archit

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rem = 0, s = 0, t = 0;


		while (n > 0) {
			rem = n % 2;
			n = n / 2;
			if (rem == 1) {
				s++;
				if (s >= t)

					t = s;

			} else {

				s = 0;
			}
		}
		System.out.println(t);
	}
}

//    public static void main(String[] args) {
//       Scanner s1 = new Scanner(System.in);
//       int N = s1.nextInt();
//
//       int remainder;
//       int count = 0;
//
//       while(N>0){
//           remainder = N%2;
//           N= N/2;
//           if(remainder==1){
//
//           }else{
//
//           }
//       }
//
//        System.out.println(count);
//    }
//
//}