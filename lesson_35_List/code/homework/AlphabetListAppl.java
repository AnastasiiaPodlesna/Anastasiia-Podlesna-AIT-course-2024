package homework;

// Заполните структуру типа ArrayList<> символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;

public class AlphabetListAppl
{
    public static void main(String[] args)
    {
        ArrayList<Character> alphabetList = new ArrayList<>();

        // заполнение списка символами
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            alphabetList.add(ch);
        }

        System.out.println("Alphabet List: " + alphabetList);
    }
}
