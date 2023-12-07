package app.view.dashboards;

import app.view.auxitems.Thumbnails;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class LandingPage extends BorderPane {

    public LandingPage() {

// * ------------- * LAYOUT TOP * ----- *
// * ------------- * LAYOUT CENTER * ----- *

        VBox emptyspace2 = new VBox(100);

        VBox centerPaneForBigImage = new VBox(10);

        VBox centerBorderPane = new VBox(10);

// * ------------------------------------------------------------------------------------- * CENTER IMAGE * ----- *

        ImageView imageViewForBigImage = new ImageView();

        Image bigImage = new Image("images/4eaeecc3d2a5820001006e93.jpg");
        imageViewForBigImage.setImage(bigImage);
        imageViewForBigImage.setFitWidth(1525);
        imageViewForBigImage.setFitHeight(800);

        centerPaneForBigImage.getChildren().add(imageViewForBigImage);
        centerPaneForBigImage.setAlignment(Pos.TOP_CENTER);

// * ------------------------------------------------------------------------------------- * RADIO BUTTONS * ----- *

        VBox boxForBarOfRadioButtons = new VBox(10);

        HBox barForRadioButtons = new HBox(20);
        RadioButton buttonForBigImage1 = new RadioButton();
        RadioButton buttonForBigImage2 = new RadioButton();
        RadioButton buttonForBigImage3 = new RadioButton();
        RadioButton buttonForBigImage4 = new RadioButton();
        RadioButton buttonForBigImage5 = new RadioButton();

        barForRadioButtons.getChildren().addAll(buttonForBigImage1, buttonForBigImage2, buttonForBigImage3, buttonForBigImage4, buttonForBigImage5);
        barForRadioButtons.setAlignment(Pos.CENTER);

        boxForBarOfRadioButtons.getChildren().add(barForRadioButtons);

// * ------------------------------------------------------------------------------------- * THUMBNAILS * ----- *

        VBox emptyspace3 = new VBox(100);

        VBox midLine = new VBox(10);
        Line line2 = new Line(0, 0, 1000, 0);

        midLine.getChildren().add(line2);
        midLine.setAlignment(Pos.CENTER);

        VBox emptyspace4 = new VBox(100);

        VBox boxOfThumbnails = new VBox(10);
        HBox rowOfThumbnails1 = new HBox(30);

// * ----------------------------------- * COLUMNS OF THUMBNAILS * ----- *

        int count = 0;
        while (count < 5) {
            VBox columnOfThumbnails = new VBox(40);
            int countAux = 0;
            while (countAux < 5) {
                columnOfThumbnails.getChildren().add(new Thumbnails().doThumbnails());
                countAux ++;
            }

            rowOfThumbnails1.getChildren().add(columnOfThumbnails);
            count++;
        }

        rowOfThumbnails1.setAlignment(Pos.CENTER);

        boxOfThumbnails.getChildren().add(rowOfThumbnails1);
        boxOfThumbnails.setAlignment(Pos.CENTER);

// * ------------------------------------------------------------------------------------- * ALIGNMENT * ----- *

        VBox emptyspace5 = new VBox(100);

        VBox boxForShowMoreText = new VBox(10);
        Text showMoreTextArea = new Text("Show more Artworks");

        boxForShowMoreText.getChildren().add(showMoreTextArea);
        boxForShowMoreText.setAlignment(Pos.CENTER);

        VBox bottline = new VBox(10);
        Line line3 = new Line(0, 0, 1000, 0);

        bottline.getChildren().add(line3);
        bottline.setAlignment(Pos.CENTER);

        VBox emptyspace6 = new VBox(100);

        VBox boxForShowMoreButton = new VBox(100);
        Button showMore = new Button("V");

        boxForShowMoreButton.getChildren().add(showMore);
        boxForShowMoreButton.setAlignment(Pos.CENTER);

        centerBorderPane.getChildren().addAll(emptyspace2, centerPaneForBigImage, boxForBarOfRadioButtons, emptyspace3, midLine, emptyspace4, boxOfThumbnails, emptyspace5, boxForShowMoreText, bottline, boxForShowMoreButton, emptyspace6);
        //centerBorderPane.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        centerBorderPane.setPrefHeight(3000);

        ScrollPane scrollPane = new ScrollPane(centerBorderPane);

        centerBorderPane.setStyle("-fx-background-color: lightgray;");

        setCenter(scrollPane);

// * ------------- * LAYOUT RIGHT * ----- *
// * ------------- * LAYOUT BOTTOM * ----- *
    }
}