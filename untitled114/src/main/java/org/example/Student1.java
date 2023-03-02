package org.example;

public class Student1 {
    private  int sum;
    private String username;
    private int studentnumber;
    private int chinese;
    private int math;
    private int en;

    public Student1(String username,int studentnumber,int chinese, int math, int en,int sum ) {
        this.username=username;
        this.studentnumber=studentnumber;
        this.chinese=chinese;
        this.math=math;
        this.en=en;
        this.sum=sum;
    }
    public String getUsername() {
        return username;
    }
    public int getStudentnumber() {
        return studentnumber;
    }
    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }
    public int getEn() {
        return en;
    }

    public int getSum() {
        return chinese+math+en;
    }
}
