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

        // Mostrar informacion de las recetas
        HuevoDuro huevoDuro = new HuevoDuro();
        Chef chef = new Chef("Donato", 3);
        CocinaService.prepararReceta(chef, huevoDuro, despensa);
        Pan pan = new Pan();
        CocinaService.prepararReceta(chef, pan, despensa);

    }
}