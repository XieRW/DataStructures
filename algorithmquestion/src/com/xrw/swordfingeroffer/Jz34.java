package com.xrw.swordfingeroffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DataStructures
 * @description: JZ34 ��һ��ֻ����һ�ε��ַ�
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-12 09:47
 **/
public class Jz34 {

    public class Solution {
        /**
         * �ⷨһ������Map��¼ÿ���ַ����ֵĴ�����Ȼ���ҵ���һ�����ִ���Ϊ1���ַ����ڵ�λ��
         */
        public int FirstNotRepeatingChar(String str) {
            if (str == null || str.length() == 0){
                return -1;
            }
            Map<Character,Integer> map = new HashMap<>(256);
            for (int i = 0; i < str.length(); i++) {
                if (!map.keySet().contains(str.charAt(i))){
                    map.put(str.charAt(i),1);
                }else {
                     map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (map.get(str.charAt(i)) == 1){
                    return i;
                }
            }
            return -1;
        }
    }
}
