package classwork.sb_vs_string;

// 100000 раз сказать Мяв

public class PerfomanceTest
{
    private static final int N_ITERATION = 100_000;
    private static final String WORD = "Meow";
    public static void main(String[] args)
    {
        // String
        long t1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < N_ITERATION; i++)
        {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Time String = " + (t2 - t1));

        // StringBuilder
        t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N_ITERATION; i++)
        {
            sb = sb.append(WORD);
        }
        System.currentTimeMillis();
        System.out.println("Time StringBuilder = " + (t2 - t1));

    }
}
