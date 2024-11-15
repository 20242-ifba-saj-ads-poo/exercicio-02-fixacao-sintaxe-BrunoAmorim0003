public class Questao5 {
    public static void main(String[] args) { 

        long num = 1;
    
        for (int i = 1; i <= 40; i++) { 
            
        num *= i; 
        
        System.out.println("O fatorial de " + i + " é (" + (i-1) + "!) = " + num); 
    } 
  } 
}
/*Porque o int tem um valor fixo de até 2.147.483.647, já o tipo long vai até 9.223.372.036.854.775.807 */

