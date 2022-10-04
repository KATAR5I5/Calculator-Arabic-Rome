import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputKeyboard {
    private String [] arrayOperands;

    InputKeyboard() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strFirst;
        Pattern pattern = Pattern.compile("(\\w+)\\s*(\\W)\\s*(\\w+)");
        Matcher matcher;
        do {
            System.out.println("Введите выражение типа (а + в)...");
            strFirst = bufferedReader.readLine().trim();
            matcher = pattern.matcher(strFirst);
        }
        while (strFirst.isEmpty() || !matcher.find());
        {
            System.out.println("Результат выражения");
            // проверка на пустоту и соответствие
        }
        arrayOperands = new String[3];
        arrayOperands[0] = matcher.group(1).toUpperCase();
        arrayOperands[1] = matcher.group(2);
        arrayOperands[2] = matcher.group(3).toUpperCase();
    }

    public String[] getArrayOperands() {
        return arrayOperands;
    }
}
