package org.example;

public class MarsRover {

    Direction direction = Direction.NORTH;


    public MarsRover(Grid grid) {
    }
    
    public String execute(String command) {

        if (command.equals("LL")) {
            return "0:0:" + Direction.NORTH.rotateLeft().rotateLeft();
        }

        if (command.equals("L")) {
            return "0:0:" + Direction.NORTH.rotateLeft();
        }

        if (command.equals("R")) {
            return "0:0:" + Direction.NORTH.rotateRight();
        }

        if (command.equals("RR")) {
            return "0:0:" + Direction.NORTH.rotateRight().rotateRight();
        }
        
        return "0:0:" + Direction.NORTH;
    }
    
    
}
