module org.example.onlinepaymenapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.onlinepaymenapp to javafx.fxml;
    exports org.example.onlinepaymenapp;
}