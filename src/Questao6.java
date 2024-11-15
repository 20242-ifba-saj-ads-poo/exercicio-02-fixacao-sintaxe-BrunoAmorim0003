public class Questao6 {

    public static void main(String[] args){

        int num1=0,num2=1,num3;

        System.out.println(num1);
        System.out.println(num2);

        while(true){
            num3 = num1 + num2;
            if(num3 > 100){
                break;
            }

            System.out.println(num3);

            num1 = num2;
            num2 = num3;
        }
    }
}
