package org.example;

import org.junit.jupiter.api.Nested;
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

    @Nested
    class RotateTest {
        @Test
        void rotatesLeft() {
            String command = "L";
            String expectedOutput = "0:0:W";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(expectedOutput).isEqualTo(output);
        }

        @Test
        void turnsAroundToTheLeft() {
            String command = "LL";
            String expectedOutput = "0:0:S";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(expectedOutput).isEqualTo(output);
        }

        @Test
        void rotatesLeftThreeTimes() {
            String command = "LLL";
            String expectedOutput = "0:0:E";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(expectedOutput).isEqualTo(output);
        }

        @Test
        void rotates360ToTheLeft() {
            String command = "LLLL";
            String expectedOutput = "0:0:N";

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

        @Test
        void turnsAroundToTheRight() {
            String command = "RR";
            String expectedOutput = "0:0:S";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(expectedOutput).isEqualTo(output);
        }

        @Test
        void rotatesRightThreeTimes() {
            String command = "RRR";
            String expectedOutput = "0:0:W";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(expectedOutput).isEqualTo(output);
        }

        @Test
        void rotates360ToTheRight() {
            String command = "RRRR";
            String expectedOutput = "0:0:N";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(expectedOutput).isEqualTo(output);
        }
    }

}