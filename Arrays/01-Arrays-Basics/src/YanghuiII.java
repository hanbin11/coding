package src;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Hanbin
 * @Date 2020/10/25
 */
public class YanghuiII {


    public static List<Integer> method(int num) {
       List<List<Integer>> lists=Yang(num+1);
        return lists.get(num);
    }
    public static List<List<Integer>> Yang(int num) {
        List<List<Integer>> lists = new ArrayList<>();
        if (num == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            lists.add(list);
            return lists;
        }
        lists=Yang(num - 1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < num - 1; i++) {
            row.add(lists.get(num - 2).get(i-1) + lists.get(num - 2).get(i));
        }
        row.add(1);
        lists.add(row);
        return lists;
    }

    public static void main(String[] args) {
        List<Integer> test = method(3);
        System.out.println(test);
    }
}
