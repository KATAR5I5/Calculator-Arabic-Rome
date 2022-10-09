import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainCalcularot extends Application {
    public static void main(String[] arg) {
        Application.launch();
////        объект ввода с клавиатуры
//        InputKeyboard inputKeyboard = new InputKeyboard();
////        Массив операндов из Веденной с клавиатуры строки
//        Date start = new Date();
//        String[] inputArrayOperands = inputKeyboard.getArrayOperands();
//
//        MathClass math = new MathClass();
//        System.out.println(math.calc(inputArrayOperands));
//        Date stop = new Date();
//        System.out.println((stop.getTime() - start.getTime()) + " ms");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator");
        primaryStage.setWidth(700);
        primaryStage.setHeight(400);
        Button button = new Button("Calculate!");
        button.setOnAction(e -> {

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Результат выражения: " + MainCalcularot.m());

            alert.showAndWait();
        });
        Scene primaryScene = new Scene(button);
        primaryStage.setScene(primaryScene);


        primaryStage.show();


    }

    public static String m() {
        InputKeyboard inputKeyboard = new InputKeyboard();
        String[] inputArrayOperands = inputKeyboard.getArrayOperands();
        MathClass math = new MathClass();
        return math.calc(inputArrayOperands);
    }
}