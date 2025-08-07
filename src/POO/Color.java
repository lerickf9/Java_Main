package POO;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja"),
    BLANCO("Blanco");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
