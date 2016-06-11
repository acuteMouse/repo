package heap;

import java.util.ArrayList;
import java.util.List;

public class Intern {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		int i = 0;
		while (true) {
			String s = String.valueOf(i).intern();
			i++;
			li.add(s);
			System.out.println(i);
		}
	}
}
