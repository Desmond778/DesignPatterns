package org.des.designpatterns.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred in creating the singleton object");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
