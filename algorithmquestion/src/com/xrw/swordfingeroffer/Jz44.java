package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ɾ���������ظ��Ľ��
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-18 15:46
 **/
public class Jz44 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * ˼·������һ���µ�ͷ��㣬����ԭ����������ظ��ģ��ҵ���Щ�ظ�Ԫ�أ�Ȼ��ɾ������󷵻��µ�ͷ����next
     */
    public class Solution {
        public ListNode deleteDuplication(ListNode pHead) {
            ListNode head = new ListNode(0);
            head.next = pHead;
            ListNode temp = head;
            while (pHead!=null){
                if (pHead.next!=null&&pHead.val == pHead.next.val){
                    pHead=pHead.next;
                    while (pHead.next!=null&&pHead.val == pHead.next.val){
                        pHead=pHead.next;
                    }
                    temp.next = pHead.next;
                }else {
                    temp = temp.next;
                }
                pHead = pHead.next;
            }
            return head.next;
        }
    }
}
