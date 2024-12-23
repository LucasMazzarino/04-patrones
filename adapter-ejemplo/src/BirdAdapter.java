public class BirdAdapter implements IAnimal {
    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void makeSound() {
        System.out.println("Adaptando la solicitud para Bird...");
        bird.tweet();
    }

    public void move() {
        System.out.println("Adaptando la solicitud de movimiento para Bird...");
        bird.fly();
    }
}