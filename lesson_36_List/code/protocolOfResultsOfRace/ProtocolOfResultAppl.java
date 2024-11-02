package protocolOfResultsOfRace;

import protocolOfResultsOfRace.model.Athlete;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProtocolOfResultAppl
{
    public static void main(String[] args)
    {
        List<Athlete> athletes = new ArrayList<>();

        athletes.add(new Athlete("Ivanov", "Ivan", 100, "SC A", 10.5));
        athletes.add(new Athlete("Petrov", "Petr", 101, "SC B", 11.2));
        athletes.add(new Athlete("Sidorov", "Sidor", 102, "SC A", 10.8));
        athletes.add(new Athlete("Vesechkin", "Vasiliy", 103, "SC C", 11.0));
        athletes.add(new Athlete("Annova", "Anna", 104, "SC B", 10.6));
        athletes.add(new Athlete("Mikhaylov", "Mikhail", 105, "SC A", 11.3));
            athletes.add(new Athlete("Volkova", "Olga", 106, "SC C", 10.9));
        athletes.add(new Athlete("Sergeev", "Sergey", 107, "SC B", 11.1));
        athletes.add(new Athlete("Natajlova", "Natalia", 108, "SC A", 10.7));
        athletes.add(new Athlete("Dmitriev", "Dmitry", 109, "SC C", 11.4));

        System.out.println("Results of the athletes:");
        display(athletes, athletes.size());

        System.out.println("final protocol of the competition:");
        athletes.sort(Comparator.comparing(Athlete::getResult));
        display(athletes, athletes.size());

        System.out.println("Winners'2024: ");
        display(athletes, 3);
    }

    public static void display(List<Athlete> a, int index)
    {
        for (int i = 0; i < index; i++)
        {
            System.out.println((i + 1) + " place: " + a.get(i).getRegistrationNumber() + " " + a.get(i).getLastName()+ " " + a.get(i).getFirstName()+ ": sport club '" + a.get(i).getClub() + "', result => " + a.get(i).getResult());
        }
        System.out.println("----------------------------------------------------------");
    }


}
