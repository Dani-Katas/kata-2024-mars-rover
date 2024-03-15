package org.example;

public enum Direction {
  SOUTH,
  NORTH,
  WEST,
  EAST;

  @Override
  public String toString() {
      return switch (this) {
        case NORTH -> "N";
        case EAST -> "E";
        case SOUTH -> "S";
        case WEST -> "W";
      };
  }

  public Direction rotateLeft() {
      return switch (this) {
        case NORTH -> WEST;
        case WEST -> SOUTH;
        case SOUTH -> EAST;
        case EAST -> NORTH;
      };
  }

  public Direction rotateRight() {
      return switch (this) {
        case NORTH -> EAST;
        case EAST -> SOUTH;
        case SOUTH -> WEST;
        case WEST -> NORTH;
      };
  }
}
