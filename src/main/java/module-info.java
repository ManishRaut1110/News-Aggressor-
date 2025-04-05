module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires stanford.corenlp;

    opens com.example.hellofx to javafx.fxml;
    exports com.example.hellofx;
}

