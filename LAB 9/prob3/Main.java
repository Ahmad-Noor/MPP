package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("aaa", "bab", "aec", "add", "aee", "fff", "ggg", "hhh", "iii");
		System.out.println(countWords(words, 'a', 'e', 3));
	}

	public static int countWords(List<String> words, char c, char d, int len) {
             return (int) words.stream().filter(x -> x.length() == len && x.indexOf(c) != -1 && x.indexOf(d) == -1).count();
	     //anthor Solution
      //return (int) words.stream().filter(x -> x.length() == len && x.contains("" + c) && !x.contains("" + d)).count();

	 	

	}
}
