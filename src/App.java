public class App {
    public static void main(String[] args) throws Exception {
        PuntoTiempo p1 = new PuntoTiempo(1,2,3);
        PuntoTiempo p2 = new PuntoTiempo();
        p1.ToString();
        p2.ToString();
        System.out.println("Velocidad= "+p1.velocidad());
        
    }
}
