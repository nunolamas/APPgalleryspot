package app.view.auxitems;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;


import java.io.File;
import java.util.Random;

    public class ImagesArray {

        public static ImageView getRandomImageView() {
            File folder = new File("resources/images");
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles != null && listOfFiles.length > 0) {
                Random random = new Random();
                int randomIndex = random.nextInt(listOfFiles.length);

                File randomImageFile = listOfFiles[randomIndex];
                Image randomImage = new Image(randomImageFile.toURI().toString());

                ImageView imageView = new ImageView(randomImage);
                imageView.setFitWidth(((Screen.getPrimary().getVisualBounds().getWidth())-320)/5);
                imageView.setPreserveRatio(true);

                return imageView;
            }

            return null;
        }

    }