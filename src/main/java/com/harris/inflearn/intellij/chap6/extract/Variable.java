package com.harris.inflearn.intellij.chap6.extract;

public class Variable {
    public void extractVariable(){
        //ctrl + w = selection widen
        //ctrl + alt + v = extract variable
        String message = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(message);
        System.out.println(message);
    }
}
