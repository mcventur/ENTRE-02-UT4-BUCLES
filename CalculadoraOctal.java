
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int suma = 0;
        int acarreo = 0;
        int posicionSuma = 0;
        while(n1 > 0 || acarreo > 0 ){
            //Extraemos un dígito de cada número
            int digito1 = n1 % 10;
            int digito2 = n2 % 10;
            
            //Los sumamos, teniendo en cuenta un posible resto de la suma anterior
            int sumaBase10 = digito1 + digito2 + acarreo;
            int digitoSuma = sumaBase10 % 8;
            acarreo = sumaBase10 / 8; //Se podría hacer con un if, que lo ponga a 1 o 0
            
            //Vamos construyendo nuestro resultado
            //Multiplicamos cada dígito obtenido por una potencia de 10 que se irá incrementando
            suma += digitoSuma * Math.pow(10,posicionSuma);
            //Incrementamos la potencia de 10 para la próxima operación
            posicionSuma++;
            //Eliminamos el dígito procesado de cada número 
            n1/=10;
            n2/=10;
        
        }
        
        return suma;

    }

}
