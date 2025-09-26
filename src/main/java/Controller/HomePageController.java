package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    Stage stage = new Stage();
    public void btnstudent(ActionEvent actionEvent) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homepage/student_management_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    Stage stage1 = new Stage();
    public void btnbatch(ActionEvent actionEvent) {

        try {
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homepage/batch_management_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage1.show();
    }

    Stage stage2 = new Stage();
    public void btngrade(ActionEvent actionEvent) {

        try {
            stage2.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homepage/grade_management_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage2.show();
    }

    Stage stage3 = new Stage();
    public void btnreport(ActionEvent actionEvent) {

        try {
            stage3.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/homepage/report_management_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage3.show();

    }
}
