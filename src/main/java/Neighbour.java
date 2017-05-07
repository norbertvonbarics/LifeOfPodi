class Neighbour {

  static int checkNeighbours(int posX, int posY) {
    int counter = 0;

    if (posX > 0 && Alive.isAlive(posX - 1, posY)) {
      counter++;
    }
    if (posX > 0 && posY < Board.size - 1 && Alive.isAlive(posX - 1, posY + 1)) {
      counter++;
    }
    if (posY > 0 && Alive.isAlive(posX, posY - 1)) {
      counter++;
    }
    if (posY > 0 && posX < Board.size - 1 && Alive.isAlive(posX + 1, posY - 1)) {
      counter++;
    }
    if (posX > 0 && posY > 0 && Alive.isAlive(posX - 1, posY - 1)) {
      counter++;
    }
    if (posX < Board.size - 1 && Alive.isAlive(posX + 1, posY)) {
      counter++;
    }
    if (posY < Board.size - 1 && Alive.isAlive(posX, posY + 1)) {
      counter++;
    }
    if (posX < Board.size - 1 && posY < Board.size - 1 && Alive.isAlive(posX + 1, posY + 1)) {
      counter++;
    }
    return counter;
  }
}