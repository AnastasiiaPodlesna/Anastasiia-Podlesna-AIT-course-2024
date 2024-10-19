package computerShop.dao;

import computerShop.model.Computer;

public interface Shop
{
    boolean addDevice (Computer device);

    Computer findDevice (long stockNumber);

    boolean updateDevice (long stockNumber, Computer updatedDevice);

    boolean removeDevice (long stockNumber);

    Computer[] findBlackFridayDevices (Computer[] devises);

    int blackFridayDeviceCounter(Computer[] devices);


}
