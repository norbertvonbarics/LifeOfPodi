class Motion {

  static int counter = 0;

  private static int[][] toLive = new int[Board.size][Board.size];
  private static int[][] toDead = new int[Board.size][Board.size];

  static int[][] makeThemLive() {
    for (int i = 0; i < Board.array2d().length; i++) {
      for (int j = 0; j < Board.array2d().length; j++) {
        if (Neighbour.checkNeighbours(i, j) == 3) {
          toLive[i][j] = 1;
        } else {
          toLive[i][j] = 0;
        }
      }
    }
    return toLive;
  }

  static int[][] makeThemDead() {
    for (int i = 0; i < Board.array2d().length; i++) {
      for (int j = 0; j < Board.array2d().length; j++) {
        if (Neighbour.checkNeighbours(i, j) > 3) {
          toDead[i][j] = 0;
        } else if (Neighbour.checkNeighbours(i, j) < 2) {
          toDead[i][j] = 0;
        } else {
          toDead[i][j] = 1;
        }
      }
    }
    return toDead;
  }

  static void motion() {
    for (int i = 0; i < Board.array2d().length; i++) {
      for (int j = 0; j < Board.array2d().length; j++) {
        if (toLive[i][j] == 1 && toDead[i][j] == 1) {
          Board.setAlive(i, j);
        }
        if (toLive[i][j] == 0 && toDead[i][j] == 0) {
          Board.setDead(i, j);
        }
      }
    }
    counter++;
  }
}