package com.xrw.swordfingeroffer;

import java.util.ArrayList;

/**
 * @program: DataStructures
 * @description: JZ24 �������к�Ϊĳһֵ��·��
 * ����һ�Ŷ������ĸ��ڵ��һ�����������ֵ����ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-29 15:23
 **/
public class Jz24 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * �ⷨһ�����ݷ���ÿ���ҵ�Ҷ�ӽڵ���·��������Ҫ��ʱ�����һ��·��list��������У�Ȼ��ͨ�����ݣ��Ѵ�·�������Ľڵ���ӽ�ȥ
     */
    public class Solution {
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            if (root == null) {
                return lists;
            }
            helpFindPath(root, target, 0, lists);
            return lists;
        }

        public void helpFindPath(TreeNode root, int target, int now, ArrayList<ArrayList<Integer>> lists) {
            now += root.val;
            ArrayList<Integer> list = new ArrayList<>();
            if (now > target) {
                return;
            }
            if (root.left == null && root.right == null) {
                if (now == target) {
                    list.add(root.val);
                    lists.add(list);
                }
                return;
            }
            if (root.left != null) {
                helpFindPath(root.left, target, now, lists);

            }
            if (root.right != null) {
                helpFindPath(root.right, target, now, lists);
            }
            if (!lists.isEmpty()) {
                for (int i = 0; i < lists.size(); i++) {
                    lists.get(i).add(0, root.val);
                }
            }
        }
    }

    /**
     * �ⷨ�����ݹ���·��������֮����ӵ��������
     */
    public class Solution2 {
        private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        private ArrayList<Integer> list = new ArrayList<>();

        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            if (root == null) return result;
            list.add(root.val);
            target -= root.val;
            if (target == 0 && root.left == null && root.right == null) {
                result.add(new ArrayList<Integer>(list));
            }
            ArrayList<ArrayList<Integer>> result1 = FindPath(root.left, target);
            ArrayList<ArrayList<Integer>> result2 = FindPath(root.right, target);
            list.remove(list.size() - 1);
            return result;
        }
    }
}
