package org.example;

public enum Direction {
  SOUTH,
  NORTH,
  WEST;

  @Override
  public String toString() {
    if (this == SOUTH) {
      return "S";
    }
    if (this == WEST) {
      return "W";
    }

    return "Unknown";
  }
}
