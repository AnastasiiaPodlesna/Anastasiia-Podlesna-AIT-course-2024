package computerShop.dao;

import computerShop.model.Computer;

public class ShopImpl implements Shop {
    Computer device;
    Computer[] devices;
    int size;
    final String BLACK_FRIDAY_BRAND = "Samsung";

    public ShopImpl(int capacity) {
        devices = new Computer[capacity];
        size = 0;
    }

    @Override
    public boolean addDevice(Computer device) {
        if (device == null || size == devices.length || findDevice(device.getStockNumber()) != null) {
            return false; // если устройство пустышка или нет места в массиве для него или он уже есть в массиве, тогда не добавляем
        }
        devices[size] = device; // иначе добавляем в массив
        size++;
        return true; // добавили
    }

    @Override
    public Computer findDevice(long stockNumber) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getStockNumber() == stockNumber) {
                return devices[i]; // нашли
            }
        }
        return null;  // не нашли
    }

    @Override
    public boolean updateDevice(long stockNumber,
            Computer updatedDevice) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getStockNumber() == stockNumber) {
                devices[i] = updatedDevice; // обновляем
                return true; // получилось обновить
            }
        }
        return false; // не удалось обновить
    }

    @Override
    public boolean removeDevice(long stockNumber) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getStockNumber() == stockNumber) {
                Computer victim = devices[i];
                devices[i] = devices[size - 1]; // последн. ставим на место удаляемого
                devices[size - 1] = null; // затираем последний элемент массива
                size--;
                return true;
            }
        }
        return false; // не удалили
    }

    @Override
    public Computer[] findBlackFridayDevices(Computer[] devices)
    {
        int bfSize = blackFridayDeviceCounter(devices);
        Computer[] blackFridayDevices = new Computer[bfSize];

        if (bfSize == 0)
        {
            return null;
        }
        for (int i = 0, j = 0; i < size; i++)
        {
            if (devices[i].getBrand() == BLACK_FRIDAY_BRAND)
            {
                blackFridayDevices[j] = devices[i];
                j++;
            }
        }
        return blackFridayDevices;
    }

    @Override
    public int blackFridayDeviceCounter(Computer[] devices)
    {
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (devices[i].getBrand() == BLACK_FRIDAY_BRAND)
            {
                counter++;
            }
        }
        return counter;
    }

}
