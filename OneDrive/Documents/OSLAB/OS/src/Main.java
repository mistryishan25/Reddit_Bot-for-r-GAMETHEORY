
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {

        // Creating a Group object
        javafx.scene.Group root = new javafx.scene.Group();
        Rotate rotate = new Rotate();

        // setting properties for the rotate object here lines.
        rotate.setAngle(45);
        rotate.setPivotX(300);
        rotate.setPivotY(300);

        Arc arc = new Arc();
        arc.setCenterX(300.0f);
        arc.setCenterY(300.0f);
        arc.setRadiusX(160);
        arc.setRadiusY(160);

        arc.setStartAngle(0);
        arc.setLength(45);
        arc.setType(ArcType.ROUND);
        arc.setStroke(Color.BLACK);
        root.getChildren().add(arc);

        Arc arc2 = new Arc();
        arc2.setLength(45);
        arc2.setStartAngle(0);
        arc2.setRadiusX(150);
        arc2.setRadiusY(150);
        
        arc2.setFill(Color.WHITE);
        arc2.setCenterX(300.0f);
        arc2.setCenterY(300.0f);
        arc2.setType(ArcType.ROUND);
        arc2.setStroke(Color.BLACK);
        root.getChildren().add(arc2);

        /*
         * Shape shape = Shape.intersect(arc, arc2); Shape shape2 = Shape.union(arc2,
         * arc); Shape shape3 = Shape.subtract(shape, shape2); // int - uni Shape shape4
         * = Shape.subtract(shape2, shape); // uni - int Shape shape5 =
         * Shape.subtract(shape4, shape3); Shape shape6 = Shape.subtract(shape5,
         * shape3);
         * 
         * shape6.setStroke(Color.RED); shape6.setFill(Color.BLACK);
         * 
         * root.getChildren().add(shape6);
         */
        // Shape shape4 = Shape.
        // shape4.setStroke(Color.RED);
        // root.getChildren().add(shape4);

        for (double i = 40; i < 170; i += 10) {
            Circle circle1 = new Circle(300.0f, 300.0f, i);

            circle1.setFill(null);
            circle1.setStroke(Color.BLACK);
            circle1.setStrokeWidth(2);
            root.getChildren().addAll(circle1);
            /*
             * for (double j = 45; j <= 315; j += 90) { getting the corodinates of the line
             * cutting the circle double x_mid = i * Math.cos(j); double y_mid = i *
             * Math.sin(j); System.out.println("circle with radius  " + i +
             * "  with line angle intersect at  " + j + "  X =  " + x_mid + "  Y =  " +
             * y_mid); }
             */
        }

        
          for (int i = 0; i < 8; i++) { Line line1 = new Line(140, 300, 460, 300);
          line1.setStroke(Color.LIGHTGRAY); Line line2 = new Line(300, 140, 300, 460);
          line2.setStroke(Color.LIGHTGRAY); Line line3 = new Line(300, 140, 300, 460);
          line3.setStroke(Color.LIGHTGRAY); line3.getTransforms().add(rotate); Line
          line4 = new Line(140, 300, 460, 300); line4.setStroke(Color.LIGHTGRAY);
          line4.getTransforms().add(rotate);
          
          root.getChildren().addAll(line1, line2, line3, line4); }
         

        // Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        // Setting title to the Stage
        stage.setTitle("Lets get it done");
        // Adding scene to the stage
        stage.setScene(scene);
        // Displaying the contents of the stage
        stage.show();

    }

    AnimationTimer timer = new AnimationTimer() {
        public void handle(long nanotime) {

        }
    };

    public static void main(String args[]) {
        launch(args);

    }
}