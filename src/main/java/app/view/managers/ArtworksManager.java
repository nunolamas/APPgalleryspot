package app.view.managers;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ArtworksManager {

    private Stage parent;

    public ArtworksManager(Stage parent) {
        this.parent = parent;
    }

    public static void showArtworkManager(){
        Stage newStage = new Stage();
        newStage.setTitle("Artwork Manager");
        newStage.setResizable(false);
        newStage.initModality(Modality.APPLICATION_MODAL);


        newStage.setScene(doArtWorkManagerLayout());

        newStage.centerOnScreen();

      /* newStage.setX((Screen.getPrimary().getVisualBounds().getWidth() - newStage.getWidth()) / 2);
        newStage.setY((Screen.getPrimary().getVisualBounds().getHeight() - newStage.getHeight()) / 2);


       */
        newStage.show();
    }
    public static Scene doArtWorkManagerLayout(){


        Scene scene = new Scene(doArtWorkCreateUpdateLayout(), 450, 550);

        return scene;
    }
    public static VBox doArtWorkCreateUpdateLayout(){

        VBox primaryVBox = new VBox(10);
        primaryVBox.setPadding(new Insets(20,20,20,20));


            Label header = new Label("Artwork Manager");
            VBox headerVBox = new VBox(header);
            headerVBox.setAlignment(Pos.CENTER);
            header.setFont(new Font("Trebuchet MS", 15));

            VBox secondaryBox1 = new VBox(10);
            secondaryBox1.setPadding(new Insets(0,0,10,0));
                TextField artworkName = new TextField();
                artworkName.setMaxWidth(150);
                artworkName.setPromptText("Artwork's Title");
                artworkName.setMaxWidth(Double.MAX_VALUE);

                HBox terciaryBox1 = new HBox(10);
                terciaryBox1.setAlignment(Pos.CENTER);
                    TextField authorName = new TextField();
                    authorName.setPrefWidth(350);
                    authorName.setPromptText("Author's Name");
                    Button addAuthor = new Button();
                    addAuthor.setMinSize(20,20);
                    Button removeAuthor = new Button();
                    removeAuthor.setMinSize(20,20);
                    terciaryBox1.getChildren().addAll(authorName,addAuthor,removeAuthor);
                secondaryBox1.getChildren().addAll(artworkName,terciaryBox1);

            HBox secondaryBox2 = new HBox(10);
                VBox terciaryBox2 = new VBox(10);
                    TextField artworkId = new TextField();
                    artworkId.setPrefWidth(275);
                    artworkId.setPromptText("Artwork's Identification Code");
                    TextField creationPeriod = new TextField();
                    creationPeriod.setPrefWidth(275);
                    creationPeriod.setPromptText("Creation Period");
                    TextField medium = new TextField();
                    medium.setPrefWidth(275);
                    medium.setPromptText("Medium");
                    terciaryBox2.getChildren().addAll(artworkId,creationPeriod,medium);

                Button addImage = new Button();
                addImage.setPrefSize(125,125);
                secondaryBox2.getChildren().addAll(terciaryBox2,addImage);

            VBox secondaryBox3 = new VBox(10);
                HBox terciaryBox3 = new HBox(10);
                terciaryBox3.setPadding(new Insets(0,0,10,0));
                    TextField height = new TextField();
                    height.setPromptText("Height");
                    TextField width = new TextField();
                    width.setPromptText("Width");
                    TextField depth = new TextField();
                    depth.setPromptText("Depth");
                    TextField diameter = new TextField();
                    diameter.setPromptText("Diameter");
                    terciaryBox3.getChildren().addAll(height,width,depth,diameter);

                HBox terciaryBox4 = new HBox(10);

                    TextField value = new TextField();
                    value.setPromptText("Value");
                    Button category = new Button("Category");
                    TextField unavailable = new TextField("Unavailable");
                    unavailable.setEditable(false);
                    RadioButton checkAvailability = new RadioButton();
                    terciaryBox4.getChildren().addAll(value,category,unavailable,checkAvailability);
                secondaryBox3.getChildren().addAll(terciaryBox3,terciaryBox4);

            HBox secondaryBox4 = new HBox(10);
                TableView genesList = new TableView<>();
                genesList.setPrefWidth(380);

                VBox terciaryBox5 = new VBox(10);
                    Button addGene = new Button();
                    addGene.setPrefSize(20,20);
                    Button removeGene = new Button();
                    removeGene.setPrefSize(20,20);
                    terciaryBox5.getChildren().addAll(addGene,removeGene);
                secondaryBox4.getChildren().addAll(genesList,terciaryBox5);

            HBox secondaryBox5 = new HBox(50); //Caixa Extra para Confirmar e Cancelar
                Button confirmButton = new Button("Confirm");
                Button cancelButton = new Button("Cancel");
                secondaryBox5.getChildren().addAll(confirmButton,cancelButton);

            primaryVBox.getChildren().addAll(headerVBox,secondaryBox1,secondaryBox2, secondaryBox3, secondaryBox4,secondaryBox5);

        Platform.runLater( () -> primaryVBox.requestFocus());

        return primaryVBox;
    }
}
