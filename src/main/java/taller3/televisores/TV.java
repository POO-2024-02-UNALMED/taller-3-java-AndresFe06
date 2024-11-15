package taller3.televisores;

public class TV {
    private Marca marca;
    int canal=1;
    private int precio=500;
    boolean estado;
    int volumen=1;
    Control control;
    private static int numTV; 

    public TV(Marca marca, boolean estado){
        this.marca=marca; 
        this.estado=estado;
        numTV++;
    }
    public void setCanal(int canal){
        if (this.estado==true){
            if (canal<=120 && canal>=1){
                this.canal=canal;
            }
        }
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public Marca getMarca(){
        return this.marca;
    }
 
    public int getCanal(){
        return this.canal;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        if (this.estado==true){
            if (volumen<=7 && volumen>=0){
                this.volumen=volumen;
            }
        }
    }
    public Control getControl() {
        return control;
    }
  
    public static void setNumTV(int numero){
        TV.numTV=numero;
    }
    public static int getNumTV(){
        return TV.numTV;
    }

    public void turnOn(){
        this.estado=true;
    }
    public void turnOff(){
        this.estado=false;
    }

    public boolean getEstado(){
        return this.estado;
    }
    public void canalUp(){
        if (this.estado==true){
        if (this.canal<120){
            this.canal++;
        }
    }
     return;
    }
    public void canalDown(){
        if (this.estado==true){
        if(this.canal>1){ 
        this.canal--;
    }
    }
    return;
    }
    public void volumenUp(){
        if (this.estado==true){
        if (this.volumen<7){
        this.volumen++;
        }
    }
     return;
    }
    public void volumenDown(){
        if (this.estado==true){
       if(this.volumen>0){
        this.volumen--;
       
    }
}
 return;
}
}