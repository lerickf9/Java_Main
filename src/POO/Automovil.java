package POO;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;
    private static int ultimoid;

    private TipoAutomovil tipo;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    private static Color colorPatente = Color.NARANJO;

    //Sobrecarga de metodo para instanciar una clase Automovil sin parametros en la clase main
    public Automovil() {
        this.id = ++ultimoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle(){
        return  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
                "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + Automovil.colorPatente.getColor() +
                "\nauto.cilindrada = " + this.cilindrada;

    }

    public String leerFabricante(){
        return fabricante;
    }
    public void asignarFrabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String leerModelo(){
        return modelo;
    }
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public Color leerColor(){
        return color;
    }
    public void asignarColor(Color color){
        this.color = color;
    }

    public double leerCilindrada(){
        return cilindrada;
    }
    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int leerCapacidadEstanque(){
        return capacidadEstanque;
    }

    public void asignarMCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }

    public String acelerar (int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " franando";

    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadEstanque * porcentajeBencina);
    }

    //Sobrecarga de metodo
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadEstanque * (porcentajeBencina/100f));
    }

    //Sobreescritura del metodo padre. Este metodo funciona cuando estan creados los objetos. Sino produce un error
    //NullPointerException por eso hay que validar siempre.
    //Se valida con instaOf para ser exclusivo la comparacion con el mismo tipo de Objeto.
    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo !=null
                && this.fabricante.equals(a.leerFabricante())
                && this.modelo.equals(a.leerModelo()));
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.id + " "+ fabricante + " " + modelo + '\'' ;
    }
}
