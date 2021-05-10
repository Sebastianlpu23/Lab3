package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button btnMain;
    public TextField txtLicznik;
    int clickCounter;

    public void onBtnAction(ActionEvent actionEvent) {
        txtLicznik.setText("licznik: "+ ++clickCounter);
    }
}






