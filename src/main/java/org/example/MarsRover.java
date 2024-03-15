package org.example;

public class MarsRover {
    

    public MarsRover(Grid grid) {
    }
    
    public String execute(String command) {

        if (command.equals("LL")) {
            return "0:0:S";
        }

        if (command.equals("L")) {
            return "0:0:W";
        }

        if (command.equals("R")) {
            return "0:0:E";
        }
        
        return "0:0:N";
    }
    
    
}
