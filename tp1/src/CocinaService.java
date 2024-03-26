
public class CocinaService {
    public static void prepararReceta(Chef chef, Receta receta, Despensa despensa) {
        int ingredientesFaltantes = 0; //

        for (Ingrediente ingrediente : receta.getIngredientes()) {
            Ingrediente ingredienteEnDespensa = despensa.getIngrediente(ingrediente.getNombre(), ingrediente.getCantidad());
            if (ingredienteEnDespensa == null) {
                ingredientesFaltantes++;
            }
        }

        if (ingredientesFaltantes > 0) {
            System.out.println("No se puede preparar la receta por falta de ingredientes");
            return;
        } else {
            System.out.println(chef.getNombre() + " está preparando la receta...");
            System.out.println("Preparación: " + receta.getPreparacion());

            System.out.println("Cantidad de ingredientes restantes en la despensa:");
            despensa.mostrarDespensa();
        }
    }
}
