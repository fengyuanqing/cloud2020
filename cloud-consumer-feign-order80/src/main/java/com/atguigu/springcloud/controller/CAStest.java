package com.atguigu.springcloud.controller;

import java.util.concurrent.atomic.AtomicInteger;

public class CAStest {
    public static void main(String[] args) {
       /* AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,2019) + "currentData:" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(2019,2020) + "currentData:" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(6,2020) + "currentData:" + atomicInteger.get());*/


       String a = "1234";
       int b = a.length();

        for(int i =0 ; i<a.length();i++){
            System.out.println("输出i:"+ i + ",输出结果：" + a.charAt(i));
        }

    }
}
