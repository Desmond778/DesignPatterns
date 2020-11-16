package org.des.designpatterns.creational.factory;

import java.util.Optional;

public class TestFactory {
    //This pattern takes out the responsibility of the instantiation of a class
    // from the client program to the factory class
    public static void main(String[] args) {
        Configuration pcConfig = new Configuration("2 GB","500 GB","2.4 GHz");
        Optional<Computer> pc = ComputerFactory.getComputer(ComputerType.PC,pcConfig);
//        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");

        Configuration serverConfig = new Configuration("16 GB","1 TB","2.9 GHz");
        Optional<Computer> server = ComputerFactory.getComputer(ComputerType.SERVER,serverConfig);

        System.out.println("Factory PC Config::"+pc.get());
        System.out.println("Factory Server Config::"+server.get());
    }
}
