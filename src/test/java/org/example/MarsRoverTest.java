package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    
    @Test
    void spawnsAtOriginFacingNorth() {
        String command = "";
        String expectedOutput = "0:0:N";

        MarsRover marsRover = new MarsRover(new Grid());

        String output = marsRover.execute(command);

        assertThat(expectedOutput).isEqualTo(output);
    }

    @Test
    void rotatesLeft() {
        String command = "L";
        String expectedOutput = "0:0:W";

        MarsRover marsRover = new MarsRover(new Grid());

        String output = marsRover.execute(command);

        assertThat(expectedOutput).isEqualTo(output);
    }

    @Test
    void rotatesRight() {
        String command = "R";
        String expectedOutput = "0:0:E";

        MarsRover marsRover = new MarsRover(new Grid());

        String output = marsRover.execute(command);

        assertThat(expectedOutput).isEqualTo(output);
    }

}