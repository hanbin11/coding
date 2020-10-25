package src;

import java.util.Arrays;
/**
 * @Description
 * @Author Hanbin
 * @Date 2020/10/25
 */
public class Leetcode621 {
        //找个数最做的任务先安排最短时间，如果有个数相同的最短时间加1
        public static int leastInterval(char[] tasks, int n) {

            int[] counts = new int[26];
            for (int i = 0; i < tasks.length; i++) {
                counts[tasks[i] - 'A'] = counts[tasks[i] - 'A'] + 1;
            }
            Arrays.sort(counts);
            int max = counts[counts.length-1];
            int time = (max - 1) * (n + 1) + 1;
            int i = counts.length-2;
            while (i >= 0 && counts[i] == max) {
                time++;
                i--;
            }
            return Math.max(time,tasks.length);
        }

    public static void main(String[] args) {

        char[] tasks = new char[]{'A','A','B','B'};

        int i = leastInterval(tasks, 2);
        System.out.println();
    }
}
