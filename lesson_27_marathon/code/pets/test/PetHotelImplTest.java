package pets.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pets.dao.PetHotelImpl;
import pets.data.TestData;
import pets.model.Cat;
import pets.model.Dog;
import pets.model.Pet;

import static org.junit.jupiter.api.Assertions.*;


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
        double expectedRevenue = 180; //  ожидаемая выручка
        double actualRevenue = petHotel.calculateRevenue();
        assertEquals(expectedRevenue, actualRevenue, "Revenue should match expected value");
    }

    @Test
    void testAddPet()
    {
        petHotel.removePet(2); // сначала удалим, освобождая место
        Pet newPet = new Dog(7, "dog", 5, "Rex", "Mongrel", 50, 10);
        assertTrue(petHotel.addPet(newPet), "Should successfully add");

        Pet foundPet = petHotel.findPet(newPet.getId());
        assertEquals(newPet.getName(), foundPet.getName(), "New pet should be found");

        Pet duplicatePet = new Cat(1, "cat", 4, "Murka", "Maine Coon", 60, 15);
        assertFalse(petHotel.addPet(duplicatePet), "Should not add");
    }

    @Test
    void testRemovePet()
    {
        assertTrue(petHotel.removePet(2), "Should successfully remove");
        assertNull(petHotel.findPet(2), "Should be found");

        assertFalse(petHotel.removePet(999), "Should return false");
    }

    @Test
    void testCountPets()
    {
        int expCount = TestData.getTestPets().length;
        assertEquals(expCount, petHotel.CountPets());

        petHotel.removePet(1); // удаляем одного питомца
        assertEquals(expCount - 1, petHotel.CountPets());
    }

    @Test
    void testFindPetsByBreed()
    {
        Pet[] maineCoons = petHotel.findPetsByBreed("Maine Coon");
        assertEquals(2, maineCoons.length, "Should find one Maine Coon cat");
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