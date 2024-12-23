public class Main {
    public static void main(String[] args) {
        Guerra guerra = new Guerra();

        Soldado soldado = new Soldado();
        Tanque tanque = new Tanque();
        Caballo caballo = new Caballo();
        CaballoAdapter caballoAdapter = new CaballoAdapter(caballo);

        guerra.agregarEjercito(soldado);
        guerra.agregarEjercito(tanque);
        guerra.agregarEjercito(caballoAdapter);

        guerra.atacarTodos();
    }
}
