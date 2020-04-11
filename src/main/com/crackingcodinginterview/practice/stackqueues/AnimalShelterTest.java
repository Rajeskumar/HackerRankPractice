package main.com.crackingcodinginterview.practice.stackqueues;

public class AnimalShelterTest {

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueueAnimals("Dog");
        animalShelter.enqueueAnimals("Cat");
        animalShelter.enqueueAnimals("Dog");
        animalShelter.enqueueAnimals("Cat");
        animalShelter.enqueueAnimals("Cat");
        animalShelter.enqueueAnimals("Dog");
        animalShelter.enqueueAnimals("Dog");
        animalShelter.enqueueAnimals("Cat");

        animalShelter.printQueue();
        System.out.println("Adopt Any:"+animalShelter.dequeueAny());
        animalShelter.printQueue();
        System.out.println("Adopt Dog "+animalShelter.dequeueDog());
        animalShelter.printQueue();
        System.out.println("Adopt Dog "+animalShelter.dequeueDog());
        animalShelter.printQueue();
        System.out.println("Adopt Cat "+animalShelter.dequeueCat());
        animalShelter.printQueue();

    }
}
