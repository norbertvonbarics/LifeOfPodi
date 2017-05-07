class Stats {

  private int minBitizen;
  private int maxBitizen;

  Stats() {
    this.minBitizen = Board.arrayToString().length();
    this.maxBitizen = 0;
  }

  int getMinBitizen(int numberAlive) {
    if (numberAlive < minBitizen) {
      minBitizen = numberAlive;
    }
    return minBitizen;
  }

  int getMaxBitizen(int numberAlive) {
    if (numberAlive > maxBitizen) {
      maxBitizen = numberAlive;
    }
    return maxBitizen;
  }
}