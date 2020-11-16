package org.des.designpatterns.structural.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Process exec = Runtime.getRuntime().exec(cmd);
        print(exec);
        System.out.println("'" + cmd + "' command executed.");
    }

    private void print(Process p) {
        try {
            p.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
