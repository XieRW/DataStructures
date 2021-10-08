package com.xrw.swordfingeroffer;

import java.util.Stack;

/**
 * @program: DataStructures
 * @description: JZ13 ��������˳��ʹ����λ��ż��ǰ��
 * https://www.nowcoder.com/practice/ef1f53ef31ca408cada5093c8780f44b?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-27 10:56
 **/
public class Jz13 {
    public class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * @param array int����һά����
         * @return int����һά����
         */
        public int[] reOrderArray(int[] array) {
            // write code here
            if (array.length == 0 || array.length == 1) {
                return array;
            }
            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 1) {
                    stack1.push(array[i]);
                } else {
                    stack2.push(array[i]);
                }
            }
            for (int i = array.length - 1; i >= 0; i--) {
                if (stack2.size() != 0) {
                    array[i] = stack2.pop();
                } else {
                    array[i] = stack1.pop();
                }
            }
            return array;
        }
    }
}
