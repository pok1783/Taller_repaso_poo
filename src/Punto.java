public class Punto {
    private int x, y;
    Punto(){
        this(0,0);
    }
    Punto(int xy){
        this(xy ,xy); //llama otro constructor
    }
    Punto(int x,int y){
        this.setX(x);
        this.setY(y);
    }
   
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double modulo(){
       return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }
    public void ToString(){
        System.out.println("x="+this.getX()+" y="+this.getY());
    }
}
