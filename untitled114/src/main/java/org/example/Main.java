package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student1> arrList = new ArrayList<Student1>();
        Student1 s1 = new Student1("张三",1,99,88,77,0);
        Student1 s2 = new Student1("李四",2,55,78,99,0);
        Student1 s3 = new Student1("王五",3,47,100,89,0);
        Student1 s4 = new Student1("赵六",4,86,99,78,0);

        arrList.add(s1);
        arrList.add(s2);
        arrList.add(s3);
        arrList.add(s4);
        //传入比较器，自定义比较方法
        Collections.sort(arrList, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int num1 = o1.getSum() - o2.getSum();
                int num2 = num1 == 0? o1.getUsername().compareTo(o2.getUsername()):num1;
                return num2;
            }
        });
        //用加强for循环进行遍历
        for(Student1 s:arrList){
            System.out.println(s.getUsername()+","+s.getSum());
        }
    }
}