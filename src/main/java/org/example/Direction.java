package org.example;

public enum Direction {
  SOUTH,
  NORTH;

  @Override
  public String toString() {
    if (this == SOUTH) {
      return "S";
    }

    return "Unknown";
  }
}
