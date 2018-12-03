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

	/** Constructor.
	*/
    public Drawing () {
      root = new Group();
      rand = new Random();
      stage = new Stage();
    }

	/** Method to use a loop and a Random class
	*	to draw circles.
	*/
    public void draw() {

      scene = new Scene(root, 400, 300, Color.BLACK);

      for(int i=0; i<colorList.length; i++) {

        Circle circle = new Circle(10+rand.nextInt(100),10+rand.nextInt(100), 10);
        circle.setFill(colorList[i]);
        root.getChildren().add(circle);
      }
      stage.setTitle("Dots");
      stage.setScene(scene);
      stage.show();
    }
  }
