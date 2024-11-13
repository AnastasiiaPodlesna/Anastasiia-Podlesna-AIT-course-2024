package io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutPutAppl
{
    public static void main(String[] args)
    {
        try (FileOutputStream fout = new FileOutputStream("date.txt"))
        {

            fout.write(65);
            fout.write(66);
            fout.write(67);
            fout.write(10); // enter
            for (int i = 0; i < 26; i++)
            {
                fout.write(65 + i);
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
