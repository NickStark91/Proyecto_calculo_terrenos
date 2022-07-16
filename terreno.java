public class terreno 
{
    protected int estrato;
    protected double area;
    protected double valorTotal;


    //------------------------------------- getters-------------------------------------//
    int getEstrato()
    {
        return this.estrato;
    }

    double getValorTotal()
    {
        return this.valorTotal;
    }

    double getArea() 
    {
        return area;
    }


    //-------------------------------------- setters----------------------------------//
    void setEstrato(int estrato) 
    {
        this.estrato = estrato;
    }

    void setValorTotal(double valorTotal) 
    {
        this.valorTotal = valorTotal;
    }


    //----------------------------------- metodos con calculos-----------------------------//
    double calcularValorTotal()
    {
        if (estrato == 1 || estrato == 2)
        {
            valorTotal = area * 2500000;
        }
        else if (estrato == 3 || estrato == 4) 
        {
            valorTotal = area * 3250000;
        }
        else
        {
            valorTotal = area * 4850000;
        }
        return valorTotal;
    }
    
}
