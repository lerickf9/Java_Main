package POO;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    //Sobrecarga de metodo para instanciar una clase Automovil sin parametros en la clase main
    public Automovil() {
    }

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalle(){
        return  "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
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

    public String leerColor(){
        return color;
    }
    public void asignarColor(String color){
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

    //Sobreescritura del metodo padre
    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.leerFabricante()) && this.modelo.equals(a.leerModelo()));
    }
}
