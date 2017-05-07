import java.nio.file.NoSuchFileException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

  BufferedImage image;
  int posX, posY;
  int dimX;
  int dimY;

  public PositionedImage(String filename, int posX, int posY, int dimX, int dimY) {
    this.posX = posX;
    this.posY = posY;
    this.dimX = dimX;
    this.dimY = dimY;
    try {
      image = ImageIO.read(new File(filename));
    } catch (NoSuchFileException ex) {
      System.out.println("NINCS");
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, dimX, dimY,null);
    }
  }
}