package com.xrw.swordfingeroffer;

import java.util.ArrayList;

/**
 * @program: DataStructures
 * @description: JZ42 ��ΪS����������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-13 15:17
 **/
public class Jz42 {
    /**
     * �ⷨһ��˫ѭ�������ⷨ
     */
    public class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
            ArrayList<Integer> list = new ArrayList<>();
            if (array.length < 2) {
                return list;
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum) {
                        list.add(array[i]);
                        list.add(array[j]);
                        return list;
                    }
                }
            }
            return list;
        }
    }
}
