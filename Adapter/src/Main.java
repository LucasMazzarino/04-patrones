public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        IAnimal dogAdapter = new DogAdapter(dog);
        dogAdapter.makeSound();

        Cat cat = new Cat();

        IAnimal catAdapter = new CatAdapter(cat);

        catAdapter.makeSound();
    }
}