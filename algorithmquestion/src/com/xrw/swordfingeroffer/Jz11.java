package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ��ָoffer��ʮһ��
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-26 10:56
 **/
public class Jz11 {
    public static class Solution {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.NumberOf1(-1));
        }

        //�ⷨ1
        public int NumberOf1(int n) {
            int num = 0, flag = 1;
            //��Ϊjvm����ͽ�n��������洢������Ҫ���һ��
//            if (n<0){
//                n = (1<<31)|(~n + 1);
//            }
            while (flag != 0) {
                if ((flag & n) != 0) {
                    num++;
                }
                flag <<= 1;
            }
            return num;
        }


    }
}
