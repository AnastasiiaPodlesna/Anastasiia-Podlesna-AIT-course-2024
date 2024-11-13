package employee_save_read;

import java.io.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl
{
    public static void main(String[] args) {

        Address adress1 = new Address("C1", "St1", 12, 10, 86356);
        Address adress2 = new Address("C1", "St2", 21, 35, 86356);

        Employee e1 = new Employee(1, "Peter", LocalDate.of(2000, 04, 1), 5900, adress1);
        Employee e2 = new Employee(2, "Jacob", LocalDate.of(2000, 04, 10), 5800, adress2);

        Set<Employee> firma = new HashSet<>();
        firma.add(e1);
        firma.add(e2);

        // отправляем в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat")))
        {
            oos.writeObject(firma); // запись в файл

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
