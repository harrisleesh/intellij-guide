package com.harris.inflearn.intellij.chap1.lineedit;

public class LineJoin {
    public String joinString(){
        //라인 합치기 ctrl + shift + j
        String profile = "안녕하세요."
                +"IntelliJ 강의에 오신것을"
                +"환영합니다.";
        return profile;
    }

    public String createQuery(){
        String query = "SELECT * "
                +"FROM USER";

        return query;
    }
}
