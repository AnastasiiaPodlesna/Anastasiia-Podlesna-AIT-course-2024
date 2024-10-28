package coffeemashine;

// Используя enum, напишите программу для продажи 4-х видов кофе:
// ESPRESSO,
// AMERICANO,
// CAPPUCCINO,
// LATTE
// Предложите пользователю кофе на выбор, по результатам выбора сообщите стоимость напитка.

public enum Coffee
{
    ESP("Espresso", 2.5, 1), AMR("Americano", 3.0, 2), CAP("Cappuccino", 4.0, 3), LAT("Latte", 4.9, 4);
    private String title;
    private Double price;
    private int choice;

    Coffee(String title, Double price, int choice)
    {
        this.title = title;
        this.price = price;
        this.choice = choice;
    }

    public String getTitle()
    {
        return title;
    }

    public Double getPrice()
    {
        return price;
    }

    public int getChoice()
    {
        return choice;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("coffeemashine.Cofee{");
        sb.append("title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }

}
