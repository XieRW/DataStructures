package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ9 ��̨����չ����
 * https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tags=&title=&difficulty=0&judgeStatus=0&rp=0
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-24 10:29
 **/
public class Jz9 {
    public class Solution {
        //�ⷨһ
        public int jumpFloorII(int target) {
            int a = 1;
            for (int i = 2; i <= target; i++) {
                a *= 2;
            }
            return a;
        }

        //�ⷨ��
        public int jumpFloorII2(int target) {
            return (int) Math.pow(2, target - 1);
        }

        //�ⷨ��
        public int jumpFloorII3(int target) {
            return 1 << (target - 1);
        }
    }
}
