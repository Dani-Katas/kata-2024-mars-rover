package org.example;

public enum Direction {
  SOUTH,
  NORTH,
  WEST,
  EAST;

  @Override
  public String toString() {
    if (this == SOUTH) {
      return "S";
    } else if (this == WEST) {
      return "W";
    } else if (this == EAST) {
      return "E";
    } else if (this == NORTH) {
      return "N";
    } else {
      return "Unknown";
    }
  }

  public Direction rotateLeft() {
    if (this == WEST) {
      return SOUTH;
    } else if(this == SOUTH) {
      return EAST;
    }

    return WEST;
  }

  public Direction rotateRight() {
    if (this == EAST) {
      return SOUTH;
    } else if (this == SOUTH) {
      return WEST;
    }

    return EAST;
  }
}
