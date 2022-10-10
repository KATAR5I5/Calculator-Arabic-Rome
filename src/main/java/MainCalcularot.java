import java.net.URL;
import java.util.Date;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
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

//        FXMLLoader loader = new FXMLLoader();
//        URL xmlUrl = getClass().getResource("/mainScene.fxml");
//        loader.setLocation(xmlUrl);
//        loader.setController(new MainSceneController());
//        MainSceneController controller = loader.getController();
//        Parent root = loader.load();
        Pane pane = new Pane();
        TextField textField = new TextField();
        textField.setPrefColumnCount(15);
        Text text = new Text();
        text.setLayoutX(20);
        text.setLayoutY(100);
        textField.setLayoutX(20);
        textField.setLayoutY(20);
        Button btn = new Button("РАСЧИТАТЬ");
        btn.setLayoutX(300);
        btn.setLayoutY(20);
        btn.setOnAction(actionEvent ->{

            InputKeyboard inputKeyboard = new InputKeyboard(textField.getText());
//        Массив операндов из Веденной с клавиатуры строки
//            Date start = new Date();
            String[] inputArrayOperands = inputKeyboard.getArrayOperands();

            MathClass math = new MathClass();
//            System.out.println(math.calc(inputArrayOperands));
//            Date stop = new Date();
//        System.out.println((stop.getTime() - start.getTime()) + " ms")
       text.setText(math.calc(inputArrayOperands));

        });

        pane.getChildren().addAll(textField, text,btn);

        primaryStage.setTitle("Калькулятор Римских и Арабских чисел");
//        primaryStage.setWidth(700);
//        primaryStage.setHeight(400);
//        Label labeleOne = new Label("Calc");
//        labeleOne.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(pane, 500, 200));
        primaryStage.setResizable(false);
        primaryStage.show();


//        Button button = new Button("Calculate!");
//        button.setOnAction(e -> {
//
//            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Результат выражения: " + MainCalcularot.m());
//
//            alert.showAndWait();
//        });
//        Scene primaryScene = new Scene(labeleOne);
//        primaryStage.setScene(primaryScene);
//
//
//        primaryStage.show();


    }
//    public class MainSceneController {
//        public void buttonClicked() {
//            System.out.println("Button clicked!");
//        }
//    }

    public static String m() {
        InputKeyboard inputKeyboard = new InputKeyboard();
        String[] inputArrayOperands = inputKeyboard.getArrayOperands();
        MathClass math = new MathClass();
        return math.calc(inputArrayOperands);
    }
}