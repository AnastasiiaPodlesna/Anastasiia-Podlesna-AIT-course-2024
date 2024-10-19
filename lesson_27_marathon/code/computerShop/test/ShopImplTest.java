package computerShop.test;

import computerShop.dao.Shop;
import computerShop.dao.ShopImpl;
import computerShop.model.Computer;
import computerShop.model.Laptop;
import computerShop.model.SmartPhone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopImplTest
{
    Computer[] devices;
    Shop shop;

    @BeforeEach
    void setUp()
    {
        devices = new Computer[6];
        shop = new ShopImpl(7);

        devices[0] = new Computer("AMD", 128, 512, "Samsung", 1500, 10200L);
        devices[1] = new Computer("AMD", 256, 512, "HP", 1800, 10201L);
        devices[2] = new Laptop("i9", 128, 256, "Samsung", 1300, 10202L, "red");
        devices[3] = new Laptop("i7", 128, 512, "Lenovo", 1000, 10203L, "white");
        devices[4] = new SmartPhone("A14 Bionic", 256, 512, "Apple", 1400, 10204L, 1234567891234L);
        devices[5] = new SmartPhone("Snapdragon 888", 128, 512, "Samsung", 1100, 10205L, 1234567771234L);

        for (int i = 0; i < devices.length; i++)
        {
            shop.addDevice(devices[i]);
        }

    }

    @Test
    void addDevice()
    {
        assertFalse(shop.addDevice(null));       // не добавлять пустое
        assertFalse(shop.addDevice(devices[2]));  // не добавлять дубликат
        // добавляем еще
        Computer newDevice = new Computer("AMD", 64, 256, "Samsung", 900, 10206L);
        assertTrue(shop.addDevice(newDevice)); // +
        // добавляем еще документ, сверх возможности capacity
        Computer oneMoreDevice = new Computer("i9", 256, 512, "DELL", 1000, 10207L);
        assertFalse(shop.addDevice(oneMoreDevice)); // -, нет места
    }

    @Test
    void findDevice()
    {
        Computer foundDevice = shop.findDevice(10201L);
        assertEquals(devices[1], foundDevice);  // found
        assertNull(shop.findDevice(1234567L)); // null
    }

    @Test
    void updateDevice()
    {
       Computer newDevice = new Computer("i9", 256, 512, "DELL", 1000, 10207L);
        assertTrue(shop.updateDevice(10201L, newDevice)); // нашли и заменили
        assertFalse(shop.updateDevice(1100007L, newDevice));// не нашли, не заменили
    }

    @Test
    void removeDevice()
    {
        // удаление существующего
        assertTrue(shop.removeDevice(10203L));
        // удаление несуществующего документа
        assertFalse(shop.removeDevice(1100009L));
    }

    @Test
    void findBlackFridayDevices()
    {
        Computer[] bfDevices = {devices[0], devices[2], devices[5]};
        assertArrayEquals(bfDevices, shop.findBlackFridayDevices(devices));
        assertEquals(3, shop.blackFridayDeviceCounter(devices));
        assertNotEquals(0, shop.blackFridayDeviceCounter(devices));
    }
}