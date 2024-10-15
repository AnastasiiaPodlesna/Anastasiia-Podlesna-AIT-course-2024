package homework.auto;

// Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км.
// Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
// марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
// тип расходуемого топлива: d, b, d, d, b
// стоимость 1 литра топлива: d - 1.6, b - 1.8
// расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
// стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать,
// исходя из минимальной стоимости?

import homework.auto.model.Auto;

public class AutoAppl
{
    public static final double D = 1.6;
    public static final double B = 1.8;
    public static final double kilometers = 3000;

    public static Auto[] autos = new Auto[5];

    public static void main(String[] args)
    {
        autos[0] = new Auto ("Audi", "d", D, 6.6, 45.0);
        autos[1] = new Auto("BMW", "b", B, 6.8, 49.0);
        autos[2] = new Auto("Opel", "d", D, 6.9, 45.0);
        autos[3] = new Auto("VW", "d", D, 6.5, 39.0);
        autos[4] = new Auto("Mercedes", "b", B, 6.3, 49.0);

        Auto optimalAuto = Auto.isOptimalAuto(autos, kilometers);

        Auto.display(optimalAuto);
    }
}
