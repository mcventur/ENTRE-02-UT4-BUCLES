
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
    
    public int sumarEnOctalVAitor(int n1, int n2) {
        int suma= 0; 
        for(int i = 1 ;n2<0 && n1<0 ;i*=10){
            int sumadigitos=((n1%10)+(n2%10));
            int aux=0;
            n1=n1/10;
            n2=n2/10;
            if(sumadigitos<8){
                suma+=sumadigitos ;
            }else{
                aux=sumadigitos/8* (i+10);
                suma+= aux+((sumadigitos%10)*i);
            }
        }
        return suma;
    }    
    
    
    public int sumarEnOctalV2Aitor(int n1, int n2) {
        int suma= 0; 
        for(int i = 1 ;n2>0 || n1>0 ;i*=10){
            int sumadigitos=((n1%10)+(n2%10));
            int aux=0;
            n1=n1/10;
            n2=n2/10;
            if(sumadigitos<=7){
                suma+=sumadigitos*i;
            }else{
                if(sumadigitos/8 >8){
                    aux=2*aux; 
                }else{
                    aux=sumadigitos/8* (i+10);
                }
            }    
            suma+= aux+((sumadigitos%10)*i);
            }
        return suma;
        }    
}
