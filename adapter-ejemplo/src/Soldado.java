public class Soldado implements IEjercito {
    @Override
    public int atacar() {
        System.out.println("Soldado ataca con su rifle!");
        return 10;
    }
}