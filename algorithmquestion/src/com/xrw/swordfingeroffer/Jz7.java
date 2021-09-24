package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: 剑指offer第七题
 * @author: 谢荣旺 1429382875@qq.com
 * @create: 2021-09-24 09:17
 **/
public class Jz7 {
    public class Solution {
        //解法一
        public int Fibonacci(int n) {
            if (n<=0){
                return 0;
            }
            if (n==2||n==1){
                return 1;
            }
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
        //解法二
        public int Fibonacci2(int n){
            int a=0,b=1;
            for (int i = 1; i <= n; i++) {
                a=a+b;
                b=a-b;
            }
            return a;
        }
    }
}
