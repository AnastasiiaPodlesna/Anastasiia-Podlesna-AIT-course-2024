package classwork.user;

public class User
{
    private String email;
    private String password;

    public User(String email,
            String password)
    {
        this.email = email;
        this.password = password;
    }

    // constructor

//    public User(String email, String password)
//    {
//        setEmail(email);
//        setPassword(password);
//    }

    public String getEmail()
    {
        System.out.println("------------------------");
        return email;
    }

    public void setEmail(String email)
    {
        if(isEmailValid(email))
        {
            this.email = email;
        }
        else System.out.println(email + " is not valid.");
    }

    private boolean isEmailValid(String email)
    {
        int indexAt = email.indexOf('@'); // index where @ placed

        // // проверка: если нет @ или если более одной @
        if(indexAt == -1 || indexAt != email.lastIndexOf('@'))
        {
            return false;
        }
        // проверка: если нет точки
        if(email.indexOf('.', indexAt) == -1)
        {
            return false;
        }
        // проверка: если последняя точка стоит на позиции последних 2 символов имейла
        if(email.lastIndexOf('.') >= email.length() - 2)
        {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            // проверка: если символ не является символом алфавита, или цифрой, или знаком
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }







}
