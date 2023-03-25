import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {
        
      Scanner entrada = new Scanner (System.in);
     
      float peso,altura,imc;
      
      
      
      System.out.println("Introduzca su peso en kg:");
      peso = entrada.nextFloat();

      System.out.println("Introduzca su altura en m:");
      altura = entrada.nextFloat();

      imc = peso/(altura*altura);
      System.out.println("Su imc es de: "+imc);
      
      if (imc < 18.5) {
        System.out.println("Bajo peso");
      } 
      else if (imc >= 18.5 && imc < 25) {
        System.out.println("Normal");
      }
      else if (imc >= 25 && imc < 30){
        System.out.println("Sobrepeso");
      }
      else{
        System.out.println("Obesidad");
      }

    }
}
    

