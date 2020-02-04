package com.harris.inflearn.intellij.chap6.extract;

public class Parameter {

    //extract parameter : ctrl + alt + p
    public void extractParameter() {
        extractParameter(10);
    }

    public void extractParameter(int num){
        System.out.println(num);
        System.out.println(num);
    }
}
