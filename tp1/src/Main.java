public class Main {
    public static void main(String[] args) {
        // Crear ingredientes
        Ingrediente huevo = new Ingrediente("Huevo", 10);
        Ingrediente agua = new Ingrediente("Agua", 1000);


        System.out.println(huevo);
        System.out.println(agua);
        Despensa despensa = new Despensa();

        // Agregar ingredientes a la despensa
        despensa.addIngrediente(huevo);
        despensa.addIngrediente(agua);
        despensa.addIngrediente(new Ingrediente("Harina", 750));

        // Mostrar el contenido de la despensa
        despensa.mostrarDespensa();
        despensa.getIngrediente( "Huevo" ,  10);
        despensa.mostrarDespensa();
        despensa.addIngrediente(new Ingrediente("Harina", 750));
        despensa.mostrarDespensa();
        



    }
}