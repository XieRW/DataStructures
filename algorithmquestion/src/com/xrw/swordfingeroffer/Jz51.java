package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ��ת��������
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 * ���磬��nowcoder. a am I����
 * ��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a nowcoder.����
 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 *
 * ���룺
 * "nowcoder. a am I"
 * ����ֵ��
 * "I am a nowcoder."
 * @author: л���� 1429382875@qq.com
 * @create: 2021-11-01 11:05
 **/
public class Jz51 {
    public class Solution {
        public String ReverseSentence(String str) {
            if (str==null){
                return null;
            }
            String[] strs = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = strs.length-1; i >= 0; i--) {
                sb.append(strs[i]+ " ");
            }
            return sb.toString();
        }
    }
}
