package Wipro;
import java.util.*;
public class SameLastDig {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if (a % 10 == b % 10) System.out.println(true);
		else System.out.println(false);
	}
}