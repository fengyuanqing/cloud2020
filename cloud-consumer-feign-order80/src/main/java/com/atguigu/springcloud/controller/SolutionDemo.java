package com.atguigu.springcloud.controller;


import java.util.Arrays;

public class SolutionDemo {
    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * <p>
     * 示例 1:
     *         输入: 
     *                 [1,2,3,4,5,6,7] 和 k = 3
     *         输出: 
     *                 [5,6,7,1,2,3,4]
     *         解释:
     *                 向右旋转 1 步: [7,1,2,3,4,5,6]
     *                 向右旋转 2 步: [6,7,1,2,3,4,5]
     *                 向右旋转 3 步: [5,6,7,1,2,3,4]
     * <p>
     * 示例 2:
     *         输入:
     *                  [-1,-100,3,99] 和 k = 2
     *         输出: 
     *                  [3,99,-1,-100]
     *         解释: 
     *                 向右旋转 1 步: [99,-1,-100,3]
     *                 向右旋转 2 步: [3,99,-1,-100]
     */

    public int[] numArr(int[] nums, int k) {
        //1.输入[1,2,3,4,5,6,7] 和 k = 3

        //2.右旋转
        int length = nums.length;
        // 假设移动的位数是newk,那么无论是向右还是向左移动newk+n*length个位置之后,移动到还是原来的位置
        int newk = k % length;
        System.out.println("newk:" + newk);
        int temp = 0;
        for (int i = 0; i < newk; i++) {
            // 这个temp保存的是这个数组的一个元素
            temp = nums[length - 1];
            for (int j = length - 2; j >= 0; j--) {
                // 让后一个元素等于前面的元素,相当于后面的元素是被前面的元素覆盖了
                nums[j + 1] = nums[j];
                System.out.println("nums[j + 1]:" + nums[j + 1] +  "》》》》" + i + "<<<<<" + newk);
            }
            // 第一个元素在每一个循环结束之后就要把之前的临时变量填充后进去
            // 因为临时变量保存的是每一次的最后一个位置的元素
            nums[0] = temp;
            System.out.println(" nums[0]:"+  nums[0] + "======================");
        }
        return nums;
    }
    public static void main(String[] args) {
        SolutionDemo demo = new SolutionDemo();
        int [] nums1 = {1,2,3,4,5,6,7};
        int k = 3;
        int[] b = demo.numArr(nums1,k);
        System.out.println(Arrays.toString(b));
    }
}
