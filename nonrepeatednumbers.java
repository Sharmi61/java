import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class nonrepeatednumbers {
	public static void main(String args[]) {
		int s = 252500, t = 0, c = 0;
		ArrayList<Integer> al = new ArrayList<>();
		TreeSet<Integer> al1 = new TreeSet<>();
		int i = 0;
		while (s > 0) {
			t = s % 10;
			al.add(t);
			s = s / 10;
		}
		for (i = 0; i < 9; i++) {
			c = Collections.frequency(al, i);
			if (c > 1) {
				al1.add(i);
			}
		}
		System.out.println("max=" + al1);
	}
}
