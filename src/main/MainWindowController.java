package main;

import backend.muveletek;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController {
    @FXML private Label result;
    @FXML private Pane titlePane;
    @FXML private ImageView btnMinimize, btnClose;

    private double x, y;

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnMinimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
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
        muveletek n = new muveletek();
        if(symbol.equals("Equals")) {
            double num2 = Double.parseDouble(result.getText());
            switch (operator) {
                case "+" -> result.setText(n.Osszeadas(num1,num2) + "");
                case "-" -> result.setText(n.Kivonas(num1,num2) + "");
                case "*" -> result.setText(n.Szorzas(num1,num2) + "");
                case "/" -> result.setText(n.Osztas(num1,num2) + "");
                case "√" -> result.setText(n.NegyzetGyökvonas(num1) + "");
                case "x^y" -> result.setText(n.Hatvanyozas(num1,num2) + "");
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
