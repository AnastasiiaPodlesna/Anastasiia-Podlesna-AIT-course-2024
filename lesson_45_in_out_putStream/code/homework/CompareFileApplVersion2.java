package homework;

//  В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CompareFileApplVersion2
{
    public static void main(String[] args)
    {
    if (args.length != 2)
    {
        System.out.println("Wrong number of arguments.");
        return; // Завершаем программу, если передано неправильное количество аргументов
    }

    Path file1 = Paths.get(args[0]);
    Path file2 = Paths.get(args[1]);

    System.out.println("Input file: " + file1);
    System.out.println("Destination file: " + file2);

    try
    {
        // проверяем, равны ли файлы побайтово
        boolean filesMatch = Files.size(file1) == Files.size(file2) &&
                Files.mismatch(file1, file2) == -1; //  сравниваем содержимое файлов: если результат равен -1, то файлы совпадают, иначе — нет.

        if (filesMatch) // если совпали
        {
            System.out.println("Files match!");
        }
        else
        {
            System.out.println("Files don't match!");
        }
    } catch (IOException e)
    {
        System.out.println("Error reading files: " + e.getMessage());
    }
}
}
