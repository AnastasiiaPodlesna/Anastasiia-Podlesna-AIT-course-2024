package exeption_handling;

public class NoSolutionExeption extends Exception
{
    public NoSolutionExeption()
    {}

    public NoSolutionExeption(String message)
    {
        super(message);
    }
}
