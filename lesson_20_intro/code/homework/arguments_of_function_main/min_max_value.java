package homework.arguments_of_function_main;

// Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов:
// byte, short, char, int, long, float, double
// Типы как объекты String должны браться из аргументов основной функции main.
// Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести
// максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
// Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class min_max_value
{

public static void main(String[] args)
{
    if (args.length == 0)
    {
        display_Min_Max();
        return;
    }

    for (String arg : args)
    {
        switch (arg)
        {
            case "byte" -> display_Byte_Min_Max();
            case "int" -> display_Int_Min_Max();
            case "short" -> display_Short_MinMax();
            case "long" -> display_Long_Min_Max();
            case "char" -> display_Char_Min_Max();
            case "float" -> display_Float_Min_Max();
            case "double" -> display_Double_Min_Max();
            default -> System.out.println("Invalid type: " + arg);
        }
    }
}

    private static void display_Min_Max()
    {
        display_Byte_Min_Max();
        display_Short_MinMax();
        display_Char_Min_Max();
        display_Int_Min_Max();
        display_Long_Min_Max();
        display_Float_Min_Max();
        display_Double_Min_Max();
    }

    private static void display_Byte_Min_Max()
    {
        System.out.println("byte: min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE);
    }

    private static void display_Short_MinMax()
    {
        System.out.println("short: min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE);
    }

    private static void display_Char_Min_Max()
    {
        System.out.println("char: min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE);
    }

    private static void display_Int_Min_Max()
    {
        System.out.println("int: min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE);
    }

    private static void display_Long_Min_Max()
    {
        System.out.println("long: min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
    }

    private static void display_Float_Min_Max()
    {
        System.out.println("float: min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE);
    }

    private static void display_Double_Min_Max()
    {
        System.out.println("double: min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE);
    }

}




