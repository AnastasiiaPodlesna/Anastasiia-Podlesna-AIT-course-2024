package programmer_and_technologies;

import java.util.List;

public class Programmer
{
    private String nickName;
    private List<String> technology; // Set тоже можно

    public Programmer(String nickName,
            List<String> technology)
    {
        this.nickName = nickName;
        this.technology = technology;
    }

    public String getNickName()
    {
        return nickName;
    }

    public List<String> getTechnology()
    {
        return technology;
    }

    @Override
    public String toString()
    {

        return "Programmer: " + nickName + " technologiy " + technology.toString();
    }
}
