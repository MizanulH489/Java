import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

 // public class smileyface that extends app
public class SmileyFace extends Application
{
    //ovveride smileyface
    @Override
    /public void stage
    public void start(Stage stage)
    {
        // Face function
        Circle face = new Circle(125, 125, 80);
        face.setFill(Color.LIGHTBLUE);
        face.setStroke(Color.RED);

        // Righteye
        Circle rightEye = new Circle(86, 100, 10);
        rightEye.setFill(Color.GREEN);
        rightEye.setStroke(Color.BLUE);

        // Lefteye function
        Circle leftEye = new Circle(162, 100, 10);
        leftEye.setFill(Color.GREEN);
        leftEye.setStroke(Color.BLUE);

        // Create Circle for Nose
        Circle nose = new Circle(125, 120, 15);
        nose.setFill(Color.RED); // fill in
        nose.setStroke(Color.BLUE);



        // Create Arc for sad mouth
        Arc mouth = new Arc(125, 175, 45, 35, 0, 180);
        mouth.setFill(Color.LIGHTBLUE);
        mouth.setStroke(Color.BLUE);
        mouth.setType(ArcType.OPEN);

        // Change text from happy to sad face
        Text caption = new Text(80, 240, "Sad Face");
        caption.setFill(Color.BLUE);
        caption.setFont(Font.font("Verdana", 15));

        // Create Hat
        // create new arc for hat
        Arc hat = new Arc(125, 50, 80, 30, -42, 264);
        hat.setFill(Color.GREEN);
        hat.setStroke(Color.YELLOW);
        hat.setType(ArcType.OPEN);


        // create a group that holds all the features
        Group root = new Group(face, rightEye, leftEye, mouth, caption);

        // create and configure a new scene
        Scene scene = new Scene(root, 250, 275, Color.GRAY);

        // Add caption
        stage.setScene(scene);
        stage.setTitle("Sad Face");

        // show the stage
        stage.show();
    }

    //psvm to launch the face
    public static void main(String[] args)
    {
        launch(args);
    }

}