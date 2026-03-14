// Max Jankowski
// Bellevue University
// CSD402 Module 11.2 assignment


import javafx.application.Application; // Makes this class code a JavaFX application
import javafx.geometry.Insets; // allows for setting up padding elements
import javafx.scene.Scene; // used for content attachments to windows
import javafx.scene.control.Button; //UI controls used in the program
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox; //Importing the starts of the show here
import javafx.scene.layout.VBox;
import javafx.stage.Stage; // used to stage the application window

public class JankowskiJavaFXLayout extends Application {

    //The start method is a JavaFX entry point called after application is initailized and stage is ready
    @Override
    public void start(Stage stage) {

        // Creating three buttons to serve as a toolbar. HBox is used for this reason as it arranging left to right
        Button newBtn   = new Button("New");
        Button saveBtn  = new Button("Save");
        Button clearBtn = new Button("Clear");

        // Starting a HBox layout with the spacing of 10 pixels, as per documentation space values is passes as the constructor
        HBox toolbar = new HBox(10, newBtn, saveBtn, clearBtn);
        toolbar.setPadding(new Insets(10));

        // Vbox used to make form fields that are stacked top to bottom
        Label firstNameLabel = new Label("First Name:"); // first name label
        TextField firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name:"); // last name label
        TextField lastNameField = new TextField(); //field for user input

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit"); // button element to mimic a submission

        // VBox spacing as default is 0 pixels. setting to 8 to give them some breathing room for each element
        VBox form = new VBox(8,
                firstNameLabel, firstNameField,
                lastNameLabel,  lastNameField,
                emailLabel,     emailField,
                submitBtn
        );
        form.setPadding(new Insets(10));

        // the outer vbox that ties the window together, i only has 2 children toolbar and forms
        VBox root = new VBox(toolbar, form);

        // setting up and showing the container window, sets the spacing and loads all the children in one line
        stage.setTitle("JankowskiJavaFX Layout");
        stage.setScene(new Scene(root, 300, 280));
        stage.show();
    }
// Java entry point
    public static void main(String[] args) {
        launch(args); // required to open the FX window
    }
}

/**
 * References:
 *   Jenkov, J. JavaFX HBox. jenkov.com/tutorials/javafx/hbox.html
 *   Jenkov, J. JavaFX VBox. jenkov.com/tutorials/javafx/vbox.html
 *   Martens, J. YouTube. https://www.youtube.com/watch?v=hGWxA2gTWIQ&t=4s
 */