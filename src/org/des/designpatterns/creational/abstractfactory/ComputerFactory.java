package org.des.designpatterns.creational.abstractfactory;

import org.des.designpatterns.creational.factory.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
