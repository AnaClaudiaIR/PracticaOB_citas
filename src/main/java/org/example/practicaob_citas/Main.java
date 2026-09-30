package org.example.practicaob_citas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;


import org.example.practicaob_citas.Util.R;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(R.getUI("FormularioCitas.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ui/FormularioCitas.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        stage.setTitle("Gestion de Citas \"Clinica San Mateo\"");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
