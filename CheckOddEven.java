package Wipro;
import java.util.*;
public class CheckOddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		if (n % 2 == 0) System.out.println("Even");
		else System.out.println("Odd");
	}
}