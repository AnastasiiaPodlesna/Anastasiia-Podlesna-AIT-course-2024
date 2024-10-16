package classwork.regex_appl;

import org.w3c.dom.ls.LSOutput;

public class RegexAppl
{
    public static void main(String[] args)
    {

    String text = " Java";
    String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?";

    boolean checker = text.matches(pattern);

    System.out.println(checker);
    System.out.println("---------------------------------");
        //domain

        String domain = "A-b-r.a-kadabra.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)";
        checker = domain.matches(pattern);
        System.out.println(checker);

        // email
        /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) after last dot 2 or more symbols (done)
    4) alphabetic, digits, '_', '-', '.', '@' (done)
*/
        System.out.println("----------------------------------------------------------");
        String email = "peter@mail.Co";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)@[a-zA-Z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        checker = email.matches(pattern);
        System.out.println(checker);

        System.out.println("---------------------------------------------------");
        String str = "2018.10.31";
        pattern = "^(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])$";
        checker = str.matches(pattern);
        System.out.println(checker);

        System.out.println("---------------------------------------------------");
        String str2 = "+08(01)1234-5678";
        pattern = "^\\+0[1-9]\\(0[1-9]\\)\\d{4}-\\d{4}$";
        checker = str2.matches(pattern);
        System.out.println(checker);


        System.out.println("---------------------------------------------------");
        String str4 = "255";
        pattern = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        checker = str4.matches(pattern);
        System.out.println(checker);













    }
}
