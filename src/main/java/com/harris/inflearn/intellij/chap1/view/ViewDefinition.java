package com.harris.inflearn.intellij.chap1.view;

public class ViewDefinition {
    public void viewDefinition(){
        EmailSender emailsender = new EmailSender(1L, "harris", "harrisleesh@gmail.com");

        //Definition 정의 : ctrl + shift + i
        emailsender.send("test@gmail.com");
    }
}
