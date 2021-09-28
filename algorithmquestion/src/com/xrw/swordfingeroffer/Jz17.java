package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ��ָoffer��ʮ���� �����ӽṹ
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * ���룺{8,8,#,9,#,2,#,5},{8,9,#,2}
 * �����true
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-28 10:13
 **/
public class Jz17 {
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    /**
     * ˼·����дһ���ж��������ṹ�Ƿ�һ���ķ���A��Ȼ���ڷ���B�б���root1��ÿ���ڵ㣬����A������������û��һ���ڵ�����ṹ��root2һ��
     */
    public class Solution {
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if (root1 == null || root2 == null){
                return false;
            }

            return doesTree1HasTree2(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        }

        public boolean doesTree1HasTree2(TreeNode root1,TreeNode root2){
            if (root2 == null){
                return true;
            }
            if (root1 == null){
                return false;
            }
            if (root1.val != root2.val){
                return false;
            }
            return doesTree1HasTree2(root1.left,root2.left) && doesTree1HasTree2(root1.right,root2.right);
        }
    }
}
