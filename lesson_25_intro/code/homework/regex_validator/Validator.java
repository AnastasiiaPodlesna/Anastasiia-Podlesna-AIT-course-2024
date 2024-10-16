package homework.regex_validator;

public class Validator
{
       // CreditCardNumber
        public static boolean checkCreditCardNumber(String str)
        {
            return str.matches("\\d{8,16}"); // только числа в диапазоне от 0 до 9
                                                   // и длиной от 8 до 16 цифр каждое
        }

        /* DateFormatEU - dd-MM-yyyy(?)
        ^  - начало строки
        (0[1-9]|[12][0-9]|3[01]) - день:
        0[1-9]     -  от 01 до 09
        [12][0-9]  -  от 10 до 29
        3[01]      -  30 или 31
        \\.        - точка, отделяет день от месяца (экранирована)
        (0[1-9]|1[0-2]) - месяц:
        0[1-9]     - от 01 до 09 (январь-сентябрь)
        1[0-2]     - от 10 до 12 (октябрь-декабрь).
        \\.        - дефис (экранирован)
        (\d{4})    - год
        $          - конец строки.
        */
        public static boolean checkDateFormatEU(String str)
        {
            // TODO Homework checkDateFormatEU // образец 26.10.2023
            return str.matches("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})$");
        }

        // DateFormatUS - yyyy-MM-dd
        public static boolean checkDateFormatUS(String str)
        {
            // TODO Homework checkDateFormatUS // образец 2023.10.31
            return str.matches("^(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])$");
        }

        /*  PhoneNumber
         ^       - начало строки
         \\+     - плюс, который должен стоять в начале (экранирован)
         0[1-9]  - первые две цифры, где первая цифра - 0, а вторая от 1 до 9
         \\(     - открывающая скобка (экранирована)
         0[1-9]  - две цифры, где первая цифра - 0, а вторая от 1 до 9
         \\)     - закрывающая скобка (экранирована)
         \\d{4}  - четыре цифры для первой части номера
         -       - дефис
         \\d{4}  - четыре цифры для второй части номера
         $       - конец строки
        */
        public static boolean checkPhoneNumber(String str)
        {
            // TODO Homework checkPhoneNumber // образец +08(01)1234-5678
            return str.matches("^\\+0[1-9]\\(0[1-9]\\)\\d{4}-\\d{4}$");
        }

        /* LessEquals255
         25[0-5]    - числа от 250 до 255
         2[0-4]\\d  - числа от 200 до 249
         1\\d{2}    - числа от 100 до 199
         [1-9]?\\d  - числа от 0 до 99 (учитывает ноль)
        */
        public static boolean checkLessEquals255(String str){
            // TODO Homework checkLessEquals255
            return str.matches("^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
        }

    }

