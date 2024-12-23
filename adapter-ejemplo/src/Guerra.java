import java.util.ArrayList;
import java.util.List;

public class Guerra {
    private List<IEjercito> ejercitos = new ArrayList<>();

    public void agregarEjercito(IEjercito ejercito) {
        ejercitos.add(ejercito);
    }

    public void atacarTodos() {
        int totalDanio = 0;
        for (IEjercito ejercito : ejercitos) {
            int danio = ejercito.atacar();
            System.out.println("Daño infligido: " + danio);
            totalDanio += danio;
        }
        System.out.println("Daño total causado: " + totalDanio);
    }
}