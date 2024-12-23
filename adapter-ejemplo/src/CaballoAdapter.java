public class CaballoAdapter implements IEjercito {
    private Caballo caballo;

    public CaballoAdapter(Caballo caballo) {
        this.caballo = caballo;
    }

    @Override
    public int atacar() {
        System.out.println("Adaptando ataque del Caballo...");
        return caballo.patear() + caballo.morder();
    }
}

