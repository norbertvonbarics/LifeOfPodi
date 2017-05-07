import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Game Of Life");
    Engine gameEngine = new Engine();
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
  }
}