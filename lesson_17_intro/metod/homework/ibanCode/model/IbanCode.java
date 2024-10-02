package homework.ibanCode.model;

public class IbanCode
{
    private String ibanCode;

    public IbanCode(String ibanCode)
    {
        this.ibanCode = ibanCode;
    }

    public String getIbanCode()
    {
        return ibanCode;
    }

    public void setIbanCode(String ibanCode)
    {
        this.ibanCode = ibanCode;
    }

    public void display(int length, int control, boolean valid)
    {
        System.out.printf("IBAN:  %s has length %d characters, sum of the ASCII codes of the first 2 characters = %d, number of characters is %b", ibanCode, length, control, valid);
    }

    public int lengthCode(String code)
    {
        return code.length();
    }

    public int controlCode(String code)
    {
        return code.charAt(0) + code.charAt(1);
    }

    public boolean isValid(String code)
    {
        if (code != null && code.length() == 22) return true;
        return false;
    }


}

