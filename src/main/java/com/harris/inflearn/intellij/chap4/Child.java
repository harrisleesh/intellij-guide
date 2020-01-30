package com.harris.inflearn.intellij.chap4;

public class Child implements Parent{

    //ctrl + i : 상속 시!! override 함수 자동완성

    @Override
    public void buy(Long amount) {

    }

    @Override
    public void drive(String name) {

    }

    @Override
    public boolean isWishList(String item) {
        return false;
    }
}
