package com.harris.inflearn.intellij.chap6.extract;

import com.harris.inflearn.intellij.chap6.code.Team;

public class InnerClass {
    public void moveInnerClass(){
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }

}
