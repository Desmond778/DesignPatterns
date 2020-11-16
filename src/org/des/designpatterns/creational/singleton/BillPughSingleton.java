package org.des.designpatterns.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    public static class SingletonHelper {
        public static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
