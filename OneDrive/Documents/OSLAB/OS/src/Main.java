
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


      /*  Path path22 = new Path();
        path22.setStroke(Color.BLACK);

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
        path22.getElements().addAll(A, AB, BC, CD, CA);
        // path22.setFill(Color.BLACK);
        root.getChildren().addAll(path22);
*/
     

        for (double i = 40; i < 170; i += 10) {
            Circle circle1 = new Circle(300.0f, 300.0f, i);

            circle1.setFill(null);
            circle1.setStroke(Color.BLACK);
            circle1.setStrokeWidth(2);
            //root.getChildren().addAll(circle1);

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
            {
                Path path6 = new Path();
                path6.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(260);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(250);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(50);
                BC1.setRadiusY(50);
                BC1.setXAxisRotation(45);
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

                path6.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path6);
            }
            {
                Path path14 = new Path();
                path14.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(250);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(240);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(60);
                BC1.setRadiusY(60);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(257.57359312880715);
                BC1.setY(342.42640687119285);

                LineTo CD1 = new LineTo();
                CD1.setX(264.6446609406726);
                CD1.setY(335.3553390593274);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(50);
                CA1.setRadiusY(50);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(250);
                CA1.setY(300);

                path14.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path14);
            }
            {
                Path path22 = new Path();
                path22.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(240);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(230);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(70);
                BC1.setRadiusY(70);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(250.50252531694167);
                BC1.setY(349.49747468305833);

                LineTo CD1 = new LineTo();
                CD1.setX(257.57359312880715);
                CD1.setY(342.42640687119285);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(60);
                CA1.setRadiusY(60);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(240);
                CA1.setY(300);

                path22.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path22);
            }
            {
                Path path30 = new Path();
                path30.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(230);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(220);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(80);
                BC1.setRadiusY(80);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(243.4314575050762);
                BC1.setY(356.5685424949238);

                LineTo CD1 = new LineTo();
                CD1.setX(250.50252531694167);
                CD1.setY(349.49747468305833);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(70);
                CA1.setRadiusY(70);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(230);
                CA1.setY(300);

                path30.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path30);
            }
            {
                Path path38 = new Path();
                path38.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(220);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(210);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(90);
                BC1.setRadiusY(90);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(236.36038969321072);
                BC1.setY(363.6396103067893);

                LineTo CD1 = new LineTo();
                CD1.setX(243.4314575050762);
                CD1.setY(356.5685424949238);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(80);
                CA1.setRadiusY(80);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(220);
                CA1.setY(300);

                path38.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path38);
            }
            {
                Path path46 = new Path();
                path46.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(210);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(200);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(100);
                BC1.setRadiusY(100);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(229.28932188134524);
                BC1.setY(370.71067811865476);

                LineTo CD1 = new LineTo();
                CD1.setX(236.36038969321072);
                CD1.setY(363.6396103067893);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(90);
                CA1.setRadiusY(90);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(210);
                CA1.setY(300);

                path46.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path46);
            }
            {
                Path path54 = new Path();
                path54.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(200);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(190);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(110);
                BC1.setRadiusY(110);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(222.21825406947977);
                BC1.setY(377.78174593052023);

                LineTo CD1 = new LineTo();
                CD1.setX(229.28932188134524);
                CD1.setY(370.71067811865476);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(100);
                CA1.setRadiusY(100);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(200);
                CA1.setY(300);

                path54.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path54);
            }
            {
                Path path62 = new Path();
                path62.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(190);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(180);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(120);
                BC1.setRadiusY(120);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(215.1471862576143);
                BC1.setY(384.8528137423857);

                LineTo CD1 = new LineTo();
                CD1.setX(222.21825406947977);
                CD1.setY(377.78174593052023);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(110);
                CA1.setRadiusY(110);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(190);
                CA1.setY(300);

                path62.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path62);
            }
            {
                Path path70 = new Path();
                path70.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(180);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(170);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(130);
                BC1.setRadiusY(130);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(208.07611844574882);
                BC1.setY(391.9238815542512);

                LineTo CD1 = new LineTo();
                CD1.setX(215.1471862576143);
                CD1.setY(384.8528137423857);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(120);
                CA1.setRadiusY(120);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(180);
                CA1.setY(300);

                path70.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path70);
            }
            {
                Path path78 = new Path();
                path78.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(170);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(160);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(140);
                BC1.setRadiusY(140);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(201.00505063388334);
                BC1.setY(398.99494936611666);

                LineTo CD1 = new LineTo();
                CD1.setX(208.07611844574882);
                CD1.setY(391.9238815542512);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(130);
                CA1.setRadiusY(130);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(170);
                CA1.setY(300);

                path78.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path78);
            }
            {
                Path path86 = new Path();
                path86.setStroke(Color.BLACK);

                MoveTo A1 = new MoveTo();
                A1.setX(160);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(150);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(150);
                BC1.setRadiusY(150);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(193.93398282201787);
                BC1.setY(406.06601717798213);

                LineTo CD1 = new LineTo();
                CD1.setX(201.00505063388334);
                CD1.setY(398.99494936611666);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(140);
                CA1.setRadiusY(140);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(160);
                CA1.setY(300);

                path86.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path86);
            }
            {
                Path path94 = new Path();
                path94.setStroke(Color.RED);

                MoveTo A1 = new MoveTo();
                A1.setX(150);
                A1.setY(300);

                LineTo AB1 = new LineTo();
                AB1.setX(140);
                AB1.setY(300);

                ArcTo BC1 = new ArcTo();
                BC1.setRadiusX(160);
                BC1.setRadiusY(160);
                BC1.setXAxisRotation(45);
                BC1.setSweepFlag(false);
                BC1.setX(186.8629150101524);
                BC1.setY(413.1370849898476);

                LineTo CD1 = new LineTo();
                CD1.setX(193.93398282201787);
                CD1.setY(406.06601717798213);

                ArcTo CA1 = new ArcTo();
                CA1.setRadiusX(150);
                CA1.setRadiusY(150);
                CA1.setXAxisRotation(45);
                CA1.setSweepFlag(true);
                CA1.setX(150);
                CA1.setY(300);

                path94.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path94);
            }
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