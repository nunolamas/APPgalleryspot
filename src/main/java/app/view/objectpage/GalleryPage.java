package app.view.objectpage;

import javafx.scene.layout.BorderPane;
import app.view.auxitems.Thumbnails;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import java.text.DecimalFormat;

public class GalleryPage extends BorderPane {

    public GalleryPage(){

        doGalleryPage();
    }

    public void doGalleryPage() {
// * ------------------------------------------------------------------------------------- * CENTER PART * ----- *
        CornerRadii roundedCorners = new CornerRadii(10);
        BackgroundFill backgroundFill = new BackgroundFill(Color.WHITE, roundedCorners, javafx.geometry.Insets.EMPTY);
        Background background = new Background(backgroundFill);
// * ----------------------------------- * TOP PART OF CENTER PART * ----- *

        VBox emptyspace3 = new VBox(100);

        VBox centerPaneForTopPart = new VBox(20);

        VBox centerBorderPane = new VBox(10);

// * -------------------- * BIG THUMBNAIL * ----- *

        VBox boxForImageAndInfo = new VBox();
        ImageView imageViewForBigImage = new ImageView();

        Image bigImage = new Image("images/4eaeecc3d2a5820001006e93.jpg");
        imageViewForBigImage.setImage(bigImage);
        imageViewForBigImage.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        imageViewForBigImage.setFitHeight(350);

        VBox boxForDescription = new VBox(10);
        HBox boxToPlaceDescription = new HBox(10);

        Text galleryName = new Text("NAME OF THE GALLERY");
        galleryName.setFont(new Font("Trebuchet MS", 18));
        Text separator = new Text("|");
        separator.setFont(new Font("Trebuchet MS", 20));
        Text galleryRegion = new Text("REGION");
        Text separator1 = new Text("|");
        separator1.setFont(new Font("Trebuchet MS", 20));

        galleryRegion.setFont(new Font("Trebuchet MS", 18));
        Text gallerySite = new Text("WEBSITE");
        gallerySite.setFont(new Font("Trebuchet MS", 18));

        boxToPlaceDescription.getChildren().addAll(galleryName, separator, galleryRegion, separator1, gallerySite);
        boxToPlaceDescription.setAlignment(Pos.CENTER);
        boxToPlaceDescription.setPadding(new Insets(15, 10, 15, 10));

        CornerRadii roundedCorners3 = new CornerRadii(0, 0, 10, 10, false);
        BackgroundFill backgroundFill3 = new BackgroundFill(Color.WHITE, roundedCorners3, javafx.geometry.Insets.EMPTY);
        Background backgroundWhite = new Background(backgroundFill3);
        boxForDescription.getChildren().add(boxToPlaceDescription);
        boxForDescription.setBackground(backgroundWhite);
        boxForDescription.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        boxForDescription.setAlignment(Pos.CENTER);
        boxForDescription.setPadding(new Insets(0, 10, 1, 10));


        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0, 0, 0, 0.3));

        boxForImageAndInfo.getChildren().addAll(imageViewForBigImage, boxForDescription);
        boxForImageAndInfo.setAlignment(Pos.CENTER);
        boxForImageAndInfo.setEffect(dropShadow);

// * -------------------- * BIG THUMBNAIL * ----- *

        HBox boxForGalleryShows = new HBox(30);

        HBox boxForShowThumbnail = new HBox(10);
        ImageView imageViewShowThumbnail = new ImageView();
        Image imageShowThumbnail = new Image("images/4eaeecc3d2a5820001006e93.jpg");
        imageViewShowThumbnail.setImage(imageShowThumbnail);
        imageViewShowThumbnail.setFitWidth(200);
        imageViewShowThumbnail.setFitHeight(200);

        VBox boxForText = new VBox(5);
        Text showName = new Text("NAME OF THE SHOW");
        showName.setFont(new Font("Trebuchet MS", 16));
        Text showDate = new Text("date-date-date");
        showDate.setFont(new Font("Trebuchet MS", 13));
        Text showDescription = new Text("Description, it should be very descriptive. I love descriptions! ");
        showDescription.setFont(new Font("Trebuchet MS", 13));

        boxForText.getChildren().addAll(showName, showDate, showDescription);

        boxForShowThumbnail.getChildren().addAll(imageViewShowThumbnail, boxForText);
        boxForGalleryShows.getChildren().add(boxForShowThumbnail);
        boxForGalleryShows.setPadding(new Insets(15, 15, 15, 15));
        boxForGalleryShows.setBackground(background);
        boxForGalleryShows.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth() - 120);
        boxForGalleryShows.setEffect(dropShadow);
// * -------------------------------------------- *

        HBox boxForLine3 = new HBox(15);
        boxForLine3.setPadding(new Insets(5, 0, 5, 0));
        Line line3 = new Line(0, 0, 1200, 0);
        Text exploreArtworks = new Text("explore more artworks from this gallery V");
        exploreArtworks.setFont(new Font("Trebuchet MS", 12));

        boxForLine3.getChildren().addAll(line3, exploreArtworks);
        boxForLine3.setAlignment(Pos.CENTER_LEFT);

        centerPaneForTopPart.getChildren().addAll(boxForImageAndInfo, boxForGalleryShows, boxForLine3);
        centerPaneForTopPart.setAlignment(Pos.CENTER);

// * ----------------------------------- * CENTER OF CENTER PART * ----- *

        VBox emptyspace = new VBox(100);

        //VBox centerBorderPane = new VBox(10);

        HBox boxOfSides = new HBox(50);
        boxOfSides.setAlignment(Pos.CENTER);
        VBox leftSideOfTheBorder = new VBox(10);
        VBox rightSideOfTheBorder = new VBox(50);

// * ----------------------------------- * LEFT SIDE OF CENTER PART * ----- *

        VBox boxOfFilters = new VBox(2);

        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0, 0, 0, 0.3));
        boxOfFilters.setBackground(background);
        boxOfFilters.setEffect(dropShadow);

        VBox boxForTextField = new VBox(10);
        boxForTextField.setPadding(new Insets(0, 10, 1, 10));
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
        boxForLine.setPadding(new Insets(5, 10, 5, 10));
        Line line = new Line(0, 0, 250, 0);
        boxForLine.getChildren().add(line);

// * --------------------- * SLIDER * ----- *

        Text priceText = new Text(" Price");
        priceText.setFont(new Font("Trebuchet MS", 15));

        VBox boxForSlider = new VBox();
        boxForSlider.setPadding(new Insets(5, 0, 10, 10));

        DecimalFormat df = new DecimalFormat("0.0");
        Slider minPriceSlider = new Slider(0, 5000, 0);
        minPriceSlider.setMaxWidth(220);
        Label minPriceLabel = new Label(" Minimum value: 0.00€");
        minPriceLabel.setFont(new Font("Trebuchet MS", 12));
        minPriceSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                minPriceLabel.setText(" Minimum value: " + df.format(newValue) + "€"));
        Slider maxPriceSlider = new Slider(0, 5000, 0);
        maxPriceSlider.setMaxWidth(220);
        Label maxPriceLabel = new Label(" Maximum value: 0.00€");
        maxPriceLabel.setFont(new Font("Trebuchet MS", 12));
        maxPriceSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                maxPriceLabel.setText(" Maximum value: " + df.format(newValue) + "€"));
        boxForSlider.getChildren().addAll(priceText, minPriceSlider, minPriceLabel, maxPriceSlider, maxPriceLabel);

// * ------------------------------------- * CHECKBOXES * ----- *

// * ---------------- * CHECKBOX TIME PERIOD * ----- *

        VBox boxForTimePeriodCheckBoxes = new VBox(5);
        Text textForTimePeriodCheckBoxes = new Text("Time Period");
        textForTimePeriodCheckBoxes.setFont(new Font("Trebuchet MS", 15));
        boxForTimePeriodCheckBoxes.setPadding(new Insets(5, 0, 10, 10));
        CheckBox checkBox2020s = new CheckBox("2020s");
        checkBox2020s.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBox2010s = new CheckBox("2010s");
        checkBox2010s.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBox2000s = new CheckBox("2000s");
        checkBox2000s.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxLate20C = new CheckBox("Late 20th Century");
        checkBoxLate20C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxMid20C = new CheckBox("Mid 20th Century");
        checkBoxMid20C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxEarly20C = new CheckBox("Early 20th Century");
        checkBoxEarly20C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxLate19C = new CheckBox("Late 19th Century");
        checkBoxLate19C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxMid19C = new CheckBox("Mid 19th Century");
        checkBoxMid19C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxEarly19C = new CheckBox("Early 19th Century");
        checkBoxEarly19C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxLate18C = new CheckBox("Late 18th Century");
        checkBoxLate18C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxMid18C = new CheckBox("Mid 18th Century");
        checkBoxMid18C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxEarly18C = new CheckBox("Early 18th Century");
        checkBoxEarly18C.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxBefore18C = new CheckBox("Earlier than 18th Century");
        checkBoxBefore18C.setFont(new Font("Trebuchet MS", 12));
        boxForTimePeriodCheckBoxes.getChildren().addAll(textForTimePeriodCheckBoxes, checkBox2020s, checkBox2010s,
                checkBox2000s, checkBoxLate20C, checkBoxMid20C, checkBoxEarly20C, checkBoxLate19C, checkBoxMid19C,
                checkBoxEarly19C, checkBoxLate18C, checkBoxMid18C, checkBoxEarly18C, checkBoxBefore18C);

// * ---------------- * CHECKBOX MEDIUM * ----- *

        VBox boxForMediumCheckBoxes = new VBox(5);
        Text textForMediumCheckBoxes = new Text("Time Period");
        textForMediumCheckBoxes.setFont(new Font("Trebuchet MS", 15));
        boxForMediumCheckBoxes.setPadding(new Insets(5, 0, 10, 10));
        CheckBox CheckBoxPainting = new CheckBox("Painting");
        CheckBoxPainting.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxPhotography = new CheckBox("Photography");
        checkBoxPhotography.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxSculpture = new CheckBox("Sculpture");
        checkBoxSculpture.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxPrint = new CheckBox("Prints");
        checkBoxPrint.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxWorkOnPaper = new CheckBox("Work on Paper");
        checkBoxWorkOnPaper.setFont(new Font("Trebuchet MS", 12));
        CheckBox checkBoxNFT = new CheckBox("NFT");
        checkBoxNFT.setFont(new Font("Trebuchet MS", 12));
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
                countAux++;
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
        Text showMoreTextArea = new Text("refresh artworks");
        showMoreTextArea.setFont(new Font ("Trebuchet MS", 12));
        boxForShowMoreText.getChildren().add(showMoreTextArea);
        boxForShowMoreText.setAlignment(Pos.CENTER);

        VBox bottline = new VBox(10);
        Line line4 = new Line(0, 0, 1000, 0);
        bottline.getChildren().add(line4);
        bottline.setAlignment(Pos.CENTER);

        VBox emptyspace2 = new VBox(100);

        VBox boxForShowMoreButton = new VBox(100);
        Button showMore = new Button("V");
        boxForShowMoreButton.getChildren().add(showMore);
        boxForShowMoreButton.setAlignment(Pos.CENTER);

// * ------------------------------------------------------------------------------------- * ALIGNMENT * ----- *

        centerBorderPane.getChildren().addAll(emptyspace3, centerPaneForTopPart, emptyspace, boxOfSides, emptyspace1, boxForShowMoreText, bottline, boxForShowMoreButton, emptyspace2);
        centerBorderPane.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth() - 55);
        centerBorderPane.setPrefHeight(3000);
        centerBorderPane.setAlignment(Pos.CENTER);
        centerBorderPane.setStyle("-fx-background-color: lightgray;");

        ScrollPane scrollPane = new ScrollPane(centerBorderPane);
        scrollPane.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());

        setCenter(scrollPane);
    }
}
