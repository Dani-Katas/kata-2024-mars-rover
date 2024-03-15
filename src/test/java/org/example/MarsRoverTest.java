package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MarsRoverTest {


    @Test
    void spawnsAtOriginFacingNorth() {
        String command = "";
        String expectedOutput = "0:0:N";

        MarsRover marsRover = new MarsRover(new Grid());

        String output = marsRover.execute(command);

        assertThat(output).isEqualTo(expectedOutput);
    }

    @Nested
    class RotateTest {
        @Test
        void rotatesLeft() {
            String command = "L";
            String expectedOutput = "0:0:W";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void turnsAroundToTheLeft() {
            String command = "LL";
            String expectedOutput = "0:0:S";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void rotatesLeftThreeTimes() {
            String command = "LLL";
            String expectedOutput = "0:0:E";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void rotates360ToTheLeft() {
            String command = "LLLL";
            String expectedOutput = "0:0:N";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void rotatesRight() {
            String command = "R";
            String expectedOutput = "0:0:E";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void turnsAroundToTheRight() {
            String command = "RR";
            String expectedOutput = "0:0:S";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void rotatesRightThreeTimes() {
            String command = "RRR";
            String expectedOutput = "0:0:W";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void rotates360ToTheRight() {
            String command = "RRRR";
            String expectedOutput = "0:0:N";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }
    }

    @Nested
    class MovementTest {

        @Test
        void advancesOnce() {
            String command = "M";
            String expectedOutput = "1:0:N";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void advancesTwice() {
            String command = "MM";
            String expectedOutput = "2:0:N";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }
        
        @Test
        void goesBackwardsOnce() {
            String command = "RRM";
            String expectedOutput = "-1:0:S";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }
        
        @Test
        void movesHorizontallyToTheLeft() {
            String command = "LM";
            String expectedOutput = "0:-1:W";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }

        @Test
        void movesHorizontallyToTheRight() {
            String command = "RM";
            String expectedOutput = "0:1:E";

            MarsRover marsRover = new MarsRover(new Grid());

            String output = marsRover.execute(command);

            assertThat(output).isEqualTo(expectedOutput);
        }
    }

}