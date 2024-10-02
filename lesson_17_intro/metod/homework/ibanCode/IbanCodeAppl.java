package homework.ibanCode;

// Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную
// длину (в Германии - 22 символа). Создать класс IbanCode, в котором определить необходимые поля и
// реализовать методы:
// lengthCode(String code), который возвращает количество символов в счете
// controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
// isValid(String code), который проверяет штрих-код на правильное количество символов

import homework.ibanCode.model.IbanCode;

public class IbanCodeAppl
{
    public static void main(String[] args)
    {
        IbanCode ibanCode1 = new IbanCode("DE2367NUK23400036GRILL");
        IbanCode ibanCode2 = new IbanCode("DE0000FH234");

        System.out.println("\n------------------------------------------------------------------------------------");
        ibanCode1.display(ibanCode1.lengthCode(ibanCode1.getIbanCode()), ibanCode1.controlCode(ibanCode1.getIbanCode()), ibanCode1.isValid(ibanCode1.getIbanCode()));
        System.out.println("\n------------------------------------------------------------------------------------");
        ibanCode2.display(ibanCode2.lengthCode(ibanCode2.getIbanCode()), ibanCode2.controlCode(ibanCode2.getIbanCode()), ibanCode2.isValid(ibanCode2.getIbanCode()));


    }
}
