package com.xrw.swordfingeroffer;

import java.util.Stack;

/**
 * @program: DataStructures
 * @description: JZ21 ջ��ѹ�롢��������
 * https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-29 13:54
 **/
public class Jz21 {
    public class Solution {
        //˼·���½�һ��ջ��������Aѹ��ջ�У���ջ��Ԫ�ص�������Bʱ���ͽ����ջ����ѭ������ʱ���ж�ջ�Ƿ�Ϊ�գ���Ϊ���򷵻�true
        public boolean IsPopOrder(int[] pushA, int[] popA) {
            Stack<Integer> stack = new Stack<>();
            int j = 0;
            for (int i = 0; i < pushA.length; i++) {
                stack.push(pushA[i]);
                if (stack.peek().equals(popA[j])) {
                    stack.pop();
                    j++;
                    while (!stack.isEmpty()) {
                        if (stack.peek().equals(popA[j])) {
                            stack.pop();
                            j++;
                        } else {
                            break;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
