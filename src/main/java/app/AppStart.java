package app;
import app.view.AppView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class AppStart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AppView landingPage = new AppView();

        Scene sceneForLandingPage = new Scene(landingPage);

        primaryStage.setScene(sceneForLandingPage);
        primaryStage.setFullScreen(false);
        primaryStage.setTitle("GallerySpot");
        primaryStage.show();

    }
}
