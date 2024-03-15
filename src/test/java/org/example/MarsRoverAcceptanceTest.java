package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class MarsRoverAcceptanceTest {

  @Test
  void aLongPath() {
    String command = "MRMLM";
    String expectedOutput = "2:1:N";

    MarsRover marsRover = new MarsRover(new Grid());

    String output = marsRover.execute(command);

    assertThat(expectedOutput).isEqualTo(output);
  }
}
