package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    private static int numTV; 

    public TV(Marca marca, boolean estado){
        this.marca=marca; 
        this.estado=estado;
    }
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public Marca getMarca(){
        return this.marca;
    }
    public void setCanal(int canal){
        this.canal=canal;    
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
        this.volumen = volumen;
    }
    public Control getControl() {
        return control;
    }
    public void setControl(Control control) {
        this.control = control;
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
        if (this.estado=true){
        if (this.canal<120){
            this.canal++;
        }} return;
    }
    public void canalDown(){
        if (this.estado=true){
        if(this.canal>1){ 
        this.canal--;
    }} return;
    }
    public void volumenUp(){
        if (this.estado=true){
        if (this.volumen<7){
        this.volumen++;
        }} return;
    }
    public void volumenDown(){
        if (this.estado=true){
       if(this.volumen>1){
        this.volumen--;
       }} return;
}
}