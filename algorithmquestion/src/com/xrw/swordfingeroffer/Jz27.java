package com.xrw.swordfingeroffer;

import java.util.ArrayList;
/**
 * @program: DataStructures
 * @description: JZ27 �ַ���������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-06 18:47
 **/
public class Jz27 {
    /**
     * ����Ľ��˼·�ǣ�
     * ��������Ϊa��b��c
     * ��ô��ʵ�����������
     * fun��a��b��c��=a��fun��b��c����+ a��b������fun��a��c����+a��c������fun��b��a����
     * fun��b��c�� = b+fun��c��+b��c������fun��b����
     * fun��c��=1
     * �����õݹ�ķ����Ϳ����ˣ�����������ݹ�Ĺ����У���û������һЩ�˷�����ʱ������飬ÿһ���ݹ鶼������µĽ��������õݹ����������Ϊ��̬�滮�Ĵ��⣬�Ǻ���ġ�
     * ������Ŀ��˵�����ܴ����ظ����ַ�������ڽ��н�����ʱ����Ҫ�жϽ��н������ַ��Ƿ���ȣ������Ⱦ�û�б�Ҫ�����ˡ�
     */
    public static class Solution {

        public ArrayList<String> permutationHelp(StringBuilder str){
            ArrayList<String> result = new  ArrayList<String>();
            if(str.length() == 1) {
                result.add(str.toString());
            } else{
                for(int i = 0; i < str.length(); i++){
                    if(i== 0  || str.charAt(i) != str.charAt(0)){
                        char temp = str.charAt(i);
                        str.setCharAt(i, str.charAt(0));
                        str.setCharAt(0, temp);
                        ArrayList<String> newResult = permutationHelp(new StringBuilder(str.substring(1)));
                        for (String s : newResult) {
                            result.add(str.substring(0, 1) + s);
                        }
                        //���껹��Ҫ�Ż�ȥ��
                        temp = str.charAt(0);
                        str.setCharAt(0, str.charAt(i));
                        str.setCharAt(i, temp);
                    }
                }
                //��Ҫ����һ���������

            }
            return result;
        }

        public ArrayList<String> Permutation(String str) {
            StringBuilder strBuilder = new StringBuilder(str);
            return permutationHelp(strBuilder);
        }
    }
}
