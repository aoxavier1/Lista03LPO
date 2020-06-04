
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
       int soma;
        int soma2;
        soma=0;
        soma2=0;
         Scanner ler = new Scanner(System.in);
int numero ;
        System.out.println("Digite um número positivo ou 1000 para finalizar");
numero = ler.nextInt();

while ( numero <1000){
    if ( numero % 2 == 0){
    soma = soma + numero;
    System.out.println("A soma dos números pares são:"+soma);
    System.out.println("A soma dos números impares é:"+soma2);
    System.out.println("");
}
else{
        soma2=soma2+numero;
        System.out.println("A soma dos números pares são:"+soma);
        System.out.println("A soma dos números impares são:"+soma2);
        System.out.println("");
}
    System.out.println("Digite um número positivo ou 1000 para finalizar");
numero = ler.nextInt();


        }
    }
}

    
