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


}
