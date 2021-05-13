package sample;




import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.Spinner;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button btnMain;

    public TextField txtKoszt;

    public TextField txtObjetosc;

    public Spinner<Double> spinnerWysokosc;
    public SpinnerValueFactory<Double> svfWysokosc = new SpinnerValueFactory.DoubleSpinnerValueFactory(1.0, 250.0, 1.0);

    public Spinner<Double> spinnerPromien;
    public SpinnerValueFactory<Double> svfPromien = new SpinnerValueFactory.DoubleSpinnerValueFactory(1.0, 50.0, 1.0, 0.5);

    public Spinner<Double> spinnerGrubosc;
    public SpinnerValueFactory<Double> svfGrubosc = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 50.0, 0.5, 0.1);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        spinnerWysokosc.setValueFactory(svfWysokosc);
        spinnerGrubosc.setValueFactory(svfGrubosc);
        spinnerPromien.setValueFactory(svfPromien);
    }

    public void onBtnAction(ActionEvent actionEvent) {
        double promien = spinnerWysokosc.getValue() * Math.PI * (Math.pow(spinnerPromien.getValue(), 2) - Math.pow(spinnerGrubosc.getValue(), 2));
        txtObjetosc.setText(Double.toString(Math.round(promien * 100.0) / 100.0));

        double waga = promien * 0.001;
        txtKoszt.setText((Double.toString(Math.round(waga * 2.70 * 100.0) / 100.0) + "/" + Double.toString(Math.round(waga * 14.0 * 100.0) / 100.0)));
    }

}