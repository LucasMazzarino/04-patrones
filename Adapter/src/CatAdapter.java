public class CatAdapter implements IAnimal {
    private Cat cat;

    public CatAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void makeSound() {
        System.out.println("Adaptando la solicitud para Cat...");
        cat.meow();
    }
}