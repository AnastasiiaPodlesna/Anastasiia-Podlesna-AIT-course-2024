package homework;

//  В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class CompareFileAppl
{
    public static void main(String[] args)
    {
        int fin1Size = 0, fin2Size = 0;
        byte[] byteArray_fin1 = null,  byteArray_fin2 = null;

        if(args.length != 2)
        {
            System.out.println("Wrong number of arguments.");
            return;
        }

        System.out.println("Input file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        // Создается поток для чтения из исходного файла, путь к которому передан через args[0]
        try (FileInputStream fin1 = new FileInputStream(args[0]))
        {
            fin1Size = fin1.available(); // длина
            byteArray_fin1 = new byte[fin1Size];
            fin1.read(byteArray_fin1); // прочитали из первого файла информацию в массив
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // Создается поток для чтения из исходного файла, путь к которому передан через args[1]
        try (FileInputStream fin2 = new FileInputStream(args[1]))
        {
            fin2Size = fin2.available();
            byteArray_fin2 = new byte[fin2Size];
            fin2.read(byteArray_fin2); // прочитали из второго файла информацию в байтовый массив
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        if (fin1Size != fin2Size)
        {
            System.out.println("Files don't match!");
        }
        else if (!Arrays.equals(byteArray_fin1, byteArray_fin2))
        {
            System.out.println("Files don't match!");
        }
        else
        {
            System.out.println("Files match!");
        }
        
    }
}
