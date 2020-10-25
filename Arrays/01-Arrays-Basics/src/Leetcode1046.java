package src;

import java.util.*;

/**
 * @Description
 * @Author Hanbin
 * @Date 2020/10/25
 */
public class Leetcode1046 {
    public static int lastStoneWeight(int[] stones) {
        List<Integer> objects = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            objects.add(stones[i]);
        }
        //如果容器中石头个数大于1就继续抵消
        while (objects.size() > 1) {
            Collections.sort(objects);
            int c = objects.size();
            int a = objects.get(objects.size()-1);
            objects.remove(objects.size()-1);
            int b = objects.get(objects.size()-1);;
            objects.remove(objects.size()-1);
            objects.add(Math.abs(a - b));
            System.out.println(objects);
        }
        if (objects.size()==0) {
            return 0;
        }
        return objects.get(0);
    }

    public static void main(String[] args) {
        int[] n = new int[]{3,1};
        lastStoneWeight(n);
    }
}
