package com.xrw.swordfingeroffer;

import java.util.Stack;

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

        //�ⷨ����ջ
        public ListNode FindKthToTail2(ListNode pHead, int k) {
            // write code here
            if (pHead == null) {
                return null;
            }
            Stack<ListNode> stack = new Stack<>();
            while (pHead != null) {
                stack.push(pHead);
                pHead = pHead.next;
            }
            if (stack.size() < k) {
                return null;
            }
            ListNode node = new ListNode(0);
            for (int i = 0; i < k; i++) {
                ListNode temp = stack.pop();
                temp.next = node.next;
                node.next = temp;
            }
            return node.next;
        }
    }
}
