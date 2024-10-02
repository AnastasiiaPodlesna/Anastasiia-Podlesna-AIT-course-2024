package homework;

// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
// что увеличит стоимость билета на 25%. Создайте метод calculateTicketPrice,
// который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость
// билета. Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

import java.util.Scanner;

public class CinemaTickets
{
    public static void main(String[] args)
    {
        int age = 0;
        int studentDiscount = 0;
        int vipSeat = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("I'm Bot Vasya! Welcome to our movie theater! ");

        // Ввод возраста
        System.out.println("Give your age: ");
        age = in.nextInt();

        while (age < 0 && age > 120)
        {
            System.out.println("Wrong input! Try again, please...");
            age = in.nextInt();
        }

        // Ввод ответа по поводу статуса студента

        if (age < 67)
        {
            in = new Scanner(System.in);
            System.out.println("Are you a student?\n" + "1 - yes, 0 - no ");
            studentDiscount = in.nextInt();

            while (studentDiscount != 1 && studentDiscount != 0)
            {
                System.out.println("Wrong input! Try again, please...");
                studentDiscount = in.nextInt();
            }
        }

        // Ввод ответа по поводу необходимости VIP-места
        in = new Scanner(System.in);
        System.out.println("Are you interested in a VIP seat?\n" + "1 - yes, 0 - no");
        vipSeat = in.nextInt();

        while (vipSeat != 1 && vipSeat != 0)
        {
            System.out.println("Wrong input! Try again, please...");
            vipSeat = in.nextInt();
        }

        double ticketPrice = calculateTicketPrice(age, studentDiscount, vipSeat); // Вызов метода

        System.out.printf("So, you have chosen a ticket, the price of which:  %.2f euro", ticketPrice);
    }

    // Метод расчета стоимости билета
    private static double calculateTicketPrice(int age, int student_discount, int flag)
    {
        double ticketPrice = 30;

        if (age >= 67)
            ticketPrice = ticketPrice - ticketPrice * 0.25;

        if (student_discount == 1)
            ticketPrice = ticketPrice - ticketPrice * 0.1;

        if (flag == 1)
            ticketPrice = ticketPrice + ticketPrice * 1.25;

        return ticketPrice;
    }
}





