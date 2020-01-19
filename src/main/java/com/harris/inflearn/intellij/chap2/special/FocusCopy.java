package com.harris.inflearn.intellij.chap2.special;

import java.util.ArrayList;
import java.util.List;

public class FocusCopy {
    public void copyFocus(){
        List<String> members = new ArrayList<>();

        // 멀티포커스 ctrl + ctrl + 위아래
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
    }
}
