package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: �������ظ�������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-11-02 16:00
 **/
public class Jz56 {


    public class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * @param numbers int����һά����
         * @return int����
         */
        public int duplicate(int[] numbers) {
            // write code here
            int[] ints = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= numbers.length || numbers[i] < 0) {
                    return -1;
                }
                if (ints[numbers[i]] != 1) {
                    ints[numbers[i]] = 1;
                } else {
                    return numbers[i];
                }
            }
            return -1;
        }
    }
}
