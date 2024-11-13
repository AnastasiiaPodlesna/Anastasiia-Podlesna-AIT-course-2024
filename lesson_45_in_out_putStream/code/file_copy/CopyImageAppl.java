package file_copy;

// пишем утилиту для копирования файла
// имена файлов передаются в аргументах командной строки

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageAppl
{
    public static void main(String[] args)
    {
        // String[] args - отвечает за получение аргументов
        // проверяем, что аргументов именно 2

        if(args.length != 2)
        {
            System.out.println("Wrong number of arguments.");
        }

        // print file names
        System.out.println("Input file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        try (FileInputStream fin = new FileInputStream(args[0])) // Создается поток для чтения из исходного файла, путь к которому передан через args[0]
        {
            FileOutputStream fout = new FileOutputStream(args[1]); // Создается поток для записи в файл назначения, путь к которому передан через args[1]

            // читать из файла пока != -1, пишем во второй файл
            int a = fin.read(); // читаем первый байт
            while (a != -1)
            {
                fout.write(a);// Записывает байт, считанный в переменную a, в выходной файл
                a = fin.read(); // считать следующий байт из входного файла
            }

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }




    }
}
