package com.xrw.swordfingeroffer;

import java.util.ArrayList;
/**
 * @program: DataStructures
 * @description: JZ27 �ַ���������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-06 18:47
 **/
public class Jz27 {
    public class Solution {

        public ArrayList<String> PermutationHelp(StringBuilder str){
            ArrayList<String> result = new  ArrayList<String>();
            if(str.length() == 1) {
                result.add(str.toString());
            } else{
                for(int i = 0; i < str.length(); i++){
                    if(i== 0  || str.charAt(i) != str.charAt(0)){
                        char temp = str.charAt(i);
                        str.setCharAt(i, str.charAt(0));
                        str.setCharAt(0, temp);
                        ArrayList<String> newResult = PermutationHelp(new StringBuilder(str.substring(1)));
                        for(int j =0; j < newResult.size(); j++) {
                            result.add(str.substring(0,1)+newResult.get(j));
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
            return PermutationHelp(strBuilder);
        }
    }
}
