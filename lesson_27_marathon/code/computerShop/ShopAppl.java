package computerShop;

import computerShop.dao.Shop;
import computerShop.dao.ShopImpl;
import computerShop.model.Computer;
import computerShop.model.Laptop;
import computerShop.model.SmartPhone;

public class ShopAppl
{
    public static void main(String[] args)
    {
        Computer[] devices = new Computer[6];
        Shop shop = new ShopImpl(7);

        devices[0] = new Computer("AMD", 128, 512, "Samsung", 1500, 10200L, 0.10);
        devices[1] = new Computer("AMD", 256, 512, "HP", 1800, 10201L, 0.0);
        devices[2] = new Laptop("i9", 128, 256, "Samsung", 1300, 10202L, 0.15,"red");
        devices[3] = new Laptop("i7", 128, 512, "Lenovo", 1000, 10203L, 0.0,"white");
        devices[4] = new SmartPhone("A14 Bionic", 256, 512, "Apple", 1400, 10204L, 0.2,1234567891234L);
        devices[5] = new SmartPhone("Snapdragon 888", 128, 512, "Samsung", 1100, 10205L, 0.0,1234567771234L);

        for (int i = 0; i < devices.length; i++)
        {
            shop.addDevice(devices[i]);
        }

        // поиск по StockNumber
        Computer foundDevice = shop.findDevice(10201L);
        System.out.println("Found device with stock number: " + foundDevice.getStockNumber() + " => ");
        if (foundDevice != null)
        {
            System.out.println(foundDevice.toString());
            System.out.println("\nAttempt: device found ...");
        }
        else System.out.println("\nAttempt: device not found");
        System.out.println("---------------------------------------------------------------");

        // редактируем
        Computer uppdatedDevice = new Computer("i9", 256, 512, "DELL", 1000, 10207L, 0.1);
        System.out.println("Editable device: "); // редактируемый документ
        System.out.println(devices[2].toString());
        boolean isUpdated = shop.updateDevice(devices[2].getStockNumber(), uppdatedDevice);
        if (isUpdated)
        {
            System.out.println("\nUpdated device: " + uppdatedDevice.getStockNumber() + " => ");
            System.out.println(uppdatedDevice.toString());
        }
        else System.out.println("\nEditable device not found...");
        System.out.println("\n---------------------------------------------------------------");

        // удаляем устройство
        boolean deleteDevice = shop.removeDevice(devices[3].getStockNumber());
        if (deleteDevice == true)
        {
            System.out.println("Device with stock number: " + devices[3].getStockNumber() + " => ");
            System.out.println(devices[3].toString());
            System.out.println("\n => DELETED...");
        }
        else System.out.println("Deleted device not found...\"");
        System.out.println("---------------------------------------------------------------");

        // добавляем еще одно устройство (в магазине есть место)
        devices[3] = new Computer("AMD", 64, 256, "Samsung", 900, 10206L, 0.0);
        System.out.println("Added device: ");
        System.out.println(devices[3].toString());
        System.out.println("\nAttempt to add device: " + shop.addDevice(devices[3]));
        System.out.println("---------------------------------------------------------------");


        // печать устройств со скидкой на BlackFriday
        System.out.println("Black Friday discounted devices: ");
        for (int i = 0; i < shop.blackFridayDeviceCounter(devices) ; i++)
        {
            System.out.println(shop.findBlackFridayDevices(devices)[i].toString());
        }
        System.out.println("Found items: " + shop.blackFridayDeviceCounter(devices));
        System.out.println("-----------------------------------------------------------------");

    }
}
