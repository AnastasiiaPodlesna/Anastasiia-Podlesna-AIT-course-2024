package pets.dao;

import pets.model.Pet;

public interface PetHotel
{
    void addPet(Pet pet);  // добавляем животное
    double calculateRevenue(); // считаем выручку
    Pet[] findPetsByBreed(String breed); // ищем животное по породе
    Pet[] catsByBreed(); // массив кошек
    Pet[] dogsByBreed(); // массив собак

}
