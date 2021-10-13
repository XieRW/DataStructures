package com.xrw.swordfingeroffer;

import java.util.ArrayList;

/**
 * @program: DataStructures
 * @description: JZ41 ��ΪS��������������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-13 14:48
 **/
public class Jz41 {
    /**
     * ˼·��
     * ����sum=20��1��2��3��4��5��6��7��8��9��10��11��12��13��14��15
     * 1����������ָ�룬��ָ���1��ʼ����ָ���2��ʼ
     * ѭ����ʼ
     * 2����ͣ�1+2 = 3
     * 3������ж�3С��20����ָ��++��2��Ϊ3�����3+3=6��ѭ��һֱ����ָ��=6����Ϊ21��
     * 4��else if �ж�21����20����ָ��++��1��Ϊ2���ͼ�ȥ��ָ��ֵ����Ϊ21-1=20��
     * 5��else ��������һ����������   ���ٰ���ָ��++����ͣ���ʣ����ϡ�
     * ѭ������
     */
    public class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            if (sum <= 1) {
                return lists;
            }
            int left = 1, right = 2, tempSum = left + right;
            while (right <= sum / 2 + 1) {
                if (tempSum < sum) {
                    right++;
                    tempSum += right;
                } else if (tempSum > sum) {
                    tempSum -= left;
                    left++;
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i = left; i <= right; i++) {
                        list.add(i);
                    }
                    lists.add(list);
                    right++;
                    tempSum += right;
                }
            }
            return lists;
        }
    }
}
