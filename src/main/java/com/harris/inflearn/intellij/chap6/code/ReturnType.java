package com.harris.inflearn.intellij.chap6.code;

public class ReturnType {
    public void print(){
        Integer num = calculate();
        System.out.println(num);
    }

    //ctrl + shift + F6 : change Return Type
    private Integer calculate() {
        return 1;
    }
}
