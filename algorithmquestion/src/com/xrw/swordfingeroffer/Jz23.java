package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ23 �����������ĺ����������
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ������򷵻�true,���򷵻�false��
 * �������������������������ֶ�������ͬ��
 * ��ps������Լ���������Ƕ�����������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-29 14:28
 **/
public class Jz23 {
    public class Solution {
        //˼·��
        public boolean VerifySquenceOfBST(int [] sequence) {
            //��Ϊ�գ�����false
            if (sequence.length == 0){
                return false;
            }
            //�ж����Ƿ�Ϊ����������
            return helpVerify(sequence,0,sequence.length-1);
        }
        //�ж�һ�����Ƿ��Ƕ���������
        public boolean helpVerify(int [] sequence,int start ,int root){
            //���Ľڵ����С�ڻ����1������true
            if (start>=root){
                return true;
            }
            int i;
            int key = sequence[root];
            //�ҵ����������ķֽ��
            for (i=start; i < root; i++) {
                if (sequence[i]>key){
                    break;
                }
            }
            //�������������С�ڸ��ڵ��ֵ���򷵻�false
            for (int j = i; j < root; j++) {
                if (sequence[j]<key){
                    return false;
                }
            }
            //�ж����������Ƿ��Ƕ���������
            return helpVerify(sequence,start,i-1) && helpVerify(sequence,i,root-1);
        }
    }
}
