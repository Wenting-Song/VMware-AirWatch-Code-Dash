/*
 * Jesse and Walter text each other a lot. Infact they share a lot of secrets through text. Afraid that somebody might get hold of their messages, Jesse came up with the idea of encrypting the texts.

The rules of the encryption are as follows:

1. Each lower case character in the message is replaced by it's value. The value of a -> 0, b -> 1, ... and z -> 25
2. Any character whose value is two digits, ends with a '#' after the value, so that Walter can successfully decrypt it.
3. The spaces and the full stops remain unchanged.
Given the message that Jesse is going to send Walter, can you help him to encrypt the message.

Input Format

Input consists of a single line which is the message that Jesse is going to send Walter.

Constraints

, where |s| is the length of the string. The string  consists of lowercase english alphabets, spaces and full stop.

Output Format

Print in a single line, the encrypted message.

Sample Input

jesse is the best.
Sample Output

9418#18#4 818# 19#74 1418#19#.
Explanation

The spaces and the full stops remain unchanged. 
For every alphabet, replace it with it's value and if the value is greater than 9, add a # at the end of the value. 
In the given example, the value of s -> 18, so in jesse, for each s we replace it with 18#.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
		Scanner stdin = new Scanner(System.in);
		String message = stdin.nextLine();
		StringBuilder sBuilder = new StringBuilder();
		
		for(int i=0; i<message.length();i++){
			if(message.charAt(i)==' '||message.charAt(i)=='.'){
				sBuilder.append(message.charAt(i));
				continue;
			}
			int num = message.charAt(i)-'a';
			sBuilder.append(num);
			if(num>9){
				sBuilder.append('#');
			}
		}
		System.out.println(sBuilder.toString());
    	stdin.close();
    	
    }
}
