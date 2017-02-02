/*Leonardo found  sticks in his garden. He wants to make rectangles with the help of sticks so that he can sell all those rectangles. Price of each rectangle is  irrespective of the area of rectangle. Find the maximum amount of money Leonardo can get after selling all the rectangles.

Note: The sticks cannot be broken into smaller pieces.

Input Format

First line of input contains number of test cases .

First line of each test case contains value of , number of sticks.

Second line contains the length of each stick separated by space.

Constraints



, where  is the length of the  stick.
Output Format

For each test case print in a new line, the maximum amount Leonardo can get after selling the rectangles.

Sample Input

2
4
1 1 2 2
3
1 1 1
Sample Output

1
0
Explanation

Test Case #1: 
With the help of sticks of size  Leonardo can make  rectangle.

Test Case #2: There are only  sticks and minimum number of sticks required to make a rectangle is , so answer is .*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCases; i++) {
            int N = Integer.parseInt(input.nextLine());
            String[] nums = input.nextLine().split(" ");
            HashMap<Integer, Integer> frequencies = new HashMap<>();
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(nums[j]);
                frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
            }
            int pairs = 0;
            for (int count : frequencies.values()) {
                pairs += count / 2;
            }
            System.out.println(pairs / 2);
        }
        input.close();
    }
}
