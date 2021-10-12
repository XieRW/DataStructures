package com.xrw.swordfingeroffer;

/**
 * @program: DataStructures
 * @description: JZ35 �����е������
 * @author: л���� 1429382875@qq.com
 * @create: 2021-10-12 10:15
 **/
public class Jz35 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int count = 0;
        while (count >= 0) {
            count++;
        }
        System.out.println(2147483647 + 1);
    }

    /**
     * �ⷨһ�������������飬��һ��Ԫ�أ�����������Ԫ�رȽϣ��ж��Ƿ��������
     */
    public class Solution {

        public int InversePairs(int[] array) {
            if (array.length == 0) {
                return 0;
            }
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        count++;
                        count %= 1000000007;
                    }
                }
            }
            return count;
        }
    }

    /**
     * �ⷨ���������㷨+�鲢����
     */
    public class Solution2 {

        public int InversePairs(int[] array) {
            if (array.length == 0) {
                return 0;
            }
            return merge(array, 0, array.length - 1);
        }

        public int merge(int[] nums, int start, int end) {
            if (start >= end) {
                return 0;
            }
            int count = 0;
            int mid = (start + end) / 2;
            count += merge(nums, start, mid);
            count += merge(nums, mid + 1, end);
            int i = start;
            int j = mid + 1;
            int[] temp = new int[end - start + 1];
            int p = 0;
            while (i <= mid && j <= end) {
                if (nums[i] < nums[j]) {
                    temp[p] = nums[i];
                    p++;
                    i++;
                } else {
                    count = (count + (mid - i + 1)) % 1000000007;
                    temp[p] = nums[j];
                    j++;
                    p++;
                }
            }
            while (i <= mid) {
                temp[p] = nums[i];
                p++;
                i++;
            }
            while (j <= end) {
                temp[p] = nums[j];
                p++;
                j++;
            }
            for (int k = 0; k < temp.length; k++) {
                nums[start + k] = temp[k];
            }

            return count;
        }
    }

    /**
     * ţ����⣺[A��B]�е������=[A]�������+[B]�е������+��A��B������һ��������
     */
    public class Solution3 {
        private int cnt;
        private void MergeSort(int[] array, int start, int end){
            if(start>=end)return;
            int mid = (start+end)/2;
            MergeSort(array, start, mid);
            MergeSort(array, mid+1, end);
            MergeOne(array, start, mid, end);
        }
        private void MergeOne(int[] array, int start, int mid, int end){
            int[] temp = new int[end-start+1];
            int k=0,i=start,j=mid+1;
            while(i<=mid && j<= end){
//���ǰ���Ԫ��С�ں���Ĳ��ܹ��������
                if(array[i] <= array[j])
                    temp[k++] = array[i++];
                else{
//���ǰ���Ԫ�ش��ں���ģ���ô��ǰ��Ԫ��֮���Ԫ�ض��ܺͺ����Ԫ�ع��������
                    temp[k++] = array[j++];
                    cnt = (cnt + (mid-i+1))%1000000007;
                }
            }
            while(i<= mid)
                temp[k++] = array[i++];
            while(j<=end)
                temp[k++] = array[j++];
            for(int l=0; l<k; l++){
                array[start+l] = temp[l];
            }
        }
        public int InversePairs(int [] array) {
            MergeSort(array, 0, array.length-1);
            return cnt;
        }
    }

    /**
     * ţ����⣺�鲢���������ⲻ�Ϸֽ��С���⣬ֱ�������ٷ֣�
     * �������С������ٺϲ��ϴ����⣬���������һֱ�ϲ������������ٽ����ע���ǲ�������ʱ��������
     * ��˿��Կ���������ĵĴ�����룬���ںϲ���ʱ����ɡ�����һ��Ҫ���ǵ��������ͳ��֮���������
     * �������һЩЧ�ʡ���Ϊʲô�������ע���н��н���˵�������ϲ�����������Ҫʹ�ö����һ�����飬
     * ��С��ԭ������ȣ������ЩЧ�ʣ��ռ临�Ӷ�Ҳ���һ������
     */
    public class Solution4 {
        public int InversePairs(int [] array) {
            return merge(array, 0, array.length-1);
        }

        public int merge(int[] nums, int start, int end){
            if(start >= end){//�ֽ⵽���ֽܷ��ʱ��ı߽�
                return 0;
            }
            int mid = (start + end)/2;// midΪ�������Ҹ�һ��
            int count = 0;
            count += merge(nums, start, mid);
            count += merge(nums,mid+1, end);
            //���������Ƿ�����������зֽ⣬ֱ���ֽ⵽��С
            //����С����ϲ��ɴ�С����֮��Ĵ���Ҳ������ĵĲ���
            int[] temp = new int[end-start+1];
//temp����:����һ���͵�ǰ�ϲ��������Сһ�������飬temp���ǽ������ֺϲ���������
            int i = start;//�ϲ�����ߺ��ұߺϲ���һ��ָ����ߵ�Ԫ�ص�ָ��
            int j = mid+1;//һ��ָ���ұߵ�Ԫ�ص�ָ��
            int p = 0;//temp�е�ָ��
            while(i <= mid && j <= end){//��߲��ֵı߽�mid���ұ߲��ֵı߽�end
//���whileʵ�ʾ��ǽ��������֣����кϲ���ʱ������
                if(nums[i] < nums[j]){
                    temp[p] = nums[i];
                    p++;  //�ȸ��ƣ���++,���Ҷ��Կɶ��Ը��ߣ��߼�����ͨ˳��
                    i++;
                }else{//����i�ͱ�j�󣬾�˵������������ԣ����ά��count��
//����ֵ��˵��˵����temp�ĳ��ȵ������+�ұߵĳ��ȡ���Ȼ�����������ͷ����ô�ϲ�֮ǰҲ�ź���
//��ô��߲����Ѿ������ұ߲���Ҳ���򣬱����ʱ����{1,5,9}��{3,7,8}�ϲ�
//��i=1,mid=2,j=3ʱ����else�����Կ�����ͨ��mid-i+1=2���õ�����{5,3}��{9,3}���������
//����count+2,Ȼ��j�ĽǱ��ƶ����´αȽϵ���5��7�ˡ������������ظ��ıȽϣ������Ч��
//�����Ĳ����������������������򣬾Ͳ�����ô�棬��������ô���ʱ�򣬹������£�
//{1,5,9}��{3,7,8}�ϲ�,���ڲ�֪���Ƿ�����5��3�γ������Ӧ��count++
//Ȼ���ƶ�һ�����Լ���ǵ�ָ�롣Ȼ�����ܻ�ͨ���ƶ�ָ��Ƚ�һ��9��3��Ȼ��count++��
//��ͨ������������count++�ͱ����һ�β�������ˣ����������Ч�ʣ��ռ临�Ӷ���΢�ߵ㡣
//��Ϊ���õ��˶�������飬�ϲ����򣬲����ٸ��Ƹ�ԭ���顣
                    count = (count+(mid-i+1))%1000000007;
                    temp[p] = nums[j];
                    p++;
                    j++;
                }
            }
//����Ĺ���Ҳֵ��һ�ᣬ���������кϲ�ʱ����߻����ұ���ͨ��ָ���ƶ���ϣ�ȫ���ƽ�temp��
//����Ҫ����һ�ߵ����ݣ�Ҳȫ�����Ƹ�temp��
//������������if�ֱ��Ӧ����ȸ������ˣ�ר��ȥ�����ұߣ����ұ��ȸ������ˣ���ȥ������ߡ�
            if(i <= mid){
                while(i <= mid){
                    temp[p++] = nums[i];
                    i++;
                }
            }
            if(j <= end){
                while(j <= end){
                    temp[p++] = nums[j];
                    j++;
                }
            }
            for(int k = 0;k < end-start+1; k++){//���ϲ��õ������ٸ��ƻ�nums���Ա�֤����
                nums[start+k] = temp[k];
            }
            return count;
        }
    }
//������̸̸%1000000007����⣬Ӧ����Ϊ�˷�ֹ��������Ա�����ÿ�μӵ�ʱ����в���
//�����ܷ���return�����
}
