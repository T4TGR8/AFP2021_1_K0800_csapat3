package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    @FXML private Label result;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }

    @FXML
    void onNumberClicked(MouseEvent event) {
        int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
        result.setText(Double.parseDouble(result.getText())==0?String.valueOf((double)value):String.valueOf(Double.parseDouble(result.getText())*10+value));
    }

    private double num1 = 0;
    private String operator = "+";

    @FXML
    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");
        if(symbol.equals("Equals")) {
            double num2 = Double.parseDouble(result.getText());
            switch (operator) {
                case "+" -> result.setText((num1+num2) + "");
                case "-" -> result.setText((num1-num2) + "");
                case "*" -> result.setText((num1*num2) + "");
                case "/" -> result.setText((num1/num2) + "");
                case "√" -> result.setText((Math.sqrt(num1)) + "");
                case "x^y" -> result.setText((Math.sqrt(num1)) + "");
            }
            operator = ".";
        }
        else if(symbol.equals("Clear")) {
            result.setText(String.valueOf(0.0));
            operator = ".";
        }
        else {
            switch (symbol) {
                case "Plus" -> operator = "+";
                case "Minus" -> operator = "-";
                case "Multiply" -> operator = "*";
                case "Divide" -> operator = "/";
                case "Root" -> operator = "√";
                case "Pow" -> operator = "x^y";
            }
            num1 = Double.parseDouble(result.getText());
            result.setText(String.valueOf(0.0));
        }
    }
}
