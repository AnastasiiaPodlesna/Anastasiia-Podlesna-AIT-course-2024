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

// - требования к password:
//  1) length >= 8
//  2) min one digit
//  3) min one symbol in upperCase
//  4) min one symbol in lowerCase
//  5) min one special symbol (!%@$&)
//  6) length < 20

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest
{
    final String email = "peter@mail.de";  // ideal email
    final String password = "123456Az!";   // ideal password

    User user;

    @BeforeEach
    void setUp()
    {
        user = new User(email, password);  // create new "fresh" object user
    }

    @Test
    void SetValidEmail()
    {
        assertEquals("peter@mail.de", user.getEmail()); // email don't change!
    }

    @Test
    void testValidPassword()
    {
        assertEquals("123456Az!", user.getPassword());
    }

    // ошибки метода:

    @Test
    void testDoubleDots()
    {
        user.setEmail("peter@mail..de"); //  = Bug1
        assertEquals("peter@mail.de", user.getEmail()); // email change!
    }

    @Test
    void testFirstAt()
    {
        user.setEmail("@mail.de"); //  = Bug2
        assertEquals("peter@mail.de", user.getEmail()); // email change!
    }

    @Test
    void setValidPasswordLength()
    {
        user.setPassword("1345Az!"); // 7 symbols
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123rtrtd4345ty780aAz!"); // 21 symbols
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordMinOneDigit()
    {
        user.setPassword("Agjjkfdl!"); // don't digit
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123rtrtd4345ty780aAz!"); // 21 symbols
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterUpperCase()
    {
        user.setPassword("12345asjd!"); // don't one letter upper case
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterLowerCase()
    {
        user.setPassword("HJSID789SS!"); // don't one letter lower case
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneSpecialSymbol()
    {
        user.setPassword("123456Az"); // don't one special symbol
        assertEquals("123456Az!", user.getPassword());
    }
}