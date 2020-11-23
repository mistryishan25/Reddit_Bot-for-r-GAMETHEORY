
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
    // List<Path> disc = new ArrayList<>(96); //creating index gives an error
    // basically unable to run if this line is not commented.

    @Override
    public void start(Stage stage) {

        // Creating a Group object
        javafx.scene.Group root = new javafx.scene.Group();

        Rotate rotate1 = new Rotate(45, 300, 300);
        Rotate rotate2 = new Rotate(90, 300, 300);
        Rotate rotate3 = new Rotate(135, 300, 300);
        Rotate rotate4 = new Rotate(180, 300, 300);
        Rotate rotate5 = new Rotate(225, 300, 300);
        Rotate rotate6 = new Rotate(270, 300, 300);
        Rotate rotate7 = new Rotate(315, 300, 300);

        Line line1 = new Line(140, 300, 460, 300);
        line1.setStroke(Color.LIGHTGRAY);
        Line line2 = new Line(300, 140, 300, 460);
        line2.setStroke(Color.LIGHTGRAY);
        Line line3 = new Line(300, 140, 300, 460);
        line3.setStroke(Color.LIGHTGRAY);
        line3.getTransforms().add(rotate1);
        Line line4 = new Line(140, 300, 460, 300);
        line4.setStroke(Color.LIGHTGRAY);
        line4.getTransforms().add(rotate1);
        root.getChildren().addAll(line1, line2, line3, line4);

        /*
         * for (double i = 40; i < 170; i += 10) { Circle circle1 = new Circle(300.0f,
         * 300.0f, i);
         * 
         * circle1.setFill(null); circle1.setStroke(Color.BLACK);
         * circle1.setStrokeWidth(2); root.getChildren().addAll(circle1); // commenting
         * this just wont show the // circles to the screen
         * 
         * for (double j = 0; j <= 315; j += 45) { // getting the corodinates of the
         * line cutting the circle double J = Math.toRadians(j); double x_mid = 300 + (i
         * * Math.cos(J)); double y_mid = 300 + (i * Math.sin(J));
         * System.out.println("circle with radius  " + i +
         * "  with line angle intersect at  " + j + "  X =  " + x_mid + "  Y =  " +
         * y_mid); }
         * 
         * }
         */
        // Vector<Path> discVector = new Vector<Path>(96); // vector initalized
        // Path[] Paths = new Path[96];
        List<Path> list = new ArrayList<Path>(96);
        // ARRRAY STARTS FROM "0" SO EACH PATH LOCATED AT -1TH POSITION
        {

            {

                Path path1 = new Path();
                path1.setStroke(Color.BLACK);

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

                path1.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path1.getTransforms().addAll(rotate3);
                root.getChildren().addAll(path1);
                list.add(path1);

            }
            {

                Path path2 = new Path();
                path2.setStroke(Color.BLACK);

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

                path2.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path2.getTransforms().addAll(rotate4);
                root.getChildren().addAll(path2);
                list.add(path2);

            }
            {

                Path path3 = new Path();
                path3.setStroke(Color.BLACK);

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

                path3.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path3.getTransforms().addAll(rotate5);
                root.getChildren().addAll(path3);
                list.add(path3);

            }
            {

                Path path4 = new Path();
                path4.setStroke(Color.BLACK);

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

                path4.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path4.getTransforms().addAll(rotate6);
                root.getChildren().addAll(path4);
                list.add(path4);

            }
            {

                Path path5 = new Path();
                path5.setStroke(Color.BLACK);

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

                path5.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path5.getTransforms().addAll(rotate7);
                root.getChildren().addAll(path5);
                list.add(path5);

            }
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
                list.add(path6);

            }
            {

                Path path7 = new Path();
                path7.setStroke(Color.BLACK);

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

                path7.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path7);
                path7.getTransforms().add(rotate1);
                list.add(path7);

            }
            {

                Path path8 = new Path();
                path8.setStroke(Color.BLACK);

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

                path8.getElements().addAll(A1, AB1, BC1, CD1, CA1);

                root.getChildren().addAll(path8);
                path8.getTransforms().add(rotate2);

                list.add(path8);

            }
            {
                Path path9 = new Path();
                path9.setStroke(Color.BLACK);

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

                path9.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path9);
                path9.getTransforms().addAll(rotate3);
                root.getChildren().addAll(path9);
                list.add(path9);

            }
            {
                Path path10 = new Path();
                path10.setStroke(Color.BLACK);

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

                path10.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path10);
                path10.getTransforms().addAll(rotate4);
                root.getChildren().addAll(path10);

            }
            {
                Path path11 = new Path();
                path11.setStroke(Color.BLACK);

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

                path11.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path11);
                path11.getTransforms().addAll(rotate5);
                root.getChildren().addAll(path11);

            }
            {
                Path path12 = new Path();
                path12.setStroke(Color.BLACK);

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

                path12.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path12);
                path12.getTransforms().addAll(rotate6);
                root.getChildren().addAll(path12);

            }
            {
                Path path13 = new Path();
                path13.setStroke(Color.BLACK);

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

                path13.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path13);
                path13.getTransforms().addAll(rotate7);
                root.getChildren().addAll(path13);
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
                list.add(path14);

                root.getChildren().addAll(path14);
            }
            {
                Path path15 = new Path();
                path15.setStroke(Color.BLACK);

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

                path15.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path15);
                path15.getTransforms().addAll(rotate1);
                root.getChildren().addAll(path15);

            }
            {
                Path path16 = new Path();
                path16.setStroke(Color.BLACK);

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

                path16.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                list.add(path16);
                path16.getTransforms().addAll(rotate2);
                root.getChildren().addAll(path16);

            }
            {
                Path path17 = new Path();
                path17.setStroke(Color.BLACK);
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

                path17.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path17.getTransforms().add(rotate3);
                list.add(path17);
                root.getChildren().addAll(path17);
            }

            {
                Path path18 = new Path();
                path18.setStroke(Color.BLACK);
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

                path18.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path18.getTransforms().add(rotate4);
                list.add(path18);
                root.getChildren().addAll(path18);
            }
            {
                Path path19 = new Path();
                path19.setStroke(Color.BLACK);
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

                path19.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path19.getTransforms().add(rotate5);
                list.add(path19);
                root.getChildren().addAll(path19);
            }
            {
                Path path20 = new Path();
                path20.setStroke(Color.BLACK);
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

                path20.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path20.getTransforms().add(rotate6);
                list.add(path20);
                root.getChildren().addAll(path20);
            }
            {
                Path path21 = new Path();
                path21.setStroke(Color.BLACK);
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

                path21.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path21.getTransforms().add(rotate7);
                list.add(path21);
                root.getChildren().addAll(path21);
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
                list.add(path22);

                root.getChildren().addAll(path22);
            }
            {
                Path path23 = new Path();
                path23.setStroke(Color.BLACK);
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

                path23.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path23.getTransforms().add(rotate1);
                list.add(path23);
                root.getChildren().addAll(path23);
            }
            {
                Path path24 = new Path();
                path24.setStroke(Color.BLACK);
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

                path24.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path24.getTransforms().add(rotate2);
                list.add(path24);
                root.getChildren().addAll(path24);
            }

            {
                Path path25 = new Path();
                path25.setStroke(Color.BLACK);

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

                path25.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path25.getTransforms().add(rotate3);
                list.add(path25);
                root.getChildren().addAll(path25);
            }
            {
                Path path26 = new Path();
                path26.setStroke(Color.BLACK);

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

                path26.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path26.getTransforms().add(rotate4);
                list.add(path26);
                root.getChildren().addAll(path26);
            }
            {
                Path path27 = new Path();
                path27.setStroke(Color.BLACK);

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

                path27.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path27.getTransforms().add(rotate5);
                list.add(path27);
                root.getChildren().addAll(path27);
            }
            {
                Path path28 = new Path();
                path28.setStroke(Color.BLACK);

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

                path28.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path28.getTransforms().add(rotate6);
                list.add(path28);
                root.getChildren().addAll(path28);
            }
            {
                Path path29 = new Path();
                path29.setStroke(Color.BLACK);

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

                path29.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path29.getTransforms().add(rotate7);
                list.add(path29);
                root.getChildren().addAll(path29);
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
                list.add(path30);
                root.getChildren().addAll(path30);
            }
            {
                Path path31 = new Path();
                path31.setStroke(Color.BLACK);

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

                path31.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path31.getTransforms().add(rotate1);
                list.add(path31);
                root.getChildren().addAll(path31);
            }
            {
                Path path32 = new Path();
                path32.setStroke(Color.BLACK);

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

                path32.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path32.getTransforms().add(rotate2);
                list.add(path32);
                root.getChildren().addAll(path32);
            }
            {
                Path path33 = new Path();
                path33.setStroke(Color.BLACK);

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

                path33.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path33.getTransforms().add(rotate3);
                list.add(path33);
                root.getChildren().addAll(path33);
            }
            {
                Path path34 = new Path();
                path34.setStroke(Color.BLACK);

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

                path34.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path34.getTransforms().add(rotate4);
                list.add(path34);
                root.getChildren().addAll(path34);
            }
            {
                Path path35 = new Path();
                path35.setStroke(Color.BLACK);

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

                path35.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path35.getTransforms().add(rotate5);
                list.add(path35);
                root.getChildren().addAll(path35);
            }
            {
                Path path36 = new Path();
                path36.setStroke(Color.BLACK);

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

                path36.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path36.getTransforms().add(rotate6);
                list.add(path36);
                root.getChildren().addAll(path36);

            }
            {
                Path path37 = new Path();
                path37.setStroke(Color.BLACK);

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

                path37.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path37.getTransforms().add(rotate7);
                list.add(path37);
                root.getChildren().addAll(path37);
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
                list.add(path38);
                root.getChildren().addAll(path38);
            }
            {
                Path path39 = new Path();
                path39.setStroke(Color.BLACK);

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

                path39.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path39.getTransforms().add(rotate1);
                list.add(path39);
                root.getChildren().addAll(path39);
            }
            {
                Path path40 = new Path();
                path40.setStroke(Color.BLACK);

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

                path40.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path40.getTransforms().add(rotate2);
                list.add(path40);
                root.getChildren().addAll(path40);
            }
            {
                Path path41 = new Path();
                path41.setStroke(Color.BLACK);

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

                path41.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path41.getTransforms().add(rotate3);
                list.add(path41);

                root.getChildren().addAll(path41);
            }
            {
                Path path42 = new Path();
                path42.setStroke(Color.BLACK);

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

                path42.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path42.getTransforms().add(rotate4);
                list.add(path42);

                root.getChildren().addAll(path42);
            }
            {
                Path path43 = new Path();
                path43.setStroke(Color.BLACK);

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

                path43.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path43.getTransforms().add(rotate5);
                list.add(path43);

                root.getChildren().addAll(path43);
            }
            {
                Path path44 = new Path();
                path44.setStroke(Color.BLACK);

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

                path44.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path44.getTransforms().add(rotate6);
                list.add(path44);

                root.getChildren().addAll(path44);
            }
            {
                Path path45 = new Path();
                path45.setStroke(Color.BLACK);

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

                path45.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path45.getTransforms().add(rotate7);
                list.add(path45);

                root.getChildren().addAll(path45);
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
                list.add(path46);

                root.getChildren().addAll(path46);
            }
            {
                Path path47 = new Path();
                path47.setStroke(Color.BLACK);

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

                path47.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path47.getTransforms().add(rotate1);
                list.add(path47);

                root.getChildren().addAll(path47);
            }
            {
                Path path48 = new Path();
                path48.setStroke(Color.BLACK);

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

                path48.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path48.getTransforms().add(rotate2);
                list.add(path48);

                root.getChildren().addAll(path48);
            }
            {
                Path path49 = new Path();
                path49.setStroke(Color.BLACK);

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

                path49.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path49.getTransforms().add(rotate3);
                list.add(path49);

                root.getChildren().addAll(path49);
            }
            {
                Path path50 = new Path();
                path50.setStroke(Color.BLACK);

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

                path50.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path50.getTransforms().add(rotate4);
                list.add(path50);

                root.getChildren().addAll(path50);
            }
            {
                Path path51 = new Path();
                path51.setStroke(Color.BLACK);

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

                path51.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path51.getTransforms().add(rotate5);
                list.add(path51);

                root.getChildren().addAll(path51);
            }
            {
                Path path52 = new Path();
                path52.setStroke(Color.BLACK);

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

                path52.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path52.getTransforms().add(rotate6);
                list.add(path52);

                root.getChildren().addAll(path52);
            }
            {
                Path path53 = new Path();
                path53.setStroke(Color.BLACK);

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

                path53.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path53.getTransforms().add(rotate7);
                list.add(path53);

                root.getChildren().addAll(path53);
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
                list.add(path54);
                root.getChildren().addAll(path54);
            }
            {
                Path path55 = new Path();
                path55.setStroke(Color.BLACK);

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

                path55.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path55.getTransforms().add(rotate1);
                list.add(path55);

                root.getChildren().addAll(path55);
            }
            {
                Path path56 = new Path();
                path56.setStroke(Color.BLACK);

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

                path56.getElements().addAll(A1, AB1, BC1, CD1, CA1);
                path56.getTransforms().add(rotate2);
                list.add(path56);

                root.getChildren().addAll(path56);
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

        int writehead = 0; // input from the button

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