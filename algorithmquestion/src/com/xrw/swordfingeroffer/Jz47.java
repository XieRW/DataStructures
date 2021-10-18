package com.xrw.swordfingeroffer;

import java.util.ArrayList;

/**
 * @program: DataStructures
 * @description: ����������һ�����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-18 17:47
 **/
public class Jz47 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    /**
     * ��Ȼ���˶�������ĳ����㣬�Ҷ������洢��ָ�򸸽���ָ�루next���������ǿ������ҵ����ڵ㣬�ٶ���������������������������������ҵ�����������һ���
     */
    public static class Solution {
        static ArrayList<TreeLinkNode> list = new ArrayList<>();

        public TreeLinkNode GetNext(TreeLinkNode pNode) {
            if (pNode == null) {
                return null;
            }
            TreeLinkNode par = pNode;
            while (par.next != null) {
                par = par.next;
            }
            midOrder(par);
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) == pNode) {
                    return list.get(i + 1);
                }
            }
            return null;
        }

        /**
         * �������
         * @param node
         */
        public void midOrder(TreeLinkNode node) {
            if (node != null) {
                midOrder(node.left);
                list.add(node);
                midOrder(node.right);
            }
        }
    }
}
