public class Questao7 {
    public static void main(String[] args) {
        
        int x = 100; 

        while (x != 1) {
            System.out.print(x + " -> ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        }
        System.out.println(x); 
    }
}
