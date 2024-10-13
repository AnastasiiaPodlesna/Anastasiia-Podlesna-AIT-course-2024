package homework.adress;

// Создать класс Address, проверить:
// город с большой буквы
// индекс содержит 5 цифр
// предложите еще тесты

public class Address
{
    private String street;
    private String house_number;
    private String town;
    private String index;
    private String country;

    // конструктор
    public Address(String street,
            String house_number,
            String town,
            String index,
            String country)
    {
        this.street = street;
        if (isRightHouseNumber(house_number))
        {
            setHouse_number(house_number);
        }
        if (isTownWithCapitalLetter(town))
        {
            setTown(town);
        }
        if (isIndexContains5Digits(index))
        {
            setIndex(index);
        }
        this.country = country;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getHouse_number()
    {
        return house_number;
    }

    public void setHouse_number(String house_number)
    {
        this.house_number = house_number;
    }

    public String getTown()
    {
        return town;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public String getIndex()
    {
        return index;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    // проверка: город с большой буквы или нет
    public boolean isTownWithCapitalLetter(String str)
    {
        if (str == null || Character.isLowerCase(str.charAt(0)))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    // проверка: индекс содержит 5 цифр
    public boolean isIndexContains5Digits(String str)
    {
        if (str == null || str.length() != 5)
        {
            return false;
        }

        for (char item : str.toCharArray())
        {
            if (!Character.isDigit(item))
            {
                return false;
            }
        }
        return true;
    }

    // проверка: номер дома содержит только буквы, цифры и знаки (-, /)
    public boolean isRightHouseNumber(String str)
    {
        for (char item : str.toCharArray())
        {
            if (!(Character.isDigit(item) || Character.isLetter(item) || item == '/' || item == '-'))
            {
                return false;
            }
        }
        return true;
    }
}
