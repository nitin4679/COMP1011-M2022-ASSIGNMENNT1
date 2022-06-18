module ca.georgiancollege.comp1011m2022assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1011m2022assignment1 to javafx.fxml;
    exports ca.georgiancollege.comp1011m2022assignment1;
}