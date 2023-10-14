/*Name: Jyoti Prakash Tripathy
 * Regd_no: 2241020031
 * Problem_stmt_link:https://cses.fi/problemset/task/1068
 */
import java.util.Scanner;
public class Q1_1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		//As some of the output values exceed the data-type integer length i.e -2^(32-1) 
		 // to 2^(32-1)-1 so we have to take long as the data type to get correct answer
		System.out.print(n);
		while(n>1) {
			//for the condition n!=1 we are getting negative output values
			if(n%2==0) {
				n=n/2;
			}
			else {
				n=(n*3)+1;
			}
			System.out.print(" "+n);
			
		}
	}
}
