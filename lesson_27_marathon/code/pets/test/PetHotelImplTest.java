package pets.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pets.dao.PetHotelImpl;
import pets.data.TestData;
import pets.model.Pet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PetHotelImplTest
{
    PetHotelImpl petHotel;

    @BeforeEach
    void setUp()
    {
        petHotel = new PetHotelImpl(TestData.getTestPets().length);
        Pet[] testPets = TestData.getTestPets();
        for (Pet pet : testPets)
        {
            petHotel.addPet(pet);
        }
    }

    @Test
    void testCalculateRevenue()
    {
        double expectedRevenue = 990; //  ожидаемая выручка
        double actualRevenue = petHotel.calculateRevenue();
        assertEquals(expectedRevenue, actualRevenue, "Revenue should match expected value");
    }

    @Test
    void testFindPetsByBreed()
    {
        Pet[] maineCoons = petHotel.findPetsByBreed("Maine Coon");
        assertEquals(1, maineCoons.length, "Should find one Maine Coon cat");
        assertEquals("Murka", maineCoons[0].getName(), "The cat's name should be Murka");

        Pet[] jackRussells = petHotel.findPetsByBreed("Jack Russell");
        assertEquals(1, jackRussells.length, "Should find one Jack Russell dog");
        assertEquals("Maila", jackRussells[0].getName(), "The dog's name should be Maila");
    }

    @Test
    void testFindPetsByNonExistentBreed()
    {
        Pet[] nonExistentBreed = petHotel.findPetsByBreed("NonExistentBreed");
        assertArrayEquals(null, nonExistentBreed);

    }
}