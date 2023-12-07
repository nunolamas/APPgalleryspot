package app.view.dashboards;

import app.view.auxitems.Thumbnails;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ExploreArtworks extends BorderPane {

    public ExploreArtworks() {

        doExploreArtworksLayout();
    }

    public void doExploreArtworksLayout() {

        setPadding(new javafx.geometry.Insets(10, 20, 10, 20));

        VBox emptyspace2 = new VBox(100);

        VBox centerBorderPane = new VBox(10);

// * ------------------------------------------------------------------------------------- * THUMBNAILS * ----- *

        HBox boxOfSides = new HBox();
        boxOfSides.setAlignment(Pos.CENTER);
        boxOfSides.setPadding(new Insets(0,60,0,0));


        VBox leftSideOfTheBorder = new VBox();
        leftSideOfTheBorder.setPadding(new Insets(0,60,0,0));

        VBox rightSideOfTheBorder = new VBox(50);

        CornerRadii roundedCorners = new CornerRadii(10);
        BackgroundFill backgroundFill = new BackgroundFill(Color.WHITE, roundedCorners, javafx.geometry.Insets.EMPTY);
        Background background = new Background(backgroundFill);

        VBox boxOfFilters = new VBox(30);

        VBox filtersBox = new VBox();

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0, 0, 0, 0.3));
        filtersBox.setBackground(background);
        filtersBox.setEffect(dropShadow);

        //boxOfFilters.getChildren().add(rectangle);
        boxOfFilters.setAlignment(Pos.CENTER);

        leftSideOfTheBorder.getChildren().add(boxOfFilters);
        leftSideOfTheBorder.setAlignment(Pos.BASELINE_LEFT);

        VBox boxOfThumbnails = new VBox(30);

        HBox rowOfThumbnails1 = new HBox(30);


// * ----------------------------------- * COLUMNS OF THUMBNAILS * ----- *

        int count = 0;
        while (count < 4) {
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

        rightSideOfTheBorder.getChildren().add(boxOfThumbnails);
        rightSideOfTheBorder.setAlignment(Pos.TOP_RIGHT);

        boxOfSides.getChildren().addAll(leftSideOfTheBorder, rightSideOfTheBorder);

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

        centerBorderPane.getChildren().addAll(emptyspace2, boxOfSides, emptyspace5, boxForShowMoreText, bottline, boxForShowMoreButton, emptyspace6);
        centerBorderPane.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        centerBorderPane.setPrefHeight(3000);
        centerBorderPane.setAlignment(Pos.CENTER);

        ScrollPane scrollPane = new ScrollPane(centerBorderPane);

        centerBorderPane.setStyle("-fx-background-color: lightgray;");

        setCenter(scrollPane);

// * ------------- * LAYOUT RIGHT * ----- *
// * ------------- * LAYOUT BOTTOM * ----- *
    }
}
