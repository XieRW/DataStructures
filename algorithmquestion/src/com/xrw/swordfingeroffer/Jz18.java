package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ18 �������ľ���
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-28 11:19
 **/
public class Jz18 {

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
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * @param pRoot TreeNode��
         * @return TreeNode��
         */
        public TreeNode Mirror(TreeNode pRoot) {
            // write code here
            if (pRoot == null) {
                return pRoot;
            }
            TreeNode temp = pRoot.left;
            pRoot.left = Mirror(pRoot.right);
            pRoot.right = Mirror(temp);
            return pRoot;

        }
    }
}
