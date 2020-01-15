package com.harris.inflearn.intellij.chap1.view;

public class ViewArguments {
    public void viewArguments(){
        // Parameter 보기 : ctrl + P
        EmailSender emailSender = new EmailSender();

        EmailSender.receive();
    }
}
