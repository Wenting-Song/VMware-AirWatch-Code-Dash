/*
 * Input Format

The first line contains an integer . Then  lines follows. 
Each line contains two strings and an integer, the English word, the corresponding Khalani word 
and the weight of the Khalani word.
 Note that the same Khalani word has different weights when translated from different English words.
  It is guaranteed the all weights are unique and there can be different English words translated to the same Khalani word 
  but the same English word cannot be translated to different Khalani words.

The next line contains an integer , and then  strings follows which are words in an English sentence. 
It's guaranteed that words in the English sentence are distinct.

Constraints


The weights of Khalani words are in range .
Each word contains at most  characters.
Output Format

The translated Khalani sentence of words separated by a space.

Sample Input

4
i o 5
me o 7
your shiel 2
presence sharas 3
4 i feel your presence
Sample Output

o sharas shiel
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	static class Translation {
		String word;
		int value;

		public Translation(String word, int value) {
			this.word = word;
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = Integer.parseInt(stdin.nextLine());
		HashMap<String, Translation> mapping = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] line = stdin.nextLine().split(" ");
			String eng = line[0], kha = line[1];
			int weight = Integer.parseInt(line[2]);
			mapping.put(eng, new Translation(kha, weight));
		}
		String[] line = stdin.nextLine().split(" ");
		int m = Integer.parseInt(line[0]);
		ArrayList<Translation> sentence = new ArrayList<>();
		for (int i = 1; i <= m; i++) {
			if (mapping.containsKey(line[i])) {
				sentence.add(mapping.get(line[i]));
			}
		}
		Collections.sort(sentence, new Comparator<Translation>() {
			@Override
			public int compare(Translation o1, Translation o2) {
				return o2.value - o1.value;
			}
		});
		/*
		 * public int compareTo(Translation o) { return this.value - o.value ; }
		 */
		for (Translation translation : sentence) {
			System.out.print(translation.word + " ");
		}
		stdin.close();
	}
}
