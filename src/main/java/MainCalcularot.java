import java.util.Date;

public class MainCalcularot {
    public static void main(String[] arg)  {
//        объект ввода с клавиатуры
        InputKeyboard inputKeyboard = new InputKeyboard();
//        Массив операндов из Веденной с клавиатуры строки
        Date start = new Date();
        String[] inputArrayOperands = inputKeyboard.getArrayOperands();

        MathClass math = new MathClass();
        System.out.println(math.calc(inputArrayOperands));
        Date stop = new Date();
        System.out.println((stop.getTime() - start.getTime()) + " ms");
    }
}
