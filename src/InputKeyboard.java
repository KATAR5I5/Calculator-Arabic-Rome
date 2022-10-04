import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputKeyboard {
    String [] s;

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
        s = new String[3];
        s[0] = matcher.group(1).toUpperCase();
        s[1] = matcher.group(2);
        s[2] = matcher.group(3).toUpperCase();

    }
}
