package com.xrw.swordfingeroffer;

import java.util.ArrayList;

/**
 * @program: DataStructures
 * @description: JZ22 �������´�ӡ������
 * https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * �������������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-29 14:11
 **/
public class Jz22 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        //˼·��������ȱ���
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            if (root == null) {
                return new ArrayList<Integer>();
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<TreeNode> node = new ArrayList<>();
            node.add(root);
            while (!node.isEmpty()) {
                arrayList.add(node.get(0).val);
                root = node.get(0);
                node.remove(0);
                if (root.left != null) {
                    node.add(root.left);
                }
                if (root.right != null) {
                    node.add(root.right);
                }
            }
            return arrayList;
        }
    }
}
