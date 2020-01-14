package com.harris.inflearn.intellij.chap1.lineedit;

public class LineMove {
    public void moveLineAndStatement(){
        //line 단위 이동
        //alt + shift + 위, 아래 (구문 제한이 없음)
        //ctrl + shift + 위, 아래 (구문 안에서만 가능)
        System.out.println("라인 혹은 구문 단위로 이동시킵니다.");

        for(int i=0; i < 10; i++){
            System.out.println(i);
        }
    }
}
