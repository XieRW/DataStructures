package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: ������ʽƥ��
 * https://www.nowcoder.com/practice/28970c15befb4ff3a264189087b99ad4?tpId=13&tqId=1375406&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: л���� 1429382875@qq.com
 * @create: 2021-11-02 13:43
 **/
public class Jz53 {
    /**
     * ��������Ϊ str��ģʽ��Ϊ pattern �����һ����������Ҫ��ע���������ַ������� str �ĳ���Ϊ n ��pattern�ĳ���Ϊ m ����ע������ʽ pattern�����һ���ַ���˭���������ֿ��ܣ������ַ���'*' �� '.'���㣩�������������������ۼ��ɣ����£�
     * 1����� pattern�����һ���ַ��������ַ����Ǿ��ǿ�str[n?1] �Ƿ���� pattern[m?1]�������str [0..n?2]�� pattern [0..m?2]���������ǲ���ƥ�䣬����������⡣
     * 2����� pattern �����һ���ַ��� ��.��������ƥ�������ַ���ֱ�ӿ� str [0..n?2]�� pattern [0..m?2]
     * 3����� pattern �����һ���ַ��ǡ�*���������� pattern[m-2]=c �����ظ�0�λ��Σ�������һ������ c*
     * ���һ��str[n-1] �� 0 �� c��pattern��������ַ����ˣ��ܷ�ƥ��ȡ���� str [0..n?1]�� pattern [0..m?3]�Ƿ�ƥ��
     * �������str[n-1] �Ƕ�� c �е����һ��������������� str[n-1]=c ���� c='.'��������str ƥ������ǰŲһ����pattern  ����ƥ�䣬��Ϊ����ƥ������������str[0..n?2]�� pattern[0..m?1]�Ƿ�ƥ�䡣
     * <p>
     * ת�Ʒ���
     * f[i][j] ���� str ��ǰ i ���� pattern ��ǰ j ���ܷ�ƥ��
     * ����ǰ��������������Ժϲ���һ����� f[i][j]=f[i?1][j?1]
     * ���ڵ�������������� c* ��Ϊ���Ͳ����������
     * ������ֱ�ӿ�������pattern �ĺ��������� f[i][j]=f[i][j?2]
     * ��������pattern ����������strǰ��һ����f[i][j]=f[i?1][j]
     * <p>
     * ��ʼ����
     * ���У���Ҫ���ǿմ�������
     * �մ��Ϳ�������ƥ��ģ�f[0][0]=true
     * �մ��ͷǿ����򣬲���ֱ�Ӷ��� true �� false������Ҫ���������������str= '' '' ,pattern=a*b*c*��
     * �ǿմ��Ϳ�����ز�ƥ�䣬f[1][0]=...=f[n][0]=false
     * �ǿմ��ͷǿ������ǿ϶�����Ҫ������ˡ�
     * �����Ͽ��Է�Ϊ������ͷǿ��������֣�������Ҳ�ǱȽϺô���ģ��Էǿ��������ǿ϶���Ҫ���㣬�ǿ���������������ǰ�����ֿ��Ժϲ���һ�����ۣ�����������ǵ���һ�֣���ôҲ���Ƿ�Ϊ��ǰλ���� '*' �Ͳ��� '*' ��������ˡ�
     * ���
     * ���ǿ�����Ҫ�� n+1 ���������ڿմ��Ĵ���ʮ�ַ��㡣������� f[n][m]
     */
    public class Solution {
        /**
         * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
         *
         * @param str     string�ַ���
         * @param pattern string�ַ���
         * @return bool������
         */
        public boolean match(String str, String pattern) {
            // write code here
            int n = str.length();
            int m = pattern.length();
            boolean[][] f = new boolean[n + 1][m + 1];

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    //�ֳɿ�����ͷǿ���������
                    if (j == 0) {
                        f[i][j] = i == 0;
                    } else {
                        //�ǿ������Ϊ������� * �� ��*
                        if (pattern.charAt(j - 1) != '*') {
                            if (i > 0 && (str.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j - 1) == '.')) {
                                f[i][j] = f[i - 1][j - 1];
                            }
                        } else {
                            //���� * �ˣ���Ϊ���Ͳ����������
                            //����
                            if (j >= 2) {
                                f[i][j] |= f[i][j - 2];
                            }
                            //��
                            if (i >= 1 && j >= 2 && (str.charAt(i - 1) == pattern.charAt(j - 2) || pattern.charAt(j - 2) == '.')) {
                                f[i][j] |= f[i - 1][j];
                            }
                        }
                    }
                }
            }
            return f[n][m];
        }
    }
}
