package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "StringSalsa";

		int n = s.length();
		int l = 0, r = 0;
		HashSet<Character> visited = new HashSet<>();
		int maxStr = 0;
		int maxL = 0, maxR = 0;
		while (r < n) {
			if (!visited.contains(s.charAt(r))) {
				visited.add(s.charAt(r));
				//System.out.println(visited);
				if (r - l + 1 > maxStr) {
					maxStr = r - l + 1;
					maxL = l;
					maxR = r;
				}
				r++;
			}
			else {
				visited.remove(s.charAt(l));

				l++;
			}
		}
		for (int i = maxL; i <= maxR; i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}


}


