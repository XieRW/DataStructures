package com.xrw.swordfingeroffer;

import java.util.*;

/**
 * @program: DataStructures
 * @description: �Ѷ�������ӡ�ɶ���
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-26 23:19
 **/
public class Jz49 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * ά��һ�����У�ÿ��ֻ���浱ǰ��Ľ��
     * ͨ����������ָ�룬��ÿһ��ı�������ָ���������ָ�룬ͬʱ�ռ����
     * ��ÿ����㣬������ӽڵ㣬��˳����������ӽڵ㵽���У�Ϊ��һ�������׼��
     */
    public class Solution {
        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if (pRoot == null) {
                return res;
            }
            // ����ÿ��ֻ���浱ǰ��Ľ��
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(pRoot);
            while (!queue.isEmpty()) {
                ArrayList<Integer> list = new ArrayList<>();
                // loΪÿһ�����߽��ָ�룬hiΪ�ұ߽��ָ��
                int lo = 0, hi = queue.size();
                // �����Ұ�˳�������ǰ���ÿһ���ڵ�
                while (lo++ < hi) {
                    TreeNode node = queue.poll();
                    // �ռ���ǰ��ÿһ������ֵ
                    if (node != null) {
                        list.add(node.val);
                    }
                    // ��˳����������ӽڵ㣬Ϊ��һ�������׼��
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                // �ռ���ǰ��Ľ����
                res.add(list);
            }
            return res;
        }
    }
}
