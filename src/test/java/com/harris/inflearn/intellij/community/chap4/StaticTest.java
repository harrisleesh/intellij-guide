package com.harris.inflearn.intellij.community.chap4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class StaticTest {
    @Test
    public void name(){
        //ctrl + shift + space : smart 자동완성
        Calendar c = new GregorianCalendar(Locale.KOREAN);

        //ctrl + space + space : static method 자동완성
        Assert.assertThat();
    }
}
