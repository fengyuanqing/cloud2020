package com.atguigu.springcloud.controller;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ,计算它们的和
 * @author: 冯愿青
 * @createTime: 2020年5月9日 上午10:08:15
 */
public class AdditionDemo {

    public static final String ZERO = "0";

    /**
     * 计算两个非负整数字符串的和
     * @param num1
     * @param num2
     * @return
     */
    public String add(String num1, String num2){

        //判空
        if(num1 ==null || num2 == null || num1.equals(ZERO) || num2.equals(ZERO)){
            return ZERO;
        }

        //用于记录需要取出数字的下标
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;

        //用于临时接收取得的数字
        int temp1 = 0;
        int temp2 = 0;

        //用于计算是否需要进位
        int sum = 0;

        //用于保存需要向前进一位数字
        int add = 0;

        //用来拼接字符串
        StringBuffer str = new StringBuffer();

        while( len1>=0 || len2>=0 ){
            //只要没有加完就进入循环
            temp1 = len1<0 ? 0 : num1.charAt(len1--)-'0';
            //-字符'0'是为了取出整数
            temp2 = len2<0 ? 0 : num2.charAt(len2--)-'0';
            sum = add + temp1 + temp2;
            //取出来的两个整数和进位后的数相加
            str.append(sum%10);
            //取出各位数字
            add = sum/10;
            //取出进位的数字
        }
        if(add == 1){
            str.append("1");
        }
        return str.reverse().toString();

    }

    public static void main(String[] args) {
        AdditionDemo additionDemo = new AdditionDemo();
        String result = additionDemo.add("123","12");
        System.out.println(result);

    }
}