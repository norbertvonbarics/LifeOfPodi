
class Tile {

  int posX;
  int posY;
  boolean alive;

  Tile(int posX, int posY, boolean alive) {
    this.posX = posX;
    this.posY = posY;
    this.alive = alive;
  }

  @Override
  public String toString() {
    return posX + " " + posY + " " + alive;
  }
}