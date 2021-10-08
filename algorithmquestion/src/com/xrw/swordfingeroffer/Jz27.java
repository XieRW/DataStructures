package com.xrw.swordfingeroffer;

import java.util.ArrayList;
/**
 * @program: DataStructures
 * @description: JZ27 字符串的排列
 * @author: 谢荣旺 1429382875@qq.com
 * @create: 2021-10-06 18:47
 **/
public class Jz27 {
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
                        //用完还是要放回去的
                        temp = str.charAt(0);
                        str.setCharAt(0, str.charAt(i));
                        str.setCharAt(i, temp);
                    }
                }
                //需要在做一个排序操作

            }
            return result;
        }

        public ArrayList<String> Permutation(String str) {
            StringBuilder strBuilder = new StringBuilder(str);
            return permutationHelp(strBuilder);
        }
    }
}
