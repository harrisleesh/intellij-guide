package com.harris.inflearn.intellij.chap2.special;

import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy  {
    public void increaseFocus(){
        //ctrl + W(option + 위) extend selection
        //ctrl + shift + W(option + 아래) narrow selection
        //ctrl + y (줄 삭제)
        //focus 이동 (ctrl + alt + left/right
        System.out.println(Optional.of(new Member().getCourse()));
        System.out.println(LocalDate.of(2018,5,14));
    }
}
