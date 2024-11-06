package classwork.string_builder;

public class StringBuilderAppl
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        sb.append("_").append("21");  // добавить в конец строки
        System.out.println(sb);

        sb.reverse();  // развернуть строку
        System.out.println(sb);

        StringBuilder sbNew = new StringBuilder("Hello");
        sbNew.insert(5, "!");   // добавить в строку в указанное место
        System.out.println(sbNew);

    }
}
