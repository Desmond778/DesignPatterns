package org.des.designpatterns.structural.proxy;

public class ProxyPatternTest {

    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Desmond", "wrong_pwd");
        try {
//            executor.runCommand("ls -ltr");
//            executor.runCommand("rm -rf abc.pdf");
            executor.runCommand("cmd /c dir");
            executor.runCommand("cmd /c mkdir myfolder");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }

}
