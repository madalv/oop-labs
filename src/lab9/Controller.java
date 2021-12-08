package lab9;

import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.text.Text;

import javafx.event.ActionEvent;

public class Controller {
    @FXML

    public Button button;
    public TextField dividend;
    public TextField divider;
    public DialogPane errorBox;
    public Text result;

    public void divide(ActionEvent e) {
        try {
            result.setText("");
            errorBox.setContentText("");
            double nr1 = Double.parseDouble(dividend.getText());
            double nr2 = Double.parseDouble(divider.getText());

            checkDivider(nr2); // check divider for dividing by 0 or 13

            result.setText(String.valueOf(nr1 / nr2));
        }
        catch (DivideByZeroException divideByZeroException) // catches exception if divider is 0
        {
            errorBox.setContentText("Exception occurred: "+ divideByZeroException.message);
        }
        catch (UnluckyException unluckyException) // catches if divider is 13
        {
            errorBox.setContentText("Exception occurred: "+ unluckyException.message);
        }
        catch (Throwable er) // catches errors if inputs are empty or non-numerical
        {
            errorBox.setContentText("Exception occurred: "+ er.getMessage());
        }
    }

    public void checkDivider(double divider) throws DivideByZeroException, UnluckyException {
        if (divider == 0) throw new DivideByZeroException();
        if (divider == 13) throw new UnluckyException();
    }

}
