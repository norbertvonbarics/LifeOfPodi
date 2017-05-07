class Alive {

  static boolean isAlive(int posX, int posY) {
    return (Board.array2d()[posX][posY] == 1);
  }
}