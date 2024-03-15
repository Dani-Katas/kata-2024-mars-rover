package org.example;

public class MarsRover {

    Direction direction = Direction.NORTH;
    

    public MarsRover(Grid grid) {
    }
    
    public String execute(String command) {

        if (command.equals("LL")) {
            return "0:0:" + Direction.SOUTH;
        }

        if (command.equals("L")) {
            return "0:0:" + Direction.WEST;
        }

        if (command.equals("R")) {
            return "0:0:" + Direction.EAST;
        }

        if (command.equals("RR")) {
            return "0:0:S";
        }
        
        return "0:0:N";
    }
    
    
}
