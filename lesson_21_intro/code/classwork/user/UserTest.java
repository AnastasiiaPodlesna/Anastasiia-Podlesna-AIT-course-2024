package classwork.user;

// Запрещено:
// пробел и табуляция
// знак восклицания (!)
// решётка (#)
// знак доллара ($)
// процент (%)
// амперсанд (&)
// тильда (~)
// знак равно (=)
// запятая (,)
// апостроф (')
// более одной точки подряд
// имя пользователя не может начинаться с точки и заканчиваться точкой

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest
{
    final String email = "peter@mail.de";  // ideal email
    final String password = "123456Az!";   // ideal password

//    @BeforeEach
//    void setUp()
//    {
//        User user = new User(email, password);  // create new "fresh" object user
//    }


    // ошибки метода:

    @Test
    void searchBUG1()
    {
        User user = new User(email, password);
        user.setEmail("peter@mail..de"); //  = Bug1
        assertEquals("peter@mail.de", user.getEmail()); // email change!
    }

    @Test
    void searchBUG2()
    {
        User user = new User(email, password);
        user.setEmail("peter@.mail.de"); //  = Bug2
        assertEquals("peter@mail.de", user.getEmail()); // email change!
    }

    @Test
    void searchBUG3()
    {
        User user = new User(email, password);
        user.setEmail("@mail.de"); //  = Bug3
        assertEquals("peter@mail.de", user.getEmail()); // email change!
    }














}