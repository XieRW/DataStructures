package test;

import java.util.*;

/**
 * @program: DataStructures
 * @description: ����
 * @author: л���� 1429382875@qq.com
 * @create: 2021-08-13 10:26
 **/
public class t1 {

    public static void main(String[] args) {
//        f1();
        Ticket a = new Ticket("1");
        Ticket b = new Ticket("2");
        Ticket c = add(a,b);
        System.out.printf("a=%s\tb=%s\tc=%s\t",a.val,b.val,c.val);
    }

    static void f1(){
        //��֤HashMap��������
        Map<String,Object> map = new HashMap<>(16);
        for (int i = 0; i < 10000; i++) {
            map.put(String.valueOf(i),i);
        }
        map.forEach((key,value)->{
            System.out.print(value + "\n");
        });

        //��֤LinkedHashMap��������
        Map<String,Object> linkedHashMap = new LinkedHashMap<>(16);
        for (int i = 0; i < 10000; i++) {
            linkedHashMap.put(String.valueOf(i),i);
        }
        linkedHashMap.forEach((key,value)->{
            System.out.print(value + "\n");
        });
    }

    static Ticket add(Ticket a,Ticket b){
        //�ı�a��ָ�򣬲�����ı�ԭ����a��ֵ
        a = new Ticket("5");
        b.val = "6";
        Ticket c;
        c = new Ticket(a.val+""+b.val);
        return c;
    }
}
class Ticket{
    String val;
    Ticket(String val){
        this.val = val;
    }
}
