module com.ddailycodebuffer.springframeworkdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ddailycodebuffer.springframeworkdemo to javafx.fxml;
    exports com.ddailycodebuffer.springframeworkdemo;
}