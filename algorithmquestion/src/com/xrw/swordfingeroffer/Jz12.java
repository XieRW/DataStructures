package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ��ָoffer��ʮ����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-27 10:06
 **/
public class Jz12 {
    public class Solution {
        public double Power(double base, int exponent) {
            if (base == 0) {
                return 0;
            }
            if (exponent == 0) {
                return 1;
            }
            double sum = 1;
            for (int i = 0; i < Math.abs(exponent); i++) {
                sum *= base;
            }
            if (exponent < 0) {
                sum = 1 / sum;
            }
            return sum;
        }
    }
}
