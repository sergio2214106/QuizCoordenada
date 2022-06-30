public class Coordenadas
{
    private double x;
    private double y;

    public Coordenadas()
    {
    }

    public Coordenadas(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String imprimirCoordenada()
    {
        return "Coordenada: ( "+ x + " , " + y + " )" ;
    }

    public String CompararCoordenada(Coordenadas p2)
    {
        String cadena;

        if(this.x==p2.getX())
        {
            if(this.y==p2.getY())
            {  
            cadena="\nLas coordenadas son iguales";
            }
            else
            {
                cadena="\nLas coordenadas NO son iguales";
            }
        }
        else
        {
            cadena="\nLas coordenadas NO son iguales";
        }
        //if(x.equals())
        return cadena;
    }

    public String HallarDistancia(Coordenadas p2)
    {
        double d;
        d= Math.sqrt(Math.pow((p2.getX()-this.x), 2) + Math.pow((p2.getY()-this.y), 2));
        

        return "valor de la distancia: " + d;
    }
    



}