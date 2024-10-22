package computerShop.model;

public class SmartPhone extends Computer
{
    private long imei;

    public SmartPhone(String cpu,
            int ram,
            int ssd,
            String brand,
            double price,
            long stockNumber,
            double discount,
            long imei)
    {
        super(cpu, ram, ssd, brand, price, stockNumber, discount);
        this.imei = imei;
    }

    public long getImei()
    {
        return imei;
    }

    public void setImei(long imei)
    {
        this.imei = imei;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("computerShop.model.SmartPhone{");
        sb.append("imei=").append(imei);
        sb.append('}');
        return sb.toString() + super.toString();
    }
}
