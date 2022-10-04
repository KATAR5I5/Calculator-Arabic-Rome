public class MainCalcularot {
    public static void main(String[] arg) throws Exception {
// объект ввода с клавиатуры
        InputKeyboard inputKeyboard = new InputKeyboard();
        String [] inputString = inputKeyboard.s; // Веденная с клавиатуры строка UpperCase
        //Output
        System.out.println(calc(inputString));
    }

    public static String calc(String [] input) throws Exception {


        String[] strings = input;  // Массив операндов
        try {
            if (strings.length >= 4)
                throw new Exception();
        } catch (Exception e) {
            return "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
        }
        try {
            if (strings.length < 3)
                throw new Exception();
        } catch (Exception e4) {
            return "throws Exception //т.к. строка не является математической операцией";
        }
        int firstNumInt, secondNumInt;
        String firstNumStr = strings[0];
        String secondNumStr = strings[2];
        String sign = strings[1];
        try {
            firstNumInt = Integer.parseInt(firstNumStr);  // может быть не число
            secondNumInt = Integer.parseInt(secondNumStr); // может быть не число

            //    Объект арифметических действий с арабскими числами
            ArabicCalculate arabicCalculator = new ArabicCalculate(firstNumInt, secondNumInt, sign);
            return arabicCalculator.result;

        } catch (Exception e) {
            try {
                firstNumInt = getRomeNumber(firstNumStr);
                secondNumInt = getRomeNumber(secondNumStr);
                try {
                    if (!(1 <= firstNumInt && firstNumInt <= 10 & secondNumInt >= 1 & secondNumInt <= 10))
                        throw new Exception();
                } catch (Exception e1) {
                    return "throws Exception //Операнд находится за пределами от 1 до 10 включительно.";
                }
//    новый Объект арифметических действий с арабскими числами для римских
                ArabicCalculate arabicCalculator = new ArabicCalculate(firstNumInt, secondNumInt, sign);
                int arabicNumRome = Integer.parseInt(arabicCalculator.result);
                if (arabicNumRome <= 0) {
                    try {
                        throw new Exception();
                    } catch (Exception e1) {
                        return "throws Exception //т.к. в римской системе нет отрицательных чисел.";
                    }
                }
                String romeName = romeName(arabicNumRome);
                return (romeName);
            } catch (Exception e2) {
                return "throws Exception //т.к. используются одновременно разные системы счисления";
            }
        }
    }

    //    Метод перевода римского числа в арабское число
    static int getRomeNumber(String name) {
        RomeNumber rn = RomeNumber.valueOf(RomeNumber.class, name); // возвращаем объект совпадающис со строкой name
        int n = rn.ordinal(); // получаем индекс объекта
        return n;
    }

    //    Метод перевода арабского числа в римское
    static String romeName(int a) {
        for (RomeNumber element : RomeNumber.values()) {
            if (element.getNumber() == a)
                return element.toString();
        }
        return "Нет числа";
    }
}
