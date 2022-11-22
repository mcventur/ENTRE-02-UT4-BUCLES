
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        int fila = 0; //Vamos a ir contando las filas que escribimos
        for(int i=altura; i>0; i--){//Empezamos con i=altura y vamos decrementando
            fila++;
            escribirCaracter(ESPACIO,(i-1)*2);
            for(int j=0; j<fila; j++){
                if(j % 2 == 0){
                    escribirCaracter(CAR1,ANCHO_BLOQUE);
                }
                else{
                    escribirCaracter(CAR2,ANCHO_BLOQUE);
                }
            }
            escribirCaracter(ESPACIO,(i-1)*2);
            System.out.println();
        }
    }

    /**
     * Método privado de ayuda que escribe n veces un caracter en la misma línea, sin saltos de línea
     */
    private  void escribirCaracter(char caracter, int n) {
         for(int i=0; i<n; i++){
             System.out.print(caracter);
         }
    }
}
