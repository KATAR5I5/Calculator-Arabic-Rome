public class ArabicCalculate {
    public String result;

    ArabicCalculate(int a, int b, String sign) throws Exception {
        if (a >= 0 && b >= 0) {
            result = switch (sign) {
                case "+" -> String.valueOf(a + b);
                case "-" -> Integer.toString(a - b);
                case "*" -> Integer.toString(a * b);
                case "/" -> (b != 0) ? Integer.toString(a / b) : "Ошибка! Деление на ноль!!!";
                default -> {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        yield "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
                    }
                }
            };
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                result = "throws Exception //Операнд находится за пределами от 1 до 10 включительно.";
            }
        }
    }
}
