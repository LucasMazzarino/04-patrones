public class DogAdapter implements IAnimal {
    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void makeSound() {
        System.out.println("Adaptando la solicitud para Dog...");
        dog.bark();
    }
}
