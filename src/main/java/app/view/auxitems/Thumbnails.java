package app.view.auxitems;

import app.view.objectpage.ArtistPage;
import app.view.objectpage.ArtworkPage;
import app.view.objectpage.GalleryPage;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Thumbnails extends BorderPane{

        //private final ArtistPage artistPage = new ArtistPage();
        //private final ArtworkPage artworkPage = new ArtworkPage();
        //private final GalleryPage galleryPage = new GalleryPage();
        //rivate final ExploreArtworks exploreArtworks = new ExploreArtworks();



    public Thumbnails() {

            doThumbnails();
    }

    public VBox doThumbnails() {

            VBox thumbnail = new VBox(1);

            DropShadow dropShadow = new DropShadow();
            dropShadow.setOffsetY(3.0);
            dropShadow.setColor(Color.color(0, 0, 0, 0.3));

            thumbnail.setEffect(dropShadow);

            CornerRadii roundedCorners = new CornerRadii(0,0,10,10, false);
            BackgroundFill backgroundFill = new BackgroundFill(Color.WHITE, roundedCorners, javafx.geometry.Insets.EMPTY);
            Background background = new Background(backgroundFill);

            Button clickableThumbnail = new Button();
            clickableThumbnail.setGraphic(ImagesArray.getRandomImageView());

            ImageView randomImageView = (ImageView) clickableThumbnail.getGraphic();

            BackgroundImage backgroundImage = new BackgroundImage(randomImageView.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
            Background buttonBackground = new Background(backgroundImage);

            clickableThumbnail.setBackground(buttonBackground);

            //clickableThumbnail.setOnAction(e -> showExploreArtworks());

            Hyperlink artworkTitle = new Hyperlink(" ARTWORK HEX");
            artworkTitle.setFont(new Font(" Trebuchet MS", 20));
            //get for the artwork's title

            Hyperlink artistName = new Hyperlink(" Artist Ipslon");
            artistName.setFont(new Font("Trebuchet MS", 14));
            //get for the artwork's artist name

            Hyperlink galleryName = new Hyperlink(" Gallery Zi");
            galleryName.setFont(new Font("Trebuchet MS", 16));
            //get for the artwork's gallery name

            thumbnail.setBackground(background);

            HBox priceBox = new HBox(10);
            Text price = new Text("$500.00 ");
            price.setFont(new Font("Trebuchet MS", 30));
            //get for the artowrk's price
            price.setTextAlignment(TextAlignment.RIGHT);

            priceBox.getChildren().add(price);
            priceBox.setAlignment(Pos.BOTTOM_RIGHT);
            priceBox.setBackground(background);


            thumbnail.getChildren().addAll(clickableThumbnail, artworkTitle, artistName, galleryName, priceBox);

            return thumbnail;
    }

        /*public void showArtistPage() {
                this.setCenter(artistPage);
        }*/

       /* public void showArtworkPage() {
                this.setCenter(artworkPage);
        }*/

        //public void showGalleryPage() {
               // this.setCenter(galleryPage);
        //}

       /* public void showExploreArtworks() {

        this.setCenter(exploreArtworks);
        }*/


}
