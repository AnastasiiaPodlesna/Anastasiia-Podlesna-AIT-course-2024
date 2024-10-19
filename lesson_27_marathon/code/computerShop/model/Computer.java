package computerShop.model;

public class Computer
{
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private double price;
    private long stockNumber;

    public Computer(String cpu, int ram, int ssd, String brand, double price, long stockNumber)
    {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
        this.stockNumber = stockNumber;
    }

    public String getCpu()
    {
        return cpu;
    }

    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    public int getRam()
    {
        return ram;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }

    public int getSsd()
    {
        return ssd;
    }

    public void setSsd(int ssd)
    {
        this.ssd = ssd;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public long getStockNumber() {return stockNumber;}

    public void setStockNumber(long stockNumber) {this.stockNumber = stockNumber;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("computerShop.model.Computer{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", stockNumber=").append(stockNumber);
        sb.append('}');
        return sb.toString();
    }
}
