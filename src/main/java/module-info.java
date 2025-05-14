module javafxexample {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxexample to javafx.fxml;
    exports javafxexample;
}
