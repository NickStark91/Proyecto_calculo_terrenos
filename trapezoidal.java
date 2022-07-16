public class trapezoidal extends terreno
{
    //----------------------  mis variables de clase o atributos ----------------------//

    private double largoMenor;
    private double largoMayor;
    private double ancho;
    
    // -------------------------   METODOS SET ---------------------------//
    void setLargoMayor(double largoMayor) 
    {
        this.largoMayor = largoMayor;
    }

    void setLargoMenor(double largoMenor) 
    {
        this.largoMenor = largoMenor;
    }

    void setAncho(double ancho) 
    {
        this.ancho = ancho;
    }

    // ------------------------   mis metodos get -----------------------------//

    double getLargoMayor() 
    {
        return largoMayor;
    }
    
    double getLargoMenor() 
    {
        return largoMenor;
    }

    double getAncho() 
    {
        return ancho;
    }

    // ------------ mis metodos con calculos ----------------//

    double calcularArea()
    {  
        this.area = (this.largoMayor + this.largoMenor) * this.ancho/2;
        return this.area;
    }

    //------------------- metodo constructor ---------------------//

    trapezoidal(double largoMayor, double largoMenor, double ancho, int estrato)
    {
        this.largoMayor = largoMayor;
        this.largoMenor = largoMenor;
        this.ancho = ancho;
        this.estrato = estrato;
        this.area = 0;
        this.valorTotal = 0;
    }
}
