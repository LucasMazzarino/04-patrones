public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        DogAdapter dogAdapter = new DogAdapter(dog);
        dogAdapter.makeSound();
        dogAdapter.move();

        Cat cat = new Cat();
        CatAdapter catAdapter = new CatAdapter(cat);
        catAdapter.makeSound();
        catAdapter.move();

        Bird bird = new Bird();
        BirdAdapter birdAdapter = new BirdAdapter(bird);
        birdAdapter.makeSound();
        birdAdapter.move();
    }
}