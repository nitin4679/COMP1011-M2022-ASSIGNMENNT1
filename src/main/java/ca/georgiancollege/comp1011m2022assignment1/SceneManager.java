package ca.georgiancollege.comp1011m2022assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {

    /********************** SINGLETON SECTION **************************/
    //step 1- private static instance member variable
    private static SceneManager m_instance = null;
    //step2 - make the default constructor private
    private SceneManager(){}
    //step3 - create a public static entry point / instance method
    public static SceneManager Instance()
    {
        //step4 - check if the private instance member variable is null
        if(m_instance == null)
        {
            //step5 - Instantiate a new DBManager instance
            m_instance = new SceneManager();
        }
        return m_instance;
    }
    /********************************************************************* */

    // This method will change new scene passes into it as an argument

    public static void changeScenes(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        //Derive the stage object from the action event
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

