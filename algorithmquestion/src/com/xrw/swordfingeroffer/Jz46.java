package com.xrw.swordfingeroffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: DataStructures
 * @description: �����������ĵ�k�����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-18 16:58
 **/
public class Jz46 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * ����һ����һ���б���������������Ȼ�󷵻ص�k��ֵ
     */
    public class Solution {
        TreeNode KthNode(TreeNode pRoot, int k) {
            if (pRoot == null || k == 0) {
                return null;
            }
            ArrayList<TreeNode> list = new ArrayList<>();
            DFS(pRoot, list);
            if (k > list.size()) {
                return null;
            }
            return list.get(k - 1);
        }

        public void DFS(TreeNode pRoot, ArrayList<TreeNode> list) {
            if (pRoot == null) {
                return;
            }
            DFS(pRoot.left, list);
            list.add(pRoot);
            DFS(pRoot.right, list);
        }

    }

    /**
     * ����ջʵ�ַǵݹ���������
     */
    public class Solution2 {
        TreeNode KthNode(TreeNode pRoot, int k) {
            if (pRoot == null || k == 0) {
                return null;
            }
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = pRoot;
            while (!stack.isEmpty() || cur != null) {
                if (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                } else {
                    cur = stack.pop();
                    if (--k == 0) {
                        return cur;
                    }
                    cur = cur.right;
                }
            }
            return null;
        }
    }
}
