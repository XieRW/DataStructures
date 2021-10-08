package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ11 ��������1�ĸ���
 * https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-26 10:56
 **/
public class Jz11 {
    public static class Solution {

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.NumberOf1(-1));
        }

        //�ⷨ1
        public int NumberOf1(int n) {
            int num = 0, flag = 1;
            //��Ϊjvm����ͽ�n��������洢������Ҫ���һ��
//            if (n<0){
//                n = (1<<31)|(~n + 1);
//            }
            while (flag != 0) {
                if ((flag & n) != 0) {
                    num++;
                }
                flag <<= 1;
            }
            return num;
        }

        //�ⷨ��:����˼·,����n������n&(n-1)���㣬��Ѷ����Ʊ�ʾ�����ұߵ�1��Ϊ0��
        public int NumberOf2(int n) {
            int num = 0;
            while (n != 0) {
                num++;
                n &= (n - 1);
            }
            return num;
        }
    }
}
