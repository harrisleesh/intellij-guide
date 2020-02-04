package com.harris.inflearn.intellij.chap6.code;

public class Rename {
    public void rename(){
        //Rename : shift + F6
        String name = "a";

        for(int i=0; i< 10; i++){
            System.out.println(name);
        }

        System.out.println("변수값: "+name);
    }
}
