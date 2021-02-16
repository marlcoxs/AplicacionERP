/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        AccesoBD.conectarBD();
      File f=new File("recursos/pantalla.fxml");
        System.out.println("existe: "+f.exists());
        URL url=f.toURI().toURL();
        Parent root=FXMLLoader.load(url);
        
        TextField texto_nombre=(TextField)root.lookup("#txt_nombre");
        
        TextField texto_password=(TextField)root.lookup("#txt_password");
        Button btn_validar=(Button)root.lookup("#id_boton");
       
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
