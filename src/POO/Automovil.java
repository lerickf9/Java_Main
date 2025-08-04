package POO;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;
    int capacidadEstanque = 40;

    public String verDetalle(){
        return  "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;

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

}
