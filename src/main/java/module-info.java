module org.example.nunezdemo02042025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.nunezdemo02042025 to javafx.fxml;
    exports org.example.nunezdemo02042025;
}