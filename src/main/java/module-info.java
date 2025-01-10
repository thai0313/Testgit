module aptech.proj_fx10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens aptech.proj_fx10 to javafx.fxml;
    exports aptech.proj_fx10;
}
