package com.xrw.swordfingeroffer;

import java.util.*;

/**
 * @program: DataStructures
 * @description: �����е�·��
 * @author: л���� 1429382875@qq.com
 * @create: 2021-11-02 14:08
 **/
public class Jz54 {

    public class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * @param matrix char�ַ��Ͷ�ά����
         * @param word   string�ַ���
         * @return bool������
         */
        public boolean hasPath(char[][] matrix, String word) {
            // write code here
            if (matrix.length == 0 || matrix[0].length == 0 || word.length() > matrix.length * matrix[0].length) {
                return false;
            }
            int[][] a = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == word.charAt(0)) {
                        if (hasPathHelp(a, matrix, word, i, j, 0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public boolean hasPathHelp(int[][] a, char[][] matrix, String word, int i, int j, int k) {
            if (k == word.length() || matrix[i][j] != word.charAt(k) || a[i][j] == 1) {
                return false;
            }
            if (k == word.length() - 1) {
                return true;
            }
            a[i][j] = 1;
            if (i - 1 >= 0) {
                if (hasPathHelp(a, matrix, word, i - 1, j, k + 1)) {
                    return true;
                }
            }
            if (i + 1 < matrix.length) {
                if (hasPathHelp(a, matrix, word, i + 1, j, k + 1)) {
                    return true;
                }
            }
            if (j - 1 >= 0) {
                if (hasPathHelp(a, matrix, word, i, j - 1, k + 1)) {
                    return true;
                }
            }
            if (j + 1 < matrix[0].length) {
                if (hasPathHelp(a, matrix, word, i, j + 1, k + 1)) {
                    return true;
                }
            }
            //���ݣ����f(k+1)Ϊfalse�����·��ͨ�������ʼ�¼��Ϊ0
            a[i][j] = 0;
            return false;
        }
    }
}
