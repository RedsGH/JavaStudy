package com.learn.hash;

public class Student {

    private int grade;//年级
    private int cls; //班级
    private String firstName;
    private String lastName;

    public Student(int grade, int cls, String firstName, String lastName) {
        this.grade = grade;
        this.cls = cls;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //复合类型重写　Object类中的hashCode()方法
    // Object类中已经写了，是通过地址比较的　
    @Override
    public int hashCode() {
        int hash = 0;
        int B = 31; //这个就是那个进制

        hash = hash*B + grade;
        hash = hash*B + cls;
        hash = hash*B + firstName.toLowerCase().hashCode();
        hash = hash*B + lastName.toLowerCase().hashCode();

        return hash;
    }

    /**
     由于hashCode中如果自己重写了hashCode方法，那么有可能导致　不是同一个引用地址的对象是相同的
         所以要使用equals方法来真的比较对象是否相同
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Student another = (Student)obj;
        return this.grade == another.grade &&
                this.cls == another.cls &&
                this.firstName.toLowerCase().equals(another.firstName.toLowerCase()) &&
                this.lastName.toLowerCase().equals(another.lastName.toLowerCase());
    }
}