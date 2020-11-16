package org.des.designpatterns.creational.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton EAGER_INITIALIZED_SINGLETON = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() { }

    public static EagerInitializedSingleton getInstance() {
        return EAGER_INITIALIZED_SINGLETON;
    }
}
