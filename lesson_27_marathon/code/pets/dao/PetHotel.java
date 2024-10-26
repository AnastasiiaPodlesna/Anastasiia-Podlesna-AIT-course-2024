package pets.dao;

import pets.model.Pet;

public interface PetHotel
{
    void addPet(Pet pet);  // добавляем животное
    double calculateRevenue(); // считаем выручку

    Pet[] findPetsByBreed(String breed); // ищем животное по породе

    String[] catsByBreed(); // массив кошек
    String[] dogsByBreed(); // массив собак

}
