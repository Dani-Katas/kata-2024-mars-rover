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
        
        return "0:0:" + this.direction;
    }
    
    
}
