
public class rectangulo extends terreno
{
    //mis variables de clase o atributos
    private double largo;
    private double ancho;
    
    // metodos getter y setter

    double getLargo()
    {
        return this.largo;
    }

    double getAncho() 
    {
        return this.ancho;
    }
    
    void setLargo(double largo) 
    {
        this.largo = largo;
    }

    void setAncho(double ancho) 
    {
        this.ancho = ancho;
    }

    
    // mis metodos con calculos
    double calcularArea()
    {  
        this.area = this.largo * this.ancho;
        return this.area;
    }

    // metodo constructor
    rectangulo(double largo, double ancho, Integer estrato)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.estrato = estrato;
        this.area = 0;
        this.valorTotal = 0;
    }

    rectangulo()
    {
        this.largo = 0;
        this.ancho = 0;
        this.estrato = 1;
        this.area = 0;
        this.valorTotal = 0;
    }
}