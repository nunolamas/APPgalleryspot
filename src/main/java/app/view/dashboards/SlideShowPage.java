package app.view.dashboards;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public class SlideShowPage extends BorderPane {

    public SlideShowPage(){
        doSlideShowPage();
    }

    public void doSlideShowPage() {

        // * ------------- * LAYOUT TOP * ----- *
// * ------------- * LAYOUT CENTER * ----- *

        VBox emptyspace = new VBox(100);

        VBox centerPaneForBigImage = new VBox(10);

        VBox centerBorderPane = new VBox(10);

// * ------------------------------------------------------------------------------------- * CENTER IMAGE * ----- *

        ImageView imageViewForBigImage = new ImageView();

        Image bigImage = new Image("images/4eaeecc3d2a5820001006e93.jpg");
        imageViewForBigImage.setImage(bigImage);
        imageViewForBigImage.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth()-120);
        imageViewForBigImage.setPreserveRatio(true);

        centerPaneForBigImage.getChildren().add(imageViewForBigImage);
        centerPaneForBigImage.setAlignment(Pos.TOP_CENTER);

        VBox emptyspace2 = new VBox(100);


// * ------------------------------------------------------------------------------------- * RADIO BUTTONS * ----- *

        VBox boxForButton = new VBox(10);

        Button slideshowButton = new Button("Start Slideshow");

        boxForButton.getChildren().add(slideshowButton);

        VBox emptyspace3 = new VBox(100);


        centerBorderPane.getChildren().addAll(emptyspace, centerPaneForBigImage, emptyspace2, slideshowButton, emptyspace3);
        centerBorderPane.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth()-55);
        centerBorderPane.setPrefHeight(Screen.getPrimary().getVisualBounds().getWidth()-800);

        // PRECISAMOS DE GARANTIR QUE A ALTURA ESTA DEPENDENTE DO TAMANHO DA IMAGEM, AINDA NAO FIZ ISSO

        centerBorderPane.setStyle("-fx-background-color: lightgray;");
        centerBorderPane.setAlignment(Pos.CENTER);

        ScrollPane scrollPane = new ScrollPane(centerBorderPane);
        scrollPane.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());

        setCenter(scrollPane);
    }
}
