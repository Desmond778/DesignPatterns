package org.des.designpatterns.creational.abstractfactory;

import org.des.designpatterns.creational.factory.Computer;

public interface ComputerAbstractFactory {
    //In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class.
    // Then an Abstract Factory class that will return the sub-class based on the input factory class

    public Computer createComputer();
}
