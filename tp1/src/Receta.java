public class Receta {
    protected int tiempoCoccion;
    protected Ingrediente[] ingredientes;
    protected String preparacion;

    public Receta(int tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tiempo de Cocción: ").append(tiempoCoccion).append(" minutos\n");
        sb.append("Ingredientes:\n");
        for (Ingrediente ingrediente : ingredientes) {
            sb.append("- ").append(ingrediente.getNombre()).append(": ").append(ingrediente.getCantidad()).append("\n");
        }
        sb.append("Preparación: ").append(preparacion);
        return sb.toString();
    }
}



