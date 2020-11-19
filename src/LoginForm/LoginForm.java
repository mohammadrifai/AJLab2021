/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author moham
 */
public class LoginForm extends Application {
     Stage window;
      public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
      window=primaryStage;
      window.setTitle("Login Form window");
      GridPane grid= new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setVgap(10);
      grid.setHgap(10);
      grid.setPadding(new Insets(10));
      
      Image image=new Image("964-200x200.jpg");
      ImageView iv=new ImageView();
      iv.setImage(image);
      
         
      
      
      
      Text welcomeTxt=new Text("welcome");
      welcomeTxt.setFont(Font.font("Tahoma",FontWeight.LIGHT,25));
      grid.add(welcomeTxt,0,0);
      Label lblUser=new Label("username");
      grid.add(lblUser,0,1);
      TextField txtUser =new TextField();
      txtUser.setPromptText("username");
      grid.add(txtUser,1,1);
     
       Label lblPassword=new Label("Password");
      grid.add(lblPassword,0,2);
      PasswordField PwBox =new PasswordField();
      PwBox.setPromptText("password");
      grid.add(PwBox,1,2);
      
      Button loginBtn=new Button("Sign in");
      grid.add(loginBtn,1,3);
      
      Scene scene= new Scene(grid,500,500);
      window.setScene(scene);
      window.show();
      
      
      
      
      
       
    }

   
}
