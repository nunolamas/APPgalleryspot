package app.view.dashboards;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ExploreGalleries extends BorderPane {

    public ExploreGalleries(){

        doExploreGalleries();
    }

    public void doExploreGalleries() {
// * ------------------------------------------------------------------------------------- * CENTER PART * ----- *
        CornerRadii roundedCorners = new CornerRadii(10);
        BackgroundFill backgroundFill = new BackgroundFill(Color.WHITE, roundedCorners, javafx.geometry.Insets.EMPTY);
        Background background = new Background(backgroundFill);

        CornerRadii roundedCorners3 = new CornerRadii(0, 0, 10, 10, false);
        BackgroundFill backgroundFill3 = new BackgroundFill(Color.WHITE, roundedCorners3, javafx.geometry.Insets.EMPTY);
        Background backgroundWhite = new Background(backgroundFill3);

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0, 0, 0, 0.3));

// * ----------------------------------- * TOP PART OF CENTER PART * ----- *

        VBox emptyspace3 = new VBox(100);

        VBox centerPaneForTopPart = new VBox(20);

        VBox centerBorderPane = new VBox(10);

// * -------------------- * BIG THUMBNAIL * ----- *

        VBox boxForImageAndInfo1 = new VBox();

        ImageView imageViewForBigImage1 = new ImageView();

        Image bigImage1 = new Image("images/51cdbed68b3b81092d000025.jpg");
        imageViewForBigImage1.setImage(bigImage1);
        imageViewForBigImage1.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        imageViewForBigImage1.setFitHeight(300);

        VBox boxForDescription1 = new VBox(10);
        HBox boxToPlaceDescription1 = new HBox(10);

        Text galleryName1 = new Text("NAME OF THE GALLERY");
        galleryName1.setFont(new Font("Trebuchet MS", 18));
        Text separator1 = new Text("|");
        separator1.setFont(new Font("Trebuchet MS", 20));
        Text galleryRegion1 = new Text("REGION");
        Text separator2 = new Text("|");
        separator1.setFont(new Font("Trebuchet MS", 20));

        galleryRegion1.setFont(new Font("Trebuchet MS", 18));
        Text gallerySite1 = new Text("WEBSITE");
        gallerySite1.setFont(new Font("Trebuchet MS", 18));

        boxToPlaceDescription1.getChildren().addAll(galleryName1, separator1, galleryRegion1, separator2, gallerySite1);
        boxToPlaceDescription1.setAlignment(Pos.CENTER);
        boxToPlaceDescription1.setPadding(new Insets(15, 10, 15, 10));

        boxForDescription1.getChildren().add(boxToPlaceDescription1);
        boxForDescription1.setBackground(backgroundWhite);
        boxForDescription1.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        boxForDescription1.setAlignment(Pos.CENTER);
        boxForDescription1.setPadding(new Insets(0, 10, 1, 10));


        boxForImageAndInfo1.getChildren().addAll(imageViewForBigImage1, boxForDescription1);
        boxForImageAndInfo1.setAlignment(Pos.CENTER);
        boxForImageAndInfo1.setEffect(dropShadow);

//-----------------------------

        VBox boxForImageAndInfo2 = new VBox();

        ImageView imageViewForBigImage2 = new ImageView();

        Image bigImage2 = new Image("images/51cdbed68b3b81092d000025.jpg");
        imageViewForBigImage2.setImage(bigImage2);
        imageViewForBigImage2.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        imageViewForBigImage2.setFitHeight(300);

        VBox boxForDescription2 = new VBox(10);
        HBox boxToPlaceDescription2 = new HBox(10);

        Text galleryName2 = new Text("NAME OF THE GALLERY");
        galleryName2.setFont(new Font("Trebuchet MS", 18));
        Text separator3 = new Text("|");
        separator2.setFont(new Font("Trebuchet MS", 20));
        Text galleryRegion2 = new Text("REGION");
        Text separator4 = new Text("|");
        separator2.setFont(new Font("Trebuchet MS", 20));

        galleryRegion2.setFont(new Font("Trebuchet MS", 18));
        Text gallerySite2 = new Text("WEBSITE");
        gallerySite2.setFont(new Font("Trebuchet MS", 18));

        boxToPlaceDescription2.getChildren().addAll(galleryName2, separator3, galleryRegion2, separator4, gallerySite2);
        boxToPlaceDescription2.setAlignment(Pos.CENTER);
        boxToPlaceDescription2.setPadding(new Insets(15, 10, 15, 10));

        boxForDescription2.getChildren().add(boxToPlaceDescription2);
        boxForDescription2.setBackground(backgroundWhite);
        boxForDescription2.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        boxForDescription2.setAlignment(Pos.CENTER);
        boxForDescription2.setPadding(new Insets(0, 10, 1, 10));


        boxForImageAndInfo2.getChildren().addAll(imageViewForBigImage2, boxForDescription2);
        boxForImageAndInfo2.setAlignment(Pos.CENTER);
        boxForImageAndInfo2.setEffect(dropShadow);

//-----------------------------

        centerPaneForTopPart.getChildren().addAll(boxForImageAndInfo1, boxForImageAndInfo2);
        centerPaneForTopPart.setAlignment(Pos.CENTER);

// * ----------------------------------- * CENTER OF CENTER PART * ----- *

// * ------------------------------------------------------------------------------------- * BOTTOM PART * ----- *

        VBox emptyspace1 = new VBox(100);

// * ------------------------------------------------------------------------------------- * ALIGNMENT * ----- *

        centerBorderPane.getChildren().addAll(emptyspace3, centerPaneForTopPart, emptyspace1);
        centerBorderPane.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth() - 55);
        centerBorderPane.setPrefHeight(1000);
        centerBorderPane.setAlignment(Pos.CENTER);
        centerBorderPane.setStyle("-fx-background-color: lightgray;");

        ScrollPane scrollPane = new ScrollPane(centerBorderPane);
        scrollPane.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());

        setCenter(scrollPane);
    }
}
