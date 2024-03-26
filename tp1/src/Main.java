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
        // Mostrar informacion de las recetas
        HuevoDuro huevoDuro = new HuevoDuro();
        Pan pan = new Pan();
        Pizza pizza = new Pizza();
        System.out.println("Detalles de la recetas:");
        System.out.println("Huevo Duro");
        System.out.println(huevoDuro.toString());
        System.out.println("Pizza:");
        System.out.println(pizza.toString());
        System.out.println("Pan:");
        System.out.println(pan.toString());



    }
}