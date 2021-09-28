package com.xrw.swordfingeroffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DataStructures
 * @description: JZ19 ˳ʱ���ӡ����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-28 14:30
 **/
public class Jz19 {

    public class Solution {
        /**
         * ����˵�����ǲ��ϵ���������ı߽�
         * �����ĸ���������Χ��up��down��left��right
         *
         * �����ߴ������е�ֵ��������󣬸�����Ҳ���ᱻ�����������ϱ߽�� up ��һ��ͬʱ�ж��Ƿ�ʹ����±߽�� down ����
         * �����ߴ������е�ֵ��������󣬸�����Ҳ���ᱻ�����������ұ߽�� right ��һ��ͬʱ�ж��Ƿ�ʹ�����߽�� left ����
         * �����ߴ������е�ֵ��������󣬸�����Ҳ���ᱻ�����������±߽�� down ��һ��ͬʱ�ж��Ƿ�ʹ����ϱ߽�� up ����
         * �����ߴ������е�ֵ��������󣬸�����Ҳ���ᱻ������������߽�� left ��һ��ͬʱ�ж��Ƿ�ʹ����ұ߽�� right ����
         * @param matrix ����
         * @return
         */
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> list = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length== 0){
                return list;
            }
            int up = 0;
            int right = matrix[0].length-1;
            int down = matrix.length-1;
            int left = 0;
            while (true){
                for (int i = left; i <= right; i++) {
                    list.add(matrix[up][i]);
                }
                up++;
                if (up > down){
                    break;
                }
                for (int i = up; i <=down ; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                if (right < left){
                    break;
                }
                for (int i = right; i >=left ; i--) {
                    list.add(matrix[down][i]);
                }
                down--;
                if (down<up){
                    break;
                }
                for (int i = down; i >=up ; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                if (left>right){
                    break;
                }
            }
            return list;
        }
    }
}
