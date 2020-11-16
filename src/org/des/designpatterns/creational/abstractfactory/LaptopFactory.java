package org.des.designpatterns.creational.abstractfactory;

import org.des.designpatterns.creational.factory.Computer;
import org.des.designpatterns.creational.factory.PC;

public class LaptopFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public LaptopFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new Laptop(ram,hdd,cpu);
    }
}