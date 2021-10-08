package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ28 �����г��ִ�������һ�������
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-08 10:29
 **/
public class Jz28 {
    /**
     * ��preValue��¼��һ�η��ʵ�ֵ��count������ǰֵ���ֵĴ�����
     * �����һ��ֵ�͵�ǰֵ��ͬ��ôcount++�������ͬcount--��
     * ����0��ʱ���Ҫ�����µ�preValueֵ�ˣ�
     * ��Ϊ������ڳ������鳤��һ���ֵ����ô���preValueһ�����Ǹ�ֵ
     */
    public class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            if (array.length == 0){
                return 0;
            }
            int count = 1;
            int preValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] == preValue){
                    count++;
                }else {
                    count--;
                    if (count == 0){
                        preValue = array[i];
                        count = 1;
                    }
                }
            }

            //�ж����������Ƿ񳬹�һ��
            int num = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == preValue){
                    num++;
                }
            }
            return (num>array.length/2)?preValue:0;
        }
    }
}
