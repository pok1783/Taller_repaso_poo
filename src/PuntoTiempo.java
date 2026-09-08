public class PuntoTiempo extends Punto{
    private int t;
    PuntoTiempo(int x,int y, int t){
        super(x,y);
        this.setT(t);
    }
    PuntoTiempo(){
        this(0,0,0);
    }
    public int getT(){
        return this.t;
    }
    public void setT(int t){
        this.t = t;
    }
    public double velocidad(){
        return this.modulo()/this.t;
    }
    @Override
    public void ToString(){
        System.out.println("x="+super.getX()+" y="+super.getY()+" T="+this.getT());
    }

}