package com.xrw.swordfingeroffer;

import java.util.Scanner;

/**
 * @program: DataStructures
 * @description: ţ������ָoffer��һ��
 * ��һ����ά����array�У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * [
 * [1,2,8,9],
 * [2,4,9,12],
 * [4,7,10,13],
 * [6,8,11,15]
 * ]
 * ���� target = 7������ true��
 * <p>
 * ���� target = 3������ false��
 * <p>
 * 0 <= array.length <= 500
 * 0 <= array[0].length <= 500
 * <p>
 * ʾ��1
 * ���룺
 * 7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
 * ����
 * ����ֵ��
 * true
 * ����
 * ˵����
 * ����7������true
 * ʾ��2
 * ���룺
 * 3,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
 * ����
 * ����ֵ��
 * false
 * ����
 * ˵����
 * ������3������false
 * @author: л���� 1429382875@qq.com
 * @create: 2021-08-12 16:28
 **/
public class Jz1 {
    static int n;
    static int len = 4;
    static int wid = 4;
    static int[][] arr = new int[len][wid];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Find(n,arr));
    }

    static boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 ||array[0] == null || array[0].length == 0){
            return false;
        }
        return find2(array,0,array[0].length-1,0,array.length-1,target);
    }

    static boolean find2(int[][] arr, int left, int right, int top, int low, int n) {
        boolean result = false;
        int midL = (left + right) / 2;
        int midW = (top + low) / 2;
        if (n == arr[midW][midL]) {
            result = true;
//            System.out.printf("��%d��:\t,��%d��\n", midL+1, midW+1);
        }
        if (n > arr[midW][midL]) {
            if (right - midL > 0) {
                //������
                result = result || find2(arr, midL + 1, right, top, low, n);
            }
            if ((low - midW) > 0) {
                //������
                result = result || find2(arr, left, right, midW + 1, low, n);
            }

        }
        if (n < arr[midW][midL]) {
            if ((midL - left) > 0) {
                //������
                result = result || find2(arr, left, midL - 1, top, low, n);
            }
            if ((midW - top) > 0) {
                //������
                result = result || find2(arr, left, right, top, midW - 1, n);
            }
        }
        return result;
    }
}


