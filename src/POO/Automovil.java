package POO;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private static int ultimoid;

    private TipoAutomovil tipo;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

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
                "\nauto.tipo = " + this.getTipo() +
                "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + Automovil.colorPatente.getColor() +
                "\nauto.cilindrada = " + this.motor.getCilindrada();

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
        return km/(this.estanque.getCapacidad() * porcentajeBencina);
    }

    //Sobrecarga de metodo
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.estanque.getCapacidad() * (porcentajeBencina/100f));
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
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
