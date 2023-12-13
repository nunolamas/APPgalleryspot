package app.view.dashboards;

import app.view.auxitems.Thumbnails;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import javax.swing.*;
import java.text.DecimalFormat;

public class ExploreArtworks extends BorderPane {

    public ExploreArtworks() {

        doExploreArtworksLayout();
    }

    public void doExploreArtworksLayout() {
// * ------------------------------------------------------------------------------------- * CENTER PART * ----- *

        VBox emptyspace = new VBox(10);

        VBox centerBorderPane = new VBox(10);

        HBox boxOfSides = new HBox(50);
        boxOfSides.setAlignment(Pos.CENTER);
        VBox leftSideOfTheBorder = new VBox(10);
        VBox rightSideOfTheBorder = new VBox(50);

// * ----------------------------------- * LEFT SIDE OF CENTER PART * ----- *

        VBox boxOfFilters = new VBox(2);
        CornerRadii roundedCorners = new CornerRadii(10);
        BackgroundFill backgroundFill = new BackgroundFill(Color.WHITE, roundedCorners, javafx.geometry.Insets.EMPTY);
        Background background = new Background(backgroundFill);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0, 0, 0, 0.3));
        boxOfFilters.setBackground(background);
        boxOfFilters.setEffect(dropShadow);

        VBox boxForTextField = new VBox(10);
        boxForTextField.setPadding(new Insets(0,10,1,10));
        TextField searchField = new TextField("Search by...");
        searchField.setFont(new Font("Trebuchet MS", 10));
        searchField.setMaxWidth(225);
        searchField.setAlignment(Pos.CENTER_LEFT);
        CornerRadii roundedCorners1 = new CornerRadii(4);
        BackgroundFill backgroundFill2 = new BackgroundFill(Color.LIGHTGRAY, roundedCorners1, javafx.geometry.Insets.EMPTY);
        Background backgroundGray = new Background(backgroundFill2);
        searchField.setBackground(backgroundGray);
        boxForTextField.getChildren().add(searchField);
        boxForTextField.setAlignment(Pos.TOP_CENTER);

        Text text = new Text();

        VBox boxForLine = new VBox();
        boxForLine.setPadding(new Insets(5,10,5,10));
        Line line = new Line(0, 0, 250, 0);
        boxForLine.getChildren().add(line);

        Text priceText = new Text(" Price");

// * --------------------- * SLIDER * ----- *

        VBox boxForSlider = new VBox();
        boxForSlider.setPadding(new Insets(5,0,10,10));

        DecimalFormat df = new DecimalFormat("0.0");
        Slider minPriceSlider = new Slider(0,5000,0);
        minPriceSlider.setMaxWidth(220);
        Label minPriceLabel = new Label(" Minimum value: 0.00€");
        minPriceSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                minPriceLabel.setText(" Minimum value: " + df.format(newValue) + "€"));
        Slider maxPriceSlider = new Slider(0,5000,0);
        maxPriceSlider.setMaxWidth(220);
        Label maxPriceLabel = new Label(" Maximum value: 0.00€");
        maxPriceSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                maxPriceLabel.setText(" Maximum value: " + df.format(newValue) + "€"));
        boxForSlider.getChildren().addAll(priceText, minPriceSlider, minPriceLabel, maxPriceSlider, maxPriceLabel);

// * ------------------------------------- * CHECKBOXES * ----- *

// * ---------------- * CHECKBOX TIME PERIOD * ----- *

        VBox boxForTimePeriodCheckBoxes = new VBox(5);
        Text textForTimePeriodCheckBoxes = new Text("Time Period");
        boxForTimePeriodCheckBoxes.setPadding(new Insets(5,0,10,10));
        CheckBox checkBox2020s = new CheckBox("2020s");
        CheckBox checkBox2010s = new CheckBox("2010s");
        CheckBox checkBox2000s = new CheckBox("2000s");
        CheckBox checkBoxLate20C = new CheckBox("Late 20th Century");
        CheckBox checkBoxMid20C = new CheckBox("Mid 20th Century");
        CheckBox checkBoxEarly20C = new CheckBox("Early 20th Century");
        CheckBox checkBoxLate19C = new CheckBox("Late 19th Century");
        CheckBox checkBoxMid19C = new CheckBox("Mid 19th Century");
        CheckBox checkBoxEarly19C = new CheckBox("Early 19th Century");
        CheckBox checkBoxLate18C = new CheckBox("Late 18th Century");
        CheckBox checkBoxMid18C = new CheckBox("Mid 18th Century");
        CheckBox checkBoxEarly18C = new CheckBox("Early 18th Century");
        CheckBox checkBoxBefore18C = new CheckBox("Earlier than 18th Century");
        boxForTimePeriodCheckBoxes.getChildren().addAll(textForTimePeriodCheckBoxes, checkBox2020s, checkBox2010s,
                checkBox2000s, checkBoxLate20C, checkBoxMid20C, checkBoxEarly20C, checkBoxLate19C, checkBoxMid19C,
                checkBoxEarly19C, checkBoxLate18C, checkBoxMid18C, checkBoxEarly18C, checkBoxBefore18C);

// * ---------------- * CHECKBOX MEDIUM * ----- *

        VBox boxForMediumCheckBoxes = new VBox(5);
        Text textForMediumCheckBoxes = new Text("Time Period");
        boxForMediumCheckBoxes.setPadding(new Insets(5,0,10,10));
        CheckBox CheckBoxPainting = new CheckBox("Painting");
        CheckBox checkBoxPhotography = new CheckBox("Photography");
        CheckBox checkBoxSculpture = new CheckBox("Sculpture");
        CheckBox checkBoxPrint = new CheckBox("Prints");
        CheckBox checkBoxWorkOnPaper = new CheckBox("Work on Paper");
        CheckBox checkBoxNFT = new CheckBox("NFT");
        boxForMediumCheckBoxes.getChildren().addAll(textForMediumCheckBoxes, CheckBoxPainting, checkBoxPhotography, checkBoxSculpture,
                checkBoxPrint, checkBoxWorkOnPaper, checkBoxNFT);

// * ------------------------------------- *

        boxOfFilters.getChildren().addAll(text, boxForTextField, boxForLine, boxForSlider, boxForTimePeriodCheckBoxes, boxForMediumCheckBoxes);
        boxOfFilters.setAlignment(Pos.CENTER_LEFT);

        leftSideOfTheBorder.getChildren().add(boxOfFilters);
        leftSideOfTheBorder.setAlignment(Pos.TOP_CENTER);

// * ----------------------------------- * RIGHT SIDE OF CENTER PART * ----- *

// * ------------------------------------- * THUMBNAILS * ----- *

        VBox boxOfThumbnails = new VBox(30);
        HBox rowOfThumbnails1 = new HBox(30);

// * ----------------- * COLUMNS OF THUMBNAILS * ----- *

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

// * -------------------------------------------------- *

        rightSideOfTheBorder.getChildren().add(boxOfThumbnails);
        rightSideOfTheBorder.setAlignment(Pos.TOP_RIGHT);

        boxOfSides.getChildren().addAll(leftSideOfTheBorder, rightSideOfTheBorder);

// * ------------------------------------------------------------------------------------- * BOTTOM PART * ----- *

        VBox emptyspace1 = new VBox(100);

        VBox boxForShowMoreText = new VBox(10);
        Text showMoreTextArea = new Text("Show more Artworks");
        boxForShowMoreText.getChildren().add(showMoreTextArea);
        boxForShowMoreText.setAlignment(Pos.CENTER);

        VBox bottline = new VBox(10);
        Line line3 = new Line(0, 0, 1000, 0);
        bottline.getChildren().add(line3);
        bottline.setAlignment(Pos.CENTER);

        VBox emptyspace2 = new VBox(100);

        VBox boxForShowMoreButton = new VBox(100);
        Button showMore = new Button("V");
        boxForShowMoreButton.getChildren().add(showMore);
        boxForShowMoreButton.setAlignment(Pos.CENTER);

// * ------------------------------------------------------------------------------------- * ALIGNMENT * ----- *

        centerBorderPane.getChildren().addAll(emptyspace, boxOfSides, emptyspace1, boxForShowMoreText, bottline, boxForShowMoreButton, emptyspace2);
        centerBorderPane.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth()-55);
        centerBorderPane.setPrefHeight(2600);
        centerBorderPane.setAlignment(Pos.CENTER);
        centerBorderPane.setStyle("-fx-background-color: lightgray;");

        ScrollPane scrollPane = new ScrollPane(centerBorderPane);
        scrollPane.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());

        setCenter(scrollPane);
    }
}
