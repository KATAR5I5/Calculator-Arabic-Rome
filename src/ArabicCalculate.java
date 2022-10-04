public class ArabicCalculate {
    public String result;

    ArabicCalculate(int a, int b, String sign) throws Exception {
//        String sign = c;
        if (a >= 0 && b >= 0) {
            switch (sign) {
                case "+":
                    result = String.valueOf(a + b);
                    break;
                case "-":
                    int subtraction = a - b;
                    result = Integer.toString(subtraction);
                    break;
                case "*":
                    int multiplication = a * b;
                    result = Integer.toString(multiplication);
                    break;
                case "/":
                    if (b != 0) {
                        double division = a / b;

                        result = Double.toString(division);

                    } else result = "Ошибка! Деление на ноль!!!";
                    break;
                default:
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        result = "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
                    }
            }
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                result = "throws Exception //Операнд находится за пределами от 1 до 10 включительно.";
            }
        }
    }
}
