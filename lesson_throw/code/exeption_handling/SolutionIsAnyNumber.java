package exeption_handling;

public class SolutionIsAnyNumber extends RuntimeException
{
    // empty constructor
    public SolutionIsAnyNumber()
    {
    }

    // constructor
    public SolutionIsAnyNumber(String message)
    {
        super(message);
    }
}
