package citizens.dao;

import citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens
{

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // если фамилии одинаковые, то сравниваем по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>(); // инициализация трех пустых списков для сортировки по id, lastName, age соответственно. Сортировки происходят в add
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this(); // Вызов конструктора без параметров ??
        citizens.forEach(p -> add(p)); // для каждого гражданина в списке citizens вызывается метод add(p), где p — это текущий элемент (гражданин) из списка, кот. добавляется в три отсортированных коллекции


    }
    @Override
    public boolean add(Person person) {
        // если person равен null (пустой), мы не добавляем его в список
        if (person == null) {
            return false;
        }
        // поиск гражданина по id в списке (отсортированном по id)
        int index = Collections.binarySearch(idList, person); // O(log n)
        if (index >= 0) { // если index >= 0, значит гражданин уже есть в списке
            return false; // не добавляем, найден дубликат по id
        }
        // ищем место для вставки по id
        index = -index - 1; // отрицательный индекс от binarySearch преобразуем в индекс для вставки
        idList.add(index, person); // вставка на найденную позицию, сдвигаем элементы в списке

        // поиск по возрасту
        index = Collections.binarySearch(ageList, person, ageComparator);  // O(log n)
        index = index >= 0 ? index : - index - 1; // аналогично находим место для вставки
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator); // O(log n)
        index = index >= 0 ? index : -index - 1; // аналогично находим место для вставки
        lastNameList.add(index, person); // вставляем в отсортированный по возрасту список
        return true; // возвращаем true, гражданин успешно добавлен
    }


    @Override
    public boolean remove(int id) {
        Person victim = find(id); // O(log n)  ищем гражданина по id
        if (victim == null) {
            return false; // если гражданина с таким id нет, возвращаем false
        } // удаляем гражданина из всех трех отсортированных списков
        idList.remove(victim); // удаление элемента из списка => O(n), т.к.необходимо сдвигать оставшиеся элементы
        ageList.remove(victim); // O(n) - аналогично
        lastNameList.remove(victim); // O(n) - аналогично
        return true; // возвращаем true, если гражданин был удален из всех списков
    }

    @Override
    public Person find(int id) {  // создаем временный объект Person для поиска
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern); // O(log n)
        return index < 0 ? null : idList.get(index); // если найден, возвращаем объект, если нет, возвращаем null
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        // бинарный поиск для нахождения индекса гражданина с минимальным возрастом
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;// O(log n)
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        // бинарный поиск для нахождения индекса гражданина с максимальным возрастом
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1; // O(log n)
        return ageList.subList(from, to);
    }

    @Override
    public Iterable<Person> find(String lastName)
    {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        // бинарный поиск для нахождения индекса гражданина с фамилией lastName
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;  // O(log n)
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;  // O(log n)
        return lastNameList.subList(from, to); // O(n), где n — количество найденных граждан
    }

    // операция возврата ссылки на коллекцию имеет O(1) сложность, так как это просто передача указателя на список, без дополнительных вычислений.
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // возвращение списка — операция с постоянной сложностью, так как мы не выполняется никакой дополнительной обработки (как поиск или сортировка). Поэтому сложность: O(1) (константная сложность).
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() { // Возвращаем отсортированный список по id
        return lastNameList;
    }

    // аналогично O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // size - встроенный метод коллекции в Java, который возвращает размер списка, и этот размер поддерживается на протяжении работы программы. Сложность аналогично O(1) (доступ к значению не требует перебора элементов)
    @Override
    public int size() {
        return idList.size(); // возвращает размер списка idList
    }
}