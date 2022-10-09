import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputKeyboard {
    private String[] arrayOperands = new String[3];
    private String input;

    InputKeyboard() {
        Pattern pattern = Pattern.compile("(\\w+)\\s*(\\W)\\s*(\\w+)");
        Matcher matcher;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Введите выражение типа (а + в)...");
                input = bufferedReader.readLine().trim();
                matcher = pattern.matcher(input);
            }
                // проверка на пустоту и соответствие
            while (input.isEmpty() || !matcher.find());
            {
                System.out.println("Результат выражения");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        arrayOperands[0] = matcher.group(1).toUpperCase();
        arrayOperands[1] = matcher.group(2);
        arrayOperands[2] = matcher.group(3).toUpperCase();
    }

    public String[] getArrayOperands() {
        return arrayOperands;
    }
}
