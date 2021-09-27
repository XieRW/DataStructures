package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ��ָoffer��ʮ����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-27 11:16
 **/
public class Jz14 {

    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * @param pHead ListNode��
         * @param k     int����
         * @return ListNode��
         */
        //�ⷨһ��˫ָ�뷨
        public ListNode FindKthToTail(ListNode pHead, int k) {
            // write code here
            if (pHead == null) {
                return pHead;
            }
            ListNode first = pHead;
            for (int i = 0; i < k; i++) {
                if (first == null) {
                    return null;
                }
                first = first.next;
            }
            ListNode last = pHead;
            while (first != null) {
                first = first.next;
                last = last.next;
            }
            return last;
        }
    }
}
