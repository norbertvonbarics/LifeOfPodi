class Board {

  static int size = 10;
  private static int[][] multi = new int[size][size];

  static void setDead(int posX, int posY) {
    multi[posX][posY] = 0;
  }

  static void setAlive(int posX, int posY) {
    multi[posX][posY] = 1;
  }

  void fillLists() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
          int random = (int) (Math.random() * 2);
          multi[i][j] = random;
      }
    }
  }

  static int[][] array2d() {
    return multi;
  }

  static String arrayToString() {
    String map = "";
    for (int[] aMulti : multi) {
      for (int j = 0; j < multi.length; j++) {
        map += aMulti[j] + " ";
      }
      map += "\n";
    }
    return map;
  }
}