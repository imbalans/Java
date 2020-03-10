package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    public void btnOnClickSend() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
    }
}
