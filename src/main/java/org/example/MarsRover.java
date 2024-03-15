package org.example;

public class MarsRover {

    Direction direction = Direction.NORTH;


    public MarsRover(Grid grid) {
    }
    
    public String execute(String command) {
        
        String[] commands = command.split("");
        
        for (String c : commands) {
            if (c.equals("L")) {
                direction = direction.rotateLeft();
            }

            if (c.equals("R")) {
                direction = direction.rotateRight();
            }
        }
        
        if (command.equals("M")) {
            return "1:0:" + this.direction;
        }
        
        return "0:0:" + this.direction;
    }
    
    
}
