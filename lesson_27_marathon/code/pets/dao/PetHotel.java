package pets.dao;

import pets.model.Pet;

public interface PetHotel
{
    Boolean addPet(Pet pet);  // добавляем животное
    Boolean removePet(int id);  // удаляем животное
    Pet findPet(int id); // поиск животного по id
    int CountPets();

    void printPets();

    double calculateRevenue(); // считаем выручку

    Pet[] findPetsByBreed(String breed); // ищем животное по gороде

    String[] catsByBreed(); // массив пород кошек -> string
    String[] dogsByBreed(); // массив собак собак  -> string

}
