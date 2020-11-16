package org.des.designpatterns.creational.factory;

import java.util.Optional;

public class ComputerFactory {

    public static Optional<Computer> getComputer(ComputerType type, Configuration conf) {
        if(type.equals(ComputerType.PC)){
            Computer pc = new PC(conf.getRam(), conf.getHdd(), conf.getCpu());
            return Optional.of(pc);
        } else if(type.equals(ComputerType.SERVER)) {
            Computer server = new Server(conf.getRam(), conf.getHdd(), conf.getCpu());
            return Optional.of(server);
        }

        return Optional.empty();
    }

}
