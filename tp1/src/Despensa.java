public class Despensa {
    private Ingrediente[] ingredientes;
    private int contador;

    public Despensa() {
        this.ingredientes = new Ingrediente[10]; // Tamaño de la despensa
        this.contador = 0;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        if (contador < ingredientes.length) {
            boolean ingredienteEncontrado = false;

            // Buscar el ingrediente en la despensa
            for (int i = 0; i < contador; i++) {
                if (ingredientes[i].getNombre().equals(ingrediente.getNombre())) {
                    // Si el ingrediente ya está en la despensa, actualizar la cantidad
                    ingredientes[i].setCantidad(ingredientes[i].getCantidad() + ingrediente.getCantidad());
                    ingredienteEncontrado = true;
                    break;
                }
            }

            // Si el ingrediente no se encuentra en la despensa, agregarlo
            if (!ingredienteEncontrado) {
                // Agregar el ingrediente a la despensa
                ingredientes[contador] = ingrediente;
                contador++;
            }
        } else {
            System.out.println("Despensa llena, no se puede agregar más ingredientes.");
        }
    }


    public void getIngrediente(String nombreIngrediente, int cantidad) {
        for (int i = 0; i < contador; i++) {
            if (ingredientes[i].getNombre().equals(nombreIngrediente)) {
                Ingrediente ingredienteEnDespensa = ingredientes[i];
                if (ingredienteEnDespensa.getCantidad() >= cantidad) {
                    // Reducir la cantidad del ingrediente en la despensa
                    ingredienteEnDespensa.sacar(cantidad);
                    return; // No es necesario devolver nada, simplemente salimos del método
                } else {
                    System.out.println("No hay suficiente cantidad de " + nombreIngrediente + " en la despensa.");
                    return; // Salir del método si no hay suficiente cantidad
                }
            }
        }
        System.out.println("El ingrediente " + nombreIngrediente + " no está presente en la despensa.");
    }
    public void mostrarDespensa() {
        System.out.println("Contenido de la despensa:");
        for (int i = 0; i < contador; i++) {
            Ingrediente ingrediente = ingredientes[i];
            System.out.println("Nombre: " + ingrediente.getNombre() + ", Cantidad: " + ingrediente.getCantidad());
        }
    }
}
