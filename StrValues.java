package Wipro;
import java.util.*;
public class StrValues {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		if (str.length() == 0) System.out.println("No Values");
		else str.replace(" ", ", ");
	}
}