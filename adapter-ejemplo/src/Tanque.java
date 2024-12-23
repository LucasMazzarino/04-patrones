public class Tanque implements IEjercito {
    @Override
    public int atacar() {
        System.out.println("Tanque dispara su cañón!");
        return 50;
    }
}
