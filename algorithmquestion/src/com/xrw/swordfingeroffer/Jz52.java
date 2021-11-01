package com.xrw.swordfingeroffer;

import java.util.*;
/**
 * @program: DataStructures
 * @description: �������ڵ����ֵ
 * @author: л���� 1429382875@qq.com
 * @create: 2021-11-01 11:18
 **/
public class Jz52 {
    /**
     * ��һ�ַ����������ݹ�
     */
    public class Solution {
        public ArrayList<Integer> maxInWindows(int [] num, int size) {
            ArrayList<Integer> list = new ArrayList<>();
            if (size==0 || size>num.length){
                return list;
            }
            for (int i = 0; i <= num.length-size; i++) {
                int[] ints = Arrays.copyOfRange(num, i, size + i);
                Arrays.sort(ints);
                list.add(ints[ints.length-1]);
            }
            return list;
        }
    }
    /**
     * �ڶ��ַ�����˫�˶���
     * ���������ÿһ��Ԫ�أ�
     * �������Ϊ�գ���ֱ�ӽ���ǰԪ�ؼ��뵽�����С�
     * ���������Ϊ�գ����õ�ǰԪ�غ����������һ��Ԫ�رȽϣ�������ڣ������������һ��Ԫ��ɾ����Ȼ���������ǰԪ�غ����������һ��Ԫ�رȽ�
     * �����ǰԪ��С�����������һ��Ԫ�أ���ֱ�ӽ���ǰԪ�ؼ��뵽������ĩβ
     * �������ͷ����Ԫ���Ѿ������ڵ�ǰ���ڵı߽磬��Ӧ�ý�ͷ��Ԫ��ɾ��
     */
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (size==0 || size>num.length){
            return list;
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i <= num.length; i++) {
            while (!deque.isEmpty() && num[deque.peekLast()]<num[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if (deque.peekFirst()+size<=i){
                deque.pollFirst();
            }
            if (i+1>=size){
                list.add(num[deque.peekFirst()]);
            }
        }
        return list;
    }
}
