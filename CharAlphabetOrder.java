package Wipro;
import java.util.*;
public class CharAlphabetOrder {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		char a = s.next().charAt(0);
		char b = s.next().charAt(0);
		if (a < b) System.out.println(a + ", " + b);
		else System.out.println(b + ", " + a);
	}
}