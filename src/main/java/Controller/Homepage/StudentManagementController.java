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
    Stage stage1 = new Stage();
   public void btnupstu(ActionEvent actionEvent) {

        try {
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentpage/update_student.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage1.show();
    }
    Stage stage2 = new Stage();
    public void btnviwstu(ActionEvent actionEvent) {

        try {
            stage2.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentpage/view_student.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage2.show();

    }
    Stage stage3 = new Stage();
    public void btndltstu(ActionEvent actionEvent) {

        try {
            stage3.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/studentpage/delete_student.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage3.show();

    }


}
