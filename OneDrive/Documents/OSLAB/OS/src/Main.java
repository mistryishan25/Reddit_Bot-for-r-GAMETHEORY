
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
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

        Line line1 = new Line(140, 300, 460, 300);
        line1.setStroke(Color.LIGHTGRAY);
        Line line2 = new Line(300, 140, 300, 460);
        line2.setStroke(Color.LIGHTGRAY);
        Line line3 = new Line(300, 140, 300, 460);
        line3.setStroke(Color.LIGHTGRAY);
        line3.getTransforms().add(rotate);
        Line line4 = new Line(140, 300, 460, 300);
        line4.setStroke(Color.LIGHTGRAY);
        line4.getTransforms().add(rotate);

        root.getChildren().addAll(line1, line2, line3, line4);
        /*
         * Arc arc = new Arc(); arc.setCenterX(300.0f); arc.setCenterY(300.0f);
         * arc.setRadiusX(150); arc.setRadiusY(150);
         * 
         * arc.setStartAngle(45); arc.setLength(45); arc.setType(ArcType.ROUND);
         * arc.setStroke(Color.BLACK); root.getChildren().add(arc);
         * 
         * Arc arc2 = new Arc(); arc2.setLength(45); arc2.setStartAngle(45);
         * arc2.setRadiusX(140); arc2.setRadiusY(140);
         * 
         * arc2.setFill(Color.WHITE); arc2.setCenterX(300.0f); arc2.setCenterY(300.0f);
         * arc2.setType(ArcType.ROUND); arc2.setStroke(Color.LIGHTGRAY);
         * root.getChildren().add(arc2);
         */ // THis code is not needed now as we have the code for a path that encloses a
            // "tile" shape

      /*  Path path = new Path();
        path.setStroke(Color.BLACK);

        MoveTo A = new MoveTo();
        A.setX(150);
        A.setY(300);

        LineTo AB = new LineTo();
        AB.setX(140);
        AB.setY(300);

        ArcTo BC = new ArcTo();
        BC.setRadiusX(160);
        BC.setRadiusY(160);
        BC.setXAxisRotation(45);
        BC.setSweepFlag(false);
        BC.setX(186.86291501015236);
        BC.setY(413.1370849898476);

        LineTo CD = new LineTo();
        CD.setY(406.06601717798213);
        CD.setX(193.93398282201787);

        ArcTo CA = new ArcTo();
        CA.setRadiusX(150);
        CA.setRadiusY(150);
        CA.setXAxisRotation(45);
        CA.setSweepFlag(true);
        CA.setX(150);
        CA.setY(300);

        ClosePath cp = new ClosePath();
        path.getElements().addAll(A, AB, BC, CD, CA);
        // path.setFill(Color.BLACK);
        root.getChildren().addAll(path);
*/
     

        for (double i = 40; i < 170; i += 10) {
            Circle circle1 = new Circle(300.0f, 300.0f, i);

            circle1.setFill(null);
            circle1.setStroke(Color.BLACK);
            circle1.setStrokeWidth(2);
            root.getChildren().addAll(circle1);

            for (double j = 0; j <= 315; j += 45) {
                // getting the corodinates of the line cutting the circle
                double J = Math.toRadians(j);
                double x_mid = 300 + (i * Math.cos(J));
                double y_mid = 300 + (i * Math.sin(J));
                System.out.println("circle with radius  " + i + "  with line angle intersect at  " + j + "  X =  "
                        + x_mid + "  Y =  " + y_mid);
            }

        }

        {
            Path path8 = new Path();
            path8.setStroke(Color.RED);
            path8.setFill(Color.BLACK);

            MoveTo A1 = new MoveTo();
            A1.setX(260);
            A1.setY(300);

            LineTo AB1 = new LineTo();
            AB1.setX(250);
            AB1.setY(300);

            ArcTo BC1 = new ArcTo();
            BC1.setRadiusX(50);
            BC1.setRadiusY(50);
            BC1.setXAxisRotation(90);
            BC1.setSweepFlag(false);
            BC1.setX(264.6446609406726);
            BC1.setY(335.3553390593274);

            LineTo CD1 = new LineTo();
            CD1.setX(271.7157287525381);
            CD1.setY(328.2842712474619);

            ArcTo CA1 = new ArcTo();
            CA1.setRadiusX(40);
            CA1.setRadiusY(40);
            CA1.setXAxisRotation(45);
            CA1.setSweepFlag(true);
            CA1.setX(260);
            CA1.setY(300);

            path8.getElements().addAll(A1, AB1, BC1, CD1, CA1);

            root.getChildren().addAll(path8);
        }

        // Creating a scene object
        Scene scene = new Scene(root, 800, 500);
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