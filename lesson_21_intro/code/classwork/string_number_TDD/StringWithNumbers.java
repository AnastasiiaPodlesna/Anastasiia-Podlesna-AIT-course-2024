package classwork.string_number_TDD;

public class StringWithNumbers
{
    // fields
    private String string;

    // constructor
    public StringWithNumbers(String string)
    {
        this.string = string;
    }

    public String getString()
    {
        return string;
    }

    public void setString(String string)
    {
        this.string = string;
    }

    @Override
    public String toString()
    {
        return "classwork.string_number_TDD.StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }



    // 123 456 987 333
    public int sumOfNumbersInString(String string)
    {
       String[] numbers = string.split(" ");
       int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
           sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }

}
