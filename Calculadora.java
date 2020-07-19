public class Calculadora
{
    public static void main(String[] args)
    {
        int valorA = 10;
        int valorB = 20;
        Calculadora calc = new Calculadora();
        
        int resultadoSuma = calc.suma(valorA, valorB);
        int resultadoResta = calc.resta(valorA, valorB);
        
        System.out.println("A + B = " + resultadoSuma);
        System.out.println("A - B = " + resultadoResta);
    }
    
    int suma(int a, int b)
    {
        int resultado = a + b;
        return resultado;
    }
    
    int resta(int a, int b)
    {
        int resultado = a - b;
        return resultado;
    }

}