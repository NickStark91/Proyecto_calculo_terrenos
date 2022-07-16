public class triangular extends terreno
{
    //mis variables de clase o atributos
    private double ladoA;
    private double ladoB;
    private double ladoC;
    

    // mis metodos set y get

    void setLadoA(double ladoA) 
    {
        this.ladoA = ladoA;
    }

    void setLadoB(double ladoB) 
    {
        this.ladoB = ladoB;
    }

    void setLadoC(double ladoC) 
    {
        this.ladoC = ladoC;
    }

    double getLadoA() 
    {
        return ladoA;
    }

    double getLadoB() 
    {
        return ladoB;
    }

    double getLadoC() 
    {
        return ladoC;
    }

    // mi constructor

    triangular(double ladoA, double ladoB, double ladoC, int estrato)
    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.estrato = estrato;
    }

    double calcularArea()
    {
        double semiperimetro = (this.ladoA + this.ladoB + this.ladoC)/2;
        this.area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        return area;
    }
}
