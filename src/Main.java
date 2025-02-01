import java.math.BigDecimal;

public class Main {

    private static final int INT_VALUE = 100;

    public static void main(String[] args) {
        //Примитивы

        //Целочисленные типы данных
        //byte, short, int, long

        //Дробные типы данных
        //double, float

        //Логический тип данных (true, false)
        //boolean

        //Символьный тип данных
        //char

        //Ссылочные
        //String, Integer, Long, Double, Float, Boolean
        System.out.println(INT_VALUE);
        byte a = 1; // 1 байт (-128 .. 127)
        short b = 2; // 2 байта (-32768 .. 32767)
        int c = 10; //4 байта (-2 000 000 000 ... 2 000 000 000);
        long d = 68L; //8 байти (Очень большие числа)

        double f = 50.5; // 8 байт (Очень большие числа, до 15 знаков после запятой)
        float g = 564.35f; //4 байта (Очень большие числа, до 7 знаков после запятой)

        boolean bl = true;
        char ch = 'f';
        String str = "Привет";

        byte a1 = 4;
        byte a2 = 5;
        byte a3 = (byte) (a1 + a2);

        final int INT_VALUE = 100;
        int a4 = 10;
        int a5 = 20;
        int a6 = a4 + a5;

        System.out.println("Результат сложение = " + a3);

        int a7 = a2 / a1;
        double b1 = 4.0;
        double b2 = 5.0;
        double a8 = b2 / b1;

        System.out.println("Результат деления = " + a7);
        System.out.println("Результат деления = " + a8);

        double result = 0.1 + 0.2;
        System.out.println(result);

        int o = 10;
        o += 20;
        System.out.println(++o);
        System.out.println(o++);
        System.out.println(o);

        var i = 4;
        var j = 5;
        var res = (double) j / i;
        var str1 = "Строка";

        System.out.println(res);
        System.out.println(str1);

    }

}
