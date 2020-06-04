

import java.util.Scanner;

public class Principal {  
  
    public static void main(String[] args) {  
  
        Scanner sc = new Scanner (System.in);  
        int valor[] = new int[15];  
        
        for(int i = 0; i < valor.length; i++){  
            System.out.print("Digite o " +(i+1)+"º valor: ");  
            valor[i] = sc.nextInt();  
        }  

        int maior = valor[0];
        for (int i = 1 ; i < valor.length; i++){
                if ( valor[i] > maior) {
                      maior = valor[i];
               }
          }

        int menor = valor[0];
        for (int i = 1; i < valor.length; i++) {  
            if(valor[i] < menor){  
                menor = valor[i];  
            }  
        }  
        System.out.println("Maior valor = "+ maior);  
        System.out.println("Menor valor = "+ menor);  
    }  
}  