package org.des.designpatterns.miscellaneous.dependencyinjection.legacy;

public class MyLegacyTest {
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessages("Hi Desmond", "desmond@abc.com");
    }
}
