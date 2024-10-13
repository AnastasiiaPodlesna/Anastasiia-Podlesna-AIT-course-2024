package homework.adress;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest
{
    Address address;

    String street = "Kosmonavtov";
    String house_number = "1001-A";
    String town = "Donetsk";
    String index = "53001";
    String country = "Ukraine";

    @BeforeEach
    void setUp()
    {
        address = new Address(street, house_number, town, index, country);
    }

    @Test
    void testIsTownWithCapitalLetter()
    {
        assertTrue(address.isTownWithCapitalLetter(town), "Incorrect Input...");
    }

    @Test
    void testIsIndexContains5Digits()
    {
        assertTrue(address.isIndexContains5Digits(index), "Incorrect Input...");
    }

    @Test
    void testIsRightHouseNumber()
    {
        assertTrue(address.isRightHouseNumber(house_number), "Incorrect Input...");
    }

    @Test
    void testInvalidTown() {
        assertFalse(address.isTownWithCapitalLetter("donetsk"), "Town name must start with an uppercase letter...");
    }

    @Test
    void testInvalidIndex() {
        assertFalse(address.isIndexContains5Digits("123"), "Postal code must contain exactly 5 digits...");
    }

    @Test
    void testInvalidHouseNumber() {
        assertFalse(address.isRightHouseNumber("1001#"), "House number contains invalid characters.");
    }
}