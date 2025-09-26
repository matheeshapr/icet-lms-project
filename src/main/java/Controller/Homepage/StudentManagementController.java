package Controller.Homepage;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentManagementController {
    Stage stage = new Stage();
    public void btnaddstu(ActionEvent actionEvent) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentpage/add_student.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnupstu(ActionEvent actionEvent) {
    }

    public void btnviwstu(ActionEvent actionEvent) {
    }

    public void btndltstu(ActionEvent actionEvent) {

    }
}
