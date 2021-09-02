package test.date210902;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: DataStructures
 * @description: HashMap���Գ��÷���
 * @author: л���� 1429382875@qq.com
 * @create: 2021-09-02 17:08
 **/
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(16);
        //�������ظ���ֵ�����ظ�
        map.put("san","����");
        map.put("si","����");
        map.put("wu","����");
        map.put("wang","����");
        map.put("wang","������");
        map.put("lao","������");
        System.out.println("--------ֱ�����hashmap----------");
        System.out.println(map);
        /**
         * ����HashMap
         */
        //1����ȡ���е�key
        System.out.println("--------foreach��ȡmap�����еļ�-----------");
        Set<String> keys = map.keySet();
        for (String key :
                keys) {
            System.out.print(key+ " ");
        }
        //����
        System.out.println();
        //2����ȡ���е�ֵ
        System.out.println("--------foreach��ȡmap�����е�ֵ-----------");
        Collection<String> values = map.values();
        for (String value:
             values) {
            System.out.print(value+ " ");
        }
        //����
        System.out.println();
        //3���õ�key��ֵ��ͬʱ�õ�key����Ӧ��ֵ
        System.out.println("--------�õ�key��ֵ��ͬʱ�õ�key����Ӧ��ֵ---------");
        Set<String> keys2 = map.keySet();
        for (String key :
                keys2) {
            System.out.print(key+ ":"+map.get(key)+" ");
        }
        //����
        System.out.println();
        /**
         * �����Ҫ����key��Ҫ��ȡvalue����ô���������ַ�ʽ����Ϊ����Ȼ�ȡkeySetȻ����ִ��map.get(key)��map�ڲ���ִ�����α���
         * һ�����ڻ�ȡkeySetʱ��һ�����ڻ�ȡkey��Ӧ��value��ʱ��
         */
        /**
         * ������put(key,value)��ʱ�����Ȼ��key��value��װ��Entry�����̬�ڲ�������У���Entry��������ӵ������У������������ȡmap�����еļ�ֵ��
         * ֻ��Ҫ��ȡ���������е�Entry���󣬽���������Entry�����GetKey()��GetValue()�������ܻ�ȡ����ֵ����
         */
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry entry:entries) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        /**
         * �������÷���
         */
        System.out.println("after ma.size():"+map.size());
        System.out.println("after ma.isEmpty():"+map.isEmpty());
        map.remove("san");
        System.out.println("after ma.remove():"+map);
        System.out.println("after ma.get(si):"+map.get("si"));
        System.out.println("after map.containsKey(si)��"+map.containsKey("si"));
        System.out.println("after containsValue(����)��"+map.containsValue("����"));
        System.out.println(map.replace("si", "����2"));
        System.out.println("after map.replace(si, ����2):"+map);
    }
}
