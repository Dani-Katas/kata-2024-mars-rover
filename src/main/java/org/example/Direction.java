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
    }
    if (this == WEST) {
      return "W";
    }
    if (this == EAST) {
      return "E";
    }

    return "Unknown";
  }
}
