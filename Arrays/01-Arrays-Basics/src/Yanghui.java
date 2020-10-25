package src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Hanbin
 * @Date 2020/10/25
 */
public class Yanghui {
    /*递归*/
    public static List<List<Integer>> method(int num) {
        List<List<Integer>> lists = new ArrayList<>();
        if (num == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            lists.add(list);
            System.out.println(list);
            return lists;
        }
        lists=method(num - 1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < num - 1; i++) {
            row.add(lists.get(num - 2).get(i-1) + lists.get(num - 2).get(i));
        }
        row.add(1);
       lists.add(row);
        System.out.println(row);
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> test = method(10);
    }

}
