package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        scene.setFill(Color.rgb(0,128, 129));

        Double[] x1 = {100., 190., 140., 50.};
        Double[] y1 = {20., 55., 80. ,60.};
        Polygon p1 = new Polygon();
        p1.setFill(Color.rgb(0, 255, 1));
        for (int i = 0; i < x1.length; i++) {
            p1.getPoints().add(x1[i]);
            p1.getPoints().add(y1[i]);
        }

        Double[] x2 = x1.clone();
        Double[] y2 = y1.clone();
        x2[0] = x2[3] + 30;
        x2[1] = x2[2] + 15;
        y2[0] = y2[3] + 60;
        y2[1] = y2[2] + 30;

        Polygon p2 = new Polygon();
        p2.setFill(Color.rgb(0, 255, 1));
        for (int i = 0; i < x2.length; i++) {
            p2.getPoints().add(x2[i]);
            p2.getPoints().add(y2[i]);
        }

        Line line = new Line(x1[2], y1[2], x1[3], y1[3]);
        line.setStrokeWidth(3);

        Polygon p3 = new Polygon();
        p3.setFill(Color.YELLOW);
        p3.getPoints().add(x1[1] - 10);
        p3.getPoints().add(y1[1] + 17);
        p3.getPoints().add(x1[2] + 10);
        p3.getPoints().add(y1[2]);
        p3.getPoints().add(x2[1] + 7);
        p3.getPoints().add(y2[1] - 10);

        Rectangle r1 = new Rectangle();
        r1.setFill(Color.rgb(4, 126, 6));
        r1.setX(80);
        r1.setY(80);
        r1.setWidth(7);
        r1.setHeight(7);

        Rectangle r2 = new Rectangle();
        r2.setFill(Color.rgb(4, 126, 6));
        r2.setX(90);
        r2.setY(50);
        r2.setWidth(7);
        r2.setHeight(7);

        Line line1 = new Line(63, 90, 30, 100);
        line1.setStrokeWidth(5);

        Line line2 = new Line(63, 47, 30, 15);
        line2.setStrokeWidth(5);

        root.getChildren().add(p1);
        root.getChildren().add(p2);
        root.getChildren().add(p3);
        root.getChildren().add(r1);
        root.getChildren().add(r2);
        root.getChildren().add(line);
        root.getChildren().add(line1);
        root.getChildren().add(line2);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
