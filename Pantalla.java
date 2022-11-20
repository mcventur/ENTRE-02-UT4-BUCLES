import java.util.Scanner;
/**
 *  Clase con métodos estáticos para trabajar 
 *  la pantalla (terminal de texto)
 *  
 */
public class Pantalla
{
    private static Scanner teclado = new Scanner(System.in);

    /**
     *  Hacer una pausa  
     */
    public static void hacerPausa()
    {
        System.out.println("\n\n\tIntro para continuar");
        teclado.nextLine();

    }

    /**
     *  Borrar la pantalla
     */
    public static void borrarPantalla()
    {
        System.out.print('\u000C');

    }
}
