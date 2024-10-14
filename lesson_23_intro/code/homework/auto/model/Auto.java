package homework.auto.model;

public class Auto
{
    private String carBrand;  // марка автомобиля (Audi, BMW,....)
    private String fuelType;  // тип топлива (d/b)
    private Double fuelPricePerLiter; // стоимость 1л (евро)
    private Double fuelConsumption; // расход на 100 км (л)
    private Double weeklyAutoRentalPrice; // стоимость недельной аренды автомобиля (евро)

    public Auto(String carBrand,
            String fuelType,
            Double fuelPricePerLiter,
            Double fuelConsumption,
            Double weeklyAutoRentalPrice)
    {
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.fuelPricePerLiter = fuelPricePerLiter;
        this.fuelConsumption = fuelConsumption;
        this.weeklyAutoRentalPrice = weeklyAutoRentalPrice;
    }

    public String getCarBrand()
    {
        return carBrand;
    }

    public void setCarBrand(String carBrand)
    {
        this.carBrand = carBrand;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public Double getFuelPricePerLiter()
    {
        return fuelPricePerLiter;
    }

    public void setFuelPricePerLiter(Double fuelPricePerLiter)
    {
        this.fuelPricePerLiter = fuelPricePerLiter;
    }

    public Double getFuelConsumption()
    {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
    }

    public Double getWeeklyAutoRentalPrice() {
        return weeklyAutoRentalPrice;
    }

    public void setWeeklyAutoRentalPrice(Double weeklyAutoRentalPrice)
    {
        this.weeklyAutoRentalPrice = weeklyAutoRentalPrice;
    }

    // ---------------------------------------------------------------------------

    // поиск оптимального автомобиля
    public static Auto isOptimalAuto (Auto[] auto, double kilometers)
    {
        Auto optimalAuto = auto[0];
        Double minCost = calculateTotalAutoCost(optimalAuto.fuelConsumption, optimalAuto.fuelPricePerLiter, optimalAuto.weeklyAutoRentalPrice, kilometers);

        for (int i = 0; i < auto.length; i++)
        {
            Double cost = calculateTotalAutoCost(auto[i].fuelConsumption, auto[i].fuelPricePerLiter, auto[i].weeklyAutoRentalPrice, kilometers);
            if (cost < minCost)
            {
                optimalAuto = auto[i];
            }
        }
        return optimalAuto;
    }

    // расчет затрат на автомобиль
    public static double calculateTotalAutoCost(double fuelConsumption, double fuelPricePerLiter, double weeklyAutoRentalPrice, double kilometers)
    {
        return (kilometers / 100 ) * fuelConsumption * fuelPricePerLiter + weeklyAutoRentalPrice;
    }


    public static void display (Auto auto)
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Optimal car is: \nbrand: %s / fuel type: %s / fuel price (per 1l): %.2f / consumption (per 100km): %.2f / rental price (per week): %.2f ", auto.carBrand, auto.fuelType, auto.fuelPricePerLiter, auto.fuelConsumption, auto.weeklyAutoRentalPrice);
        System.out.println("\n---------------------------------------------------------------------");
    }
}
