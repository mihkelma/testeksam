import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX extends Application{

        Stage lava;
        VBox aken;

        @Override
        public void start(Stage primaryStage) throws Exception {
            lava = primaryStage;
            aken = new VBox();

            Circle ring = new Circle(60, Paint.valueOf("003300"));
            ring.setStroke(Paint.valueOf("99AAEE"));
            ring.setStrokeWidth(3);


            Slider slider = new Slider();
            slider.setMin(0);
            slider.setMax(30);
            slider.setShowTickLabels(true);
            slider.setShowTickMarks(true);
            slider.setMinorTickCount(5);
            slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
                        System.out.println(uusVaartus);
                        ring.setStrokeWidth(uusVaartus.intValue());
                    }
            );

            aken.getChildren().addAll(slider, ring);

            Scene stseen = new Scene(aken, 300, 300);
            lava.setScene(stseen);
            lava.show();
            lava.setOnCloseRequest(event -> System.exit(0));
        }
}



