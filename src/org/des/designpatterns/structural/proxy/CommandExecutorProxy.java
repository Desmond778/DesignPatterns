package org.des.designpatterns.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd){
        if("Desmond".equals(user) && "Desmond123".equals(pwd)) isAdmin=true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else{
//            if(cmd.trim().startsWith("rm")){
            if(cmd.contains("mkdir")){
//                throw new Exception("rm command is not allowed for non-admin users.");
                throw new Exception("mkdir command is not allowed for non-admin users.");
            }else{
                executor.runCommand(cmd);
            }
        }
    }

}