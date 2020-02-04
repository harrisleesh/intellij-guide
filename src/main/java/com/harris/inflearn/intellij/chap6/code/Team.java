package com.harris.inflearn.intellij.chap6.code;

//extract inner class : F6
public class Team {
    private String name;
    private String Code;

    public Team(String name, String code) {
        this.name = name;
        Code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return Code;
    }
}
