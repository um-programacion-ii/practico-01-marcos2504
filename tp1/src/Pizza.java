public class Pizza extends Receta {
    public Pizza() {
        super(50, new Ingrediente[]{new Ingrediente("Harina", 1000), new Ingrediente("Agua", 500),new Ingrediente("Aceite", 10), new Ingrediente("Levadura", 10),new Ingrediente("Sal", 5), new Ingrediente("Queso", 150)}, "1-) Mezclar los igredientes" +
                "2-) Amasar y dejar leudar" +
                "3-) Poner en el horno con el queso y la salsa y cocinar por 15 minutos");
    }
}
