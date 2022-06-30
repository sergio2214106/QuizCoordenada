public class test 
{
    
public static void main(String[] args) 
{
    Coordenadas c1= new Coordenadas();
    Coordenadas c2= new Coordenadas(1.3 , 5.3);
    Coordenadas c3= c1;
    Coordenadas c4= c2;

    System.out.println(c1.imprimirCoordenada());
    System.out.println(c2.imprimirCoordenada());
    System.out.println(c3.imprimirCoordenada());
    System.out.println(c4.imprimirCoordenada());
    System.out.println(c2.CompararCoordenada(c3));
    System.out.println(c1.HallarDistancia(c2));


}

}
