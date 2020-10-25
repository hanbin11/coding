/**
 * @Description
 * @Author Hanbin
 * @Date 2020/10/25
 */
public class CreateStack {


    int[] list;
    int num;

    public CreateStack(int maxSize) {
        list = new int[maxSize];
        num = 0;

    }

    public void push(int x) {

        if (num == list.length) {
            return;
        }
        list[num] = x;
        num++;

    }

    public int pop() {

        if (num == 0) {
            return -1;
        }
        num = num - 1;
        return list[num];
    }

    public void increment(int k, int val) {

        //选较小的
        int n = k > num ? num : k;
        for (int i = 0; i < n; i++) {
            list[i] += val;
        }

    }
}
