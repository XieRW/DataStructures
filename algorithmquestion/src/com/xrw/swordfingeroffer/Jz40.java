package com.xrw.swordfingeroffer;

import java.util.*;
/**
 * @program: DataStructures
 * @description: JZ40 ������ֻ����һ�ε���������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-13 14:11
 **/
public class Jz40 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.FindNumsAppearOnce(new int[]{3,6});
    }

    public static class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * �ⷨһ����һ��Ԫ��ȥ����ԭ������ÿ��Ԫ�س��ֵĴ�����Ȼ��ȡ���г��ִ���Ϊ1��Ԫ��
         *
         * @param array int����һά����
         * @return int����һά����
         */
        public int[] FindNumsAppearOnce (int[] array) {
            // write code here
            int[] nums = new int[1000001];
            for (int i = 0; i < array.length; i++) {
                nums[array[i]]++;
            }
            int[] target = new int[2];
            int p = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==1){
                    target[p] = i;
                    p++;
                }
            }
            return target;
        }

        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * �ⷨ������mapȥ����ԭ������ÿ��Ԫ�س��ֵĴ�����Ȼ��ȡ���г��ִ���Ϊ1��Ԫ��
         *
         * @param array int����һά����
         * @return int����һά����
         */
        public int[] FindNumsAppearOnce2 (int[] array) {
            // write code here
            Map<Integer,Integer> map = new HashMap<>(16);
            for (int i = 0; i < array.length; i++) {
                if (map.containsKey(array[i])){
                    map.put(array[i],map.get(array[i])+1);
                }else {
                    map.put(array[i],1);
                }
            }
            int[] target = new int[2];
            int p = 0;
            for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
                if (entry.getValue() == 1){
                    target[p] = entry.getKey();
                    p++;
                }
            }
            int min = Math.min(target[0],target[1]);
            int max = Math.max(target[0],target[1]);
            target[0] = min;
            target[1] = max;
            return target;
        }
    }
}
