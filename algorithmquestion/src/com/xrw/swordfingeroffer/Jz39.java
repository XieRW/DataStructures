package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ39 ƽ�������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-13 10:46
 **/
public class Jz39 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        /**
         * ˼·������ڵ�����������Ƿ���Ȳ�С�ڵ���1������������������������������Ȳ�С�ڵ���1���ݹ����
         * @param root
         * @return
         */
        public boolean IsBalanced_Solution(TreeNode root) {
            if (root == null){
                return true;
            }
            return Math.abs(deep(root.left)-deep(root.right))<=1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }

        /**
         * ��ڵ����
         * @param root
         * @return
         */
        public int deep(TreeNode root){
            if (root == null){
                return 0;
            }
            return Math.max(deep(root.left),deep(root.right))+1;
        }
    }
}
