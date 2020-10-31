package src;

import java.util.Objects;

/**
 * @Description
 * @Author Hanbin
 * @Date 2020/10/24
 */
public class ContainerWithWater {

         /*暴力法:遍历所有值取最大*/
        public static int maxArea(int[] height) {
            int max = 0;
            for (int i = 0; i < height.length - 1; i++) {
                for (int j = i + 1; j < height.length; j++) {
                    int heigh = height[i] > height[j] ? height[j] : height[i];
                    max = Math.max(max, heigh * (j - i));
                }
            }
            return max;
        }

    /*
            双指针法：只移动两边交短板，向中间收敛
    */
    public static int method2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left != right) {
            if (height[left] < height[right]) {
                max = Math.max(max, height[left] * (right - left));
                left++;
            } else {
                max = Math.max(max, height[right] * (right - left));
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] i = new int[]{1,8,6,2,5,4,8,3,7};
        int max = ContainerWithWater.method2(i);
        System.out.println(max);
    }
}
