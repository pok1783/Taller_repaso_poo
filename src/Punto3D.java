public class Punto3D extends PuntoTiempo{
    private int z;
    Punto3D(int x,int y, int z, int t){
        super(x,y,t);
        this.setZ(z);
    }
    public int getZ(){
        return this.z;
    }
    public void setZ(int z){
        this.z=z;
    }
    @Override
    public double modulo(){
       return Math.sqrt((super.getX()*super.getX())+(super.getY()*super.getY())+(this.getZ()*this.getZ()));
    }
    @Override 
    public void ToString(){
        System.out.println("x="+super.getX()+" y="+super.getY()+" Z="+this.getZ()+" T="+super.getT());
    }
}
