package Controller.Homepage;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BtachManagementController {
    Stage stage = new Stage();
    public void btnaddbtch(ActionEvent actionEvent) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/batchpage/add_batch.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    Stage stage1 = new Stage();
    public void btnupbtch(ActionEvent actionEvent) {

        try {
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/batchpage/update_batch.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage1.show();;
    }

    Stage stage2 = new Stage();
    public void btnviwbtch(ActionEvent actionEvent) {

        try {
            stage2.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/batchpage/view_batch.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage2.show();

    }
}
