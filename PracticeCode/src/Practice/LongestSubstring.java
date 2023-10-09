package Practice;

import java.util.LinkedHashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		longestSubstring("StringSalsa");
			}
	static void longestSubstring(String inputString) {
		char[] arr1 = inputString.toCharArray();
		String long_str = null;
		int str_length = 0;
		LinkedHashMap < Character, Integer >m1 = new LinkedHashMap < Character, Integer >();
		for (int i = 0; i < arr1.length; i++) {
			char ch = arr1[i];
			if (!m1.containsKey(ch)) {
				m1.put(ch, i);
			} else {
				i = m1.get(ch);
				m1.clear();
			}
			if (m1.size() > str_length) {
				str_length = m1.size();
				long_str = m1.keySet().toString();
			}
		}
		System.out.println("Input String : " + inputString);
		System.out.println("The longest substring : " + long_str);
		System.out.println("The longest Substring Length : " + str_length);
		for (int i = 0; i <long_str.length(); i++) {
			System.out.print(long_str.charAt(i));
		}
		System.out.println();
	}


}


