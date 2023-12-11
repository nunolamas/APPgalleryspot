package app.view;

import app.view.dashboards.*;
import app.view.objectpage.ArtistPage;
import app.view.objectpage.ArtworkPage;
import app.view.objectpage.GalleryPage;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Screen;

import static app.view.managers.ArtworksManager.showArtworkManager;


public class AppView extends BorderPane {

    private final LandingPage landingPage = new LandingPage();
    private final ExploreArtworks exploreArtworks = new ExploreArtworks();
    private final ExploreGalleries exploreGalleries = new ExploreGalleries();
    private final ExploreShows exploreShows = new ExploreShows();
    private final ArtistPage artistPage = new ArtistPage();
    private final ArtworkPage artworkPage = new ArtworkPage();
    private final GalleryPage galleryPage = new GalleryPage();
    private final SlideShowPage slideShowPage = new SlideShowPage();



    public AppView() {

        doMenuBarLayout();
        showLandingPage();

    }

    public void doMenuBarLayout() {

        setPadding(new javafx.geometry.Insets(10, 20, 10, 20));

// * ------------- * LAYOUT TOP * ----- *

        VBox emptyspace1 = new VBox(100);

        VBox topBorderPane = new VBox(10);

            HBox topBar = new HBox(50);

                HBox topLine = new HBox(10);
                    Line line = new Line(0, 0, 1100, 0);

                HBox placeLogo = new HBox(10);
                    Button buttonHome = new Button("GALLERY SPOT");
                        buttonHome.setMinSize(250, 40);
                        buttonHome.setFont(new Font("Impact", 40));
                        buttonHome.setStyle("-fx-padding: 5 10 5 10;");
                        buttonHome.setOnAction(event -> showLandingPage());


        HBox searchBar = new HBox(10);
                    TextField searchField = new TextField("Search by...");
                        searchField.setFont(new Font("Trebuchet MS", 12));
                        searchField.setPrefWidth((Screen.getPrimary().getVisualBounds().getWidth())-755);

                HBox tabs = new HBox(10);
                    Button buttonArtworksTab = new Button("Artworks");
                        buttonArtworksTab.setFont(new Font("Trebuchet MS", 15));
                        buttonArtworksTab.setMinSize(80,15);
                        buttonArtworksTab.setOnAction(event -> showExploreArtworks());


                    Button buttonShowsTab = new Button("Shows");
                        buttonShowsTab.setFont(new Font("Trebuchet MS", 15));
                        buttonShowsTab.setMinSize(65,15);
                        buttonShowsTab.setOnAction(event -> showExploreShows());

                    Button buttonGalleriesTab = new Button("Galleries");
                        buttonGalleriesTab.setFont(new Font("Trebuchet MS", 15));
                        buttonGalleriesTab.setOnAction(event -> showExploreGalleries());
                        buttonGalleriesTab.setMinSize(80,15);

                    Button buttonSlideshowTab = new Button("Slideshow");
                        buttonSlideshowTab.setFont(new Font("Trebuchet MS", 15));
                        buttonSlideshowTab.setMinSize(90,15);
                        buttonSlideshowTab.setOnAction(event -> showSlideshowPage());

                    javafx.scene.control.MenuBar menuForButtonOptions = new javafx.scene.control.MenuBar();
                        menuForButtonOptions.setStyle("-fx-font-family: 'Trebuchet MS'; -fx-font-size: 15;");
                            Menu buttonOptions = new Menu("Options");
                            MenuItem itemLogin = new MenuItem("Log in");
                            MenuItem itemManageArtworks = new MenuItem("Manage Artworks");
                            MenuItem itemManageArtists = new MenuItem("Manage Artists");
                            MenuItem itemManageGalleries = new MenuItem("Manage Galleries");
                            MenuItem itemManageUsers = new MenuItem("Manage Users");
                            MenuItem itemManageSales = new MenuItem("Manage Sales");
                            menuForButtonOptions.setMinSize(50,15);

                    // * ----------------- * SETONACTION MENU * ----------------- *
                            itemManageArtworks.setOnAction(event -> {
                                showArtworkManager();
                            });

                tabs.getChildren().addAll(buttonArtworksTab, buttonShowsTab, buttonGalleriesTab, buttonSlideshowTab, menuForButtonOptions);
                tabs.setAlignment(Pos.TOP_RIGHT);

                        menuForButtonOptions.getMenus().add(buttonOptions);
                            buttonOptions.getItems().addAll(itemLogin, itemManageArtworks, itemManageArtists, itemManageGalleries, itemManageUsers, itemManageSales);

                searchBar.getChildren().add(searchField);

                placeLogo.getChildren().add(buttonHome);
                placeLogo.setAlignment(Pos.TOP_LEFT);

            topBar.getChildren().addAll(placeLogo, searchBar, tabs);
            topBar.setAlignment(Pos.TOP_CENTER);

            topLine.getChildren().add(line);
            topLine.setAlignment(Pos.TOP_RIGHT);

        topBorderPane.getChildren().addAll(topBar, topLine, emptyspace1);

      //  topBorderPane.
        this.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        this.setPrefHeight(Screen.getPrimary().getVisualBounds().getHeight());
        setTop(topBorderPane);

// * ------------- * LAYOUT LEFT * ----- *
// * ------------- * LAYOUT CENTER * ----- *
// * ------------- * LAYOUT RIGHT * ----- *
// * ------------- * LAYOUT BOTTOM * ----- *
    }

    public void changeToExploreArtworks() {

        new ExploreArtworks().doExploreArtworksLayout();
    }

    public void showLandingPage() {
        this.setCenter(landingPage);
    }

    public void showExploreArtworks() {
        this.setCenter(exploreArtworks);
    }

    public void showExploreGalleries() {
        this.setCenter(exploreGalleries);
    }

    public void showExploreShows() {
        this.setCenter(exploreShows);
    }

    public void showSlideshowPage() {
        this.setCenter(slideShowPage);
    }

    public void showArtistPage() {
        this.setCenter(artistPage);
    }

    public void showArtworkPage() {
        this.setCenter(artworkPage);
    }

    public void showGalleryPage() {
        this.setCenter(galleryPage);
    }
}