package com.practice;

public class CopyObject {

    public static void main(String[] args) {

        TypeA obj = new TypeA();
        obj.str1 = "Test1";
        obj.str2 = "Test2";

        TypeA obj2 = (TypeA) obj.clone();

        System.out.println(obj2.toString());
    }
}

class TypeA implements Cloneable{
    String str1, str2;

    @Override
    public Object clone() {
        try {
            return (TypeA)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return  null;
        }
    }

    @Override
    public String toString() {
        return "TypeA{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }
}
