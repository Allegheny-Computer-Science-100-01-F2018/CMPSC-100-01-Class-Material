import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;
import javafx.application.Application;

/** Class to draw random circles.
*/
public class Drawing {
  private Color[] colorList = {Color.RED, Color.CYAN, Color.MAGENTA,
    Color.YELLOW, Color.LIME, Color.WHITE};

    private Group root;
    private Scene scene;
    private Stage stage;

    Random rand;

    public Drawing () {
      root = new Group();
      stage = new Stage();
      rand = new Random();
    }

    public void draw() {

      scene = new Scene(root, 400, 300, Color.BLACK);

      stage.setTitle("Dots");
      stage.setScene(scene);
      stage.show();
    }
  }
