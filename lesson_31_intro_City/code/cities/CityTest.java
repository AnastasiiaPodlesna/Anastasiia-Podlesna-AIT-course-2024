package cities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

//City("Denver", 600_000);
//City("Boston", 670_000);
//City("Chicago", 2_700_000);
//City("Atlanta", 470_000);
//City("New York", 8_500_000);
//City("Dallas", 1_300_000);

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];

        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }


    public void printArray(Object[] array,
            String titleOfReport)
    {
        System.out.println("------------" + titleOfReport + "--------------------");
        for (Object o : array)
        {
            System.out.println(o);
        }
    }

    // Распечатать в отсортированном виде.
    //Есть ли в списке городов город с населением 1.2 млн человек?
    @Test
    void testComparable() {
        printArray(cities, ":List of cities as is");
        Arrays.sort(cities);
        printArray(cities, "List of cities sorted by population");

        City pattern = new City(null, 1_200_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println(index);
    }

    //Отсортируйте список по алфавиту.
    //Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?
    @Test
    void testComparatorByName() {
        Comparator<City> comparatorByCityName = new Comparator<City>() {
            @Override
            public int compare(City o1,
                    City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(cities, comparatorByCityName);
        printArray(cities, "List of cities sorted by name");
        City pattern = new City("Las Vegas", 0);
        int index = Arrays.binarySearch(cities, pattern, comparatorByCityName);
        if (index < 0) {
            System.out.println("City " + pattern.getName() + " not found, but it could be on index " + (-index - 1));
        } else System.out.println("City " + pattern.getName() + " found by index: " + index);
    }

    //Скопируйте массив в другой, имеющий в 2 раза большую длину.
    //Отсортируйте полученный массив.
    @Test
    void testArrayCopy()
    {

//        Comparator<City> comparatorByName = new Comparator<City>()
//        {
//            @Override
//            public int compare(City o1, City o2)
//            {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2); // массив - копия, с длиной в 2 раза больше
        Comparator<City> comparatorByName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        //sorting
        Arrays.sort(citiesCopy, comparatorByName);
        // print
        printArray(citiesCopy, "cities copy after sorting by name");

        //Имеется ли в списке городов город Salem?
        City pattern = new City("Salem", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparatorByName);
        System.out.println(index);
    }

    // Вставьте город Salem в список, сохранив порядок сортировки по населению.
    @Test
    void testInsertKeepSorting()
    {
        Arrays.sort(cities); // by default sorting
        printArray(cities, "Native sorting");
        // increase up to 7
        City[] citiesCopy7 = Arrays.copyOf(cities, cities.length + 1);// расширяем массив
        City city = new City("Salem", 690_000); // новый объект
        int index = Arrays.binarySearch(citiesCopy7, 0, citiesCopy7.length - 1, city);

        System.out.println("======" + index);

        index = index >= 0 ? index : -index - 1; // обработка индекса
        // подготовили место для вставки
        System.arraycopy(citiesCopy7, index, citiesCopy7, index +1, citiesCopy7.length - index - 1);
        // - sourceArray (citiesCopy7):  массив, из которого нужно скопировать данные.
        // - sourcePosition (index): Это начальная позиция в исходном массиве, откуда начинается копирование. Значение index указывает, с какого элемента начать копировать.
        // - destinationArray (citiesCopy7): Это массив, в который нужно вставить скопированные данные. Здесь это тот же массив citiesCopy7, что означает, что мы перемещаем элементы внутри одного и того же массива.
        // - destinationPosition (index + 1): Это позиция в целевом массиве, куда будут вставляться скопированные элементы. index + 1 означает, что нужно вставить элементы сразу после index, что в итоге сдвинет их на одну позицию вправо.
        //
        // length (citiesCopy7.length - index - 1): Это количество элементов, которые нужно скопировать. Это выражение определяет, сколько элементов остается в массиве после позиции index, за исключением самого элемента на позиции index.

        citiesCopy7[index] = city; // всунули город
        cities = citiesCopy7; // переопределили ссылку на массив
        printArray(cities, "List with added city");

    }
    // Проверьте работу метода System.arraycopy, скопировав часть массива.
    @Test
    void testSystemArrayCopy()
    {
        // расширим массив на 2 элемента
        City[] citiesCopyPlus2 = new City[cities.length + 2];
        // копируем имеющийся массив в новый
        System.arraycopy(cities, 2, citiesCopyPlus2, 3,4);
        printArray(cities, " Original array ");
        printArray(citiesCopyPlus2, " Copy of array ");
    }

    // Проверьте работу метода Arrays.copyOfRange
    @Test
    void testArrayCopyOfRange()
    {
        City[] citiesCopy = Arrays.copyOfRange(cities, 4, cities.length + 3);
        printArray(cities," Original array ");
        printArray(citiesCopy, " Copy of array ");
    }





}