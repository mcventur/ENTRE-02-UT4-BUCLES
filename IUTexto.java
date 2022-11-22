import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char respuesta;
        do{
            Pantalla.borrarPantalla();
            System.out.print("Teclee número1: ");
            int n1 = teclado.nextInt();
            System.out.print("Teclee número2: ");
            int n2 = teclado.nextInt();            
            if(Utilidades.estaEnOctal(n1) && Utilidades.estaEnOctal(n2) && Utilidades.contarCifras(n1)==Utilidades.contarCifras(n2)){
                System.out.println("--------------------------------------");
                System.out.printf("%30d\n",n1);
                System.out.printf("%30d\n",n2);
                System.out.printf("%20s%10d\n","Suma octal:",calculadora.sumarEnOctal(n1,n2));
            }
            else if(!Utilidades.estaEnOctal(n1) || !Utilidades.estaEnOctal(n2)){
                System.out.println("Alguno de los números no está en octal");    
            }
            else{
                System.out.println("No tienen el mismo número de cifras");    
            }
            teclado.nextLine();
            System.out.println("¿Quiere hacer otra suma en octal (S/s)?");
            respuesta = teclado.nextLine().charAt(0);
            
        }while(respuesta == 'S' || respuesta == 's');

    }

    /**
     *  Borra pantalla
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        int altura;
        Pantalla.borrarPantalla();
        System.out.println("Ahora dibujará una figura");
        System.out.println();
        
        do{
            System.out.print("Altura de la figura? (1-10): ");    
            altura = teclado.nextInt();
            if(altura < 1 || altura > 10){
                System.out.print("Error, ");
            }
            else{
                pintor.dibujarFigura(altura);
            }
        }while(altura<1 || altura > 10);
        
        
    }

}
