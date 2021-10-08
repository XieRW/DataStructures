package com.xrw.swordfingeroffer;

import org.omg.CORBA.INTERNAL;

import java.util.Stack;

/**
 * @program: DataStructures
 * @description: JZ20 ����min������ջ
 * https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-28 15:20
 **/
public class Jz20 {
    /**
     * &
     * �ⷨһ���ڿ��������Ŀ��ʱ���һ��Ӧ��Ҫ��һ����Сֵ��������ǰջ����Сֵ��
     * ����Ҳ�ܹ��ܿ����ʶ���Ƚ��鷳�ĵط�����pop��ʱ����ô����minֵ��
     * ���˱��˵����֮����ʹ��������һ��ջ����������ջ����������������Сֵ��ֵ��
     * pop��ʱ���ж�����ջ��Ԫ���Ƿ�һ�£�һ�µĻ���Ҫpop�������������ȡ��Сֵ��Ҫ�ӱ�����Сֵ��ջ��Ԫ��ȡֵ
     * <p>
     * ���Լ����뷨�ǲ�ϣ��������һ��ջ����ôΪ��ʵ����һĿ�ģ���ջ����Ҫ�����������������Сֵ�������ܹ��ȽϷ��㵽�ҵ���ǰ�Ĵ�Сֵ�����������Ĵ���
     */
    public class Solution {
        Stack<Integer> stack = new Stack<>();
        Integer minElement = Integer.MAX_VALUE;

        public void push(int node) {
            if (stack.empty()) {
                minElement = node;
                stack.push(node);
            } else {
                if (node <= minElement) {
                    stack.push(minElement);
                    minElement = node;
                }
                stack.push(node);
            }
        }

        public void pop() {
            if (stack.empty()) {
                return;
            }
            if (stack.peek().equals(minElement)) {
                if (stack.size() > 1) {
                    stack.pop();
                    minElement = stack.peek();
                } else {
                    minElement = Integer.MAX_VALUE;
                }
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minElement;
        }
    }

    /**
     * �ⷨ�����Ż���һ���ⷨ
     */
    public class Solution2 {
        Stack<Integer> stack = new Stack<>();
        Integer minElement = Integer.MAX_VALUE;

        public void push(int node) {
            if (node <= minElement) {
                stack.push(minElement);
                minElement = node;
            }
            stack.push(node);
        }

        public void pop() {
            if (stack.empty()) {
                return;
            }
            if (stack.peek().equals(minElement)) {
                stack.pop();
                minElement = stack.peek();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minElement;
        }
    }
}
