import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Arranque
{
    public static void main(String[] args) 
    {
        DecimalFormat formato = new DecimalFormat("#,###.##");
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Elija el tipo de terreno \n1. Rectangular\n2. Trapezoidal\n3. Triangular\n0. salir"));
            double ancho;
            int estrato;
            terreno forma;
        
            switch (opcion) 
            {
                case 1:
                    double largo = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo de su terreno a calcular: "));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el ancho de su terreno a calcular: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el estrato de su terreno a calcular: "));

                    forma = new rectangulo(largo, ancho, estrato);
                    
                    JOptionPane.showMessageDialog(null, "El area total del terreno rectangular es: "+((rectangulo) forma).calcularArea()+"\nEl valor total del terreno es: $"+formato.format(forma.calcularValorTotal()));
                    
                    break;

                case 2:
                    double largoMayor = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo Mayor de su terreno: "));
                    double largoMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo Menor de su terreno: "));
                    ancho = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo Mayor de su terreno: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el estrato de su terreno a calcular: "));

                    forma  = new trapezoidal(largoMayor, largoMenor, ancho, estrato);
                    JOptionPane.showMessageDialog(null, "El area total del terreno trapezoidal es: "+((rectangulo) forma).calcularArea()+"\nEl valor total del terreno trapezoidal es: $"+formato.format(forma.calcularValorTotal()));

                    break;

                case 3:
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo del lado A de su terreno: "));
                    double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo del lado B de su terreno: "));
                    double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo del lado C de su terreno: "));
                    estrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el estrato de su terreno a calcular: "));

                    forma = new triangular(ladoA, ladoB, ladoC, estrato);
                    JOptionPane.showMessageDialog(null, "El area total del terreno trapezoidal es: "+((rectangulo) forma).calcularArea()+"\nEl valor total del terreno trapezoidal es: $"+formato.format(forma.calcularValorTotal()));

                    break;
                case 0:

                    JOptionPane.showMessageDialog(null, "Gracias");
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "La opcion indicada no es correcta");
                    break;
            }
        }
        while(opcion != 0);
    }
}


/*if (opcion == 1)
        {
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo de su terreno a calcular: "));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el ancho de su terreno a calcular: "));
            int estrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el estrato de su terreno a calcular: "));

            rectangulo rectangulo = new rectangulo(largo, ancho, estrato);
            rectangulo.calcularArea();
            rectangulo.calcularValorTotal();

            JOptionPane.showMessageDialog(null, "El area total del terreno rectangular es: "+rectangulo.calcularArea()+"\nEl valor total del terreno es: $"+formato.format(rectangulo.calcularValorTotal()));
        }
        else if (opcion == 2)
        {
            double largoMayor = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo Mayor de su terreno: "));
            double largoMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo Menor de su terreno: "));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo Mayor de su terreno: "));
            Integer estrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el estrato de su terreno a calcular: "));

            trapezoidal trapesoidal = new trapezoidal(largoMayor, largoMenor, ancho, estrato);
            JOptionPane.showMessageDialog(null, "El area total del terreno trapezoidal es: "+trapesoidal.calcularArea()+"\nEl valor total del terreno trapezoidal es: $"+formato.format(trapesoidal.calcularValorTotal()));
        }
        else
        {
            double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo del lado A de su terreno: "));
            double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo del lado B de su terreno: "));
            double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el largo del lado C de su terreno: "));
            Integer estrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el estrato de su terreno a calcular: "));

            triangular triangular = new triangular(ladoA, ladoB, ladoC, estrato);
            JOptionPane.showMessageDialog(null, "El area total del terreno trapezoidal es: "+triangular.calcularArea()+"\nEl valor total del terreno trapezoidal es: $"+formato.format(triangular.calcularValorTotal()));
            */