package com.xrw.swordfingeroffer;

import java.util.HashMap;

/**
 * @program: DataStructures
 * @description: JZ36 ��������ĵ�һ���������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-12 16:44
 **/
public class Jz36 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * ����һ������HasnMap������
     */
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            ListNode current1 = pHead1;
            ListNode current2 = pHead2;

            HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
            while (current1 != null) {
                hashMap.put(current1, null);
                current1 = current1.next;
            }
            while (current2 != null) {
                if (hashMap.containsKey(current2)) {
                    return current2;
                }
                current2 = current2.next;
            }

            return null;

        }
    }

    /**
     * ����2��
     */
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = getLength(current1);
        int length2 = getLength(current2);
        // ������ĳ��Ȳ�

        // �������1�ĳ��ȴ�������2�ĳ���
        if (length1 >= length2) {
            int len = length1 - length2;
            // �ȱ�������1�������ĳ��Ⱦ���������ĳ��Ȳ�
            while (len > 0) {
                current1 = current1.next;
                len--;
            }

        }
        // �������2�ĳ��ȴ�������1�ĳ���
        else if (length1 < length2) {
            int len = length2 - length1;
            // �ȱ�������1�������ĳ��Ⱦ���������ĳ��Ȳ�
            while (len > 0) {
                current2 = current2.next;
                len--;
            }

        }
        //��ʼ��ͷ������ֱ���ҵ���һ���������
        while (current1 != current2) {
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1;

    }

    /**
     * ��ָ������ĳ���
     */
    public static int getLength(ListNode pHead) {
        int length = 0;

        ListNode current = pHead;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    /**
     * ��������������ָ��ɨ�衰������������������ָ�뵽�� null ���ߵ��﹫����㡣
     */
    public ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;

        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? pHead2 : temp1.next;
            temp2 = (temp2 == null) ? pHead1 : temp2.next;
        }

        return temp1;
    }
}
