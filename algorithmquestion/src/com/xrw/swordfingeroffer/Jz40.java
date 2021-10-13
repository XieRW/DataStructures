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
        solution.FindNumsAppearOnce(new int[]{3, 6});
    }

    public static class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         * <p>
         * �ⷨһ����һ��Ԫ��ȥ����ԭ������ÿ��Ԫ�س��ֵĴ�����Ȼ��ȡ���г��ִ���Ϊ1��Ԫ��
         *
         * @param array int����һά����
         * @return int����һά����
         */
        public int[] FindNumsAppearOnce(int[] array) {
            // write code here
            int[] nums = new int[1000001];
            for (int i = 0; i < array.length; i++) {
                nums[array[i]]++;
            }
            int[] target = new int[2];
            int p = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    target[p] = i;
                    p++;
                }
            }
            return target;
        }

        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         * <p>
         * �ⷨ������mapȥ����ԭ������ÿ��Ԫ�س��ֵĴ�����Ȼ��ȡ���г��ִ���Ϊ1��Ԫ��
         *
         * @param array int����һά����
         * @return int����һά����
         */
        public int[] FindNumsAppearOnce2(int[] array) {
            // write code here
            Map<Integer, Integer> map = new HashMap<>(16);
            for (int i = 0; i < array.length; i++) {
                if (map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i]) + 1);
                } else {
                    map.put(array[i], 1);
                }
            }
            int[] target = new int[2];
            int p = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    target[p] = entry.getKey();
                    p++;
                }
            }
            int min = Math.min(target[0], target[1]);
            int max = Math.max(target[0], target[1]);
            target[0] = min;
            target[1] = max;
            return target;
        }

        /**
         * �ⷨ����һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
         * �ȿ�����һ�����⣬һ���������������һ������֮�⣬���������ֶ����������Σ��ǰ����е�����������������Ľ��������һ�����֡�
         * ����Ϊ���ֹ����ε�������������͵����ˣ�
         * <p>
         * �����������˵�����������ȫ�������������������Ľ���ǲ�ͬ���������������
         * Ȼ�����������������һλ1����Ϊĳһλ���������1�Ļ���˵��Ҫ������������һλ��һ����1��һ����0��
         * ��ô�Ϳ��԰�ԭ�������У���һλ��1�ķֳ�һ�飬��һλ��0�ķֳ�һ�顣
         * ��������������ÿһ���л����һ����ͬ������һ���ֳ������ε����� Ȼ���������Ϳ����ˡ�
         *
         * @param array
         * @return
         */
        public int[] FindNumsAppearOnce3(int[] array) {
            int[] ans = new int[2];
            int ans1 = 0, ans2 = 0;
            int XORsum = 0;
            for (int i = 0; i < array.length; i++) {
                XORsum ^= array[i];
            }
            int t = 1;//�ҳ���������һλ��1
            while ((XORsum & t) == 0) {
                t <<= 1;
            }
            for (int i = 0; i < array.length; i++) {
                if ((t & array[i]) == 0) {
                    ans1 ^= array[i];
                } else {
                    ans2 ^= array[i];
                }
            }
            if (ans1 < ans2) {
                ans[0] = ans1;
                ans[1] = ans2;
            } else {
                ans[0] = ans2;
                ans[1] = ans1;
            }
            return ans;
        }
    }
}
