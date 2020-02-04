package com.harris.inflearn.intellij.chap6.extract;

import java.util.List;

public class Method {
    public void extractMethod(List <Book> books){
        for (Book book : books){
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) {
        for(String s : book.getAuthors()){
            // extract method : ctrl + alt + m
            print(s);
        }
    }

    private void print(String s) {
        if("harris".equals(s)){
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book{
        private String title;
        private Long price;
        private List<String> authors;

        public List<String> getAuthors() {
            return authors;
        }
    }
}
