package org.des.designpatterns.creational.abstractfactory;

import org.des.designpatterns.creational.factory.Computer;

public class TestDesignPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("8 GB","2 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
        System.out.println("AbstractFactory Laptop Config::"+pc);
    }
}
