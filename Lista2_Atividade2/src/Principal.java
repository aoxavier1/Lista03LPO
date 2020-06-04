
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {  
        Scanner ler = new Scanner(System.in);
int numero ;
System.out.println("Digite o número referente a tabuada"); 
numero = ler.nextInt();

if ( numero >9) {

System.out.println("Valor Invalido"); 
} 
else{
for (int i=1;i<=10;i++){

        System.out.println(numero + " x " + i + " = " + numero*i);

}
    }
}
}




	

    
