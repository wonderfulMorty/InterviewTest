package mycollection;

import org.junit.jupiter.api.Test;

import java.util.*;

/*
�ڲ�������Ϊ˳����o1��o2,������o1-o2  > 0 ��Ĭ������(λ�ò��ģ���>0)
�ⲿ����,��Ϊ��������this�����ԣ�ԭ�ȵ�˳����this,o1,this - o1 >0,λ�ò���(this��ǰ������this-o1,this��Ȼ��ǰ���ҽ��>0,ִ��Ĭ������)
 */

public class LearnCollectionAndMap {
    @Test
    public void mytest1(){
        System.out.println("ʹ����Ȼ����");
        TreeMap<IdNumber2, String> treeMap=new TreeMap<IdNumber2,String>();
        treeMap.put(new IdNumber2(1000), "������");
        treeMap.put(new IdNumber2(1001), "������");
        treeMap.put(new IdNumber2(1002), "������");
        treeMap.put(new IdNumber2(1003), "������");
        treeMap.put(new IdNumber2(1004), "������");
        System.out.println("treeMap="+treeMap);
        System.out.println("ʹ�ö������򣺣���С��������");
        //ʹ�ö�������ָ���Ƚ���
        TreeMap<IdNumber2, String> treeMap2=
                new TreeMap<IdNumber2,String>(new MyComparatorBigToSmall());
        treeMap2.put(new IdNumber2(1000), "������");
        treeMap2.put(new IdNumber2(1001), "������");
        treeMap2.put(new IdNumber2(1002), "������");
        treeMap2.put(new IdNumber2(1003), "������");
        treeMap2.put(new IdNumber2(1004), "������");
        System.out.println("treeMap2="+treeMap2);
        System.out.println("ʹ�ö������򣺣��Ӵ�С����");
        TreeMap<IdNumber2, String> treeMap3=
                new TreeMap<IdNumber2,String>(new MyComparatorSmallToBig());
        treeMap3.put(new IdNumber2(1000), "������");
        treeMap3.put(new IdNumber2(1001), "������");
        treeMap3.put(new IdNumber2(1002), "������");
        treeMap3.put(new IdNumber2(1003), "������");
        treeMap3.put(new IdNumber2(1004), "������");
        System.out.println("treeMap2="+treeMap3);



    }


    //�Զ���Ƚ���:ʵ��comparator�ӿ�
    class MyComparatorBigToSmall implements Comparator<IdNumber2> //ʹ�÷���
    {

        @Override
        public int compare(IdNumber2 o1, IdNumber2 o2) {
            // TODO Auto-generated method stub
            return o1.getIdNumber()-o2.getIdNumber();//��С��������
        }
    }
    class MyComparatorSmallToBig implements Comparator<IdNumber2>
    {
        @Override
        public int compare(IdNumber2 o1, IdNumber2 o2) {
            // TODO Auto-generated method stub
            return o2.getIdNumber()-o1.getIdNumber();//��С��������
        }
    }
    //z��Ϊ������ʵ��Comparable�ӿ�
    class IdNumber2 implements Comparable<IdNumber2>
    {
        //��Ա����
        private int IdNumber;
        public int getIdNumber()
        {
            return IdNumber;
        }
        //���캯��
        public IdNumber2() {
            // TODO Auto-generated constructor stub
        }
        //���캯��
        public IdNumber2(int IdNumber)
        {
            this.IdNumber=IdNumber;
        }
        //��дtoString()����
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "["+this.IdNumber+"]";
        }
        //��дequals()����
        @Override
        public boolean equals(Object obj)
        {
            if(obj==this)//�Լ����Լ��Ƚ�
                return true;//�Ǿ���ͬһ�������
            //��������ò�Ϊ�գ���������������һ��
            if(obj!=null&&obj.getClass()==this.getClass())
            {
                IdNumber2 idNumber2=(IdNumber2) obj;//����ת��
                return this.IdNumber==idNumber2.IdNumber;
                //��������ı��һ�����Ǿ���Ϊ���
            }
            return false;
        }
        //��дhashCode()����
        @Override
        public int hashCode() {
            // TODO Auto-generated method stub
            return this.IdNumber*100;
        }
        //��дcompareTo()����ʵ����Ȼ����
        @Override
        public int compareTo(IdNumber2 o)
        {
            // TODO Auto-generated method stub
            //return this.IdNumber-o.IdNumber;//��С��������
            return o.IdNumber-this.IdNumber;//�Ӵ�С����
        }
    }

}
