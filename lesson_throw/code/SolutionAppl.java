import exeption_handling.NoSolutionExeption;
import exeption_handling.SolutionIsAnyNumber;

public class SolutionAppl
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 38;

        int x = 0;
        try {
            x = solution(a,b);
        } catch (NoSolutionExeption e) {
            throw new RuntimeException(e);
        }
        System.out.println("X = " + x);

    }

    private static int solution(int a, int b) throws NoSolutionExeption {
        if(a == 0 && b != 0)
        {
            throw new NoSolutionExeption("No possible solution, division by 0 impossible!");
        }

        if(a == 0 && b == 0)
        {
            throw new SolutionIsAnyNumber("X - is any number!");
        }
        return a/b;
    }
}
