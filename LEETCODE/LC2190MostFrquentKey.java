import java.util.*;
public class LC2190MostFrquentKey{
    public static int mostFrequent(ArrayList<Integer> nums, int key) {

        int[] freq = new int[1000];

        // Count frequencies of numbers appearing after key
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                freq[nums.get(i + 1) - 1]++;
            }
        }

        int maxFreq = 0;
        int answer = 0;

        // Find number with maximum frequency
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                answer = i + 1;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        // Sample Input 1
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 100, 200, 1, 100));

        int key = 1;

        System.out.println("Answer = " + mostFrequent(list, key));
    }
}