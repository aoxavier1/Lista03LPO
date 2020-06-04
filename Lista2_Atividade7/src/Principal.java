import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
int media ; 
System.out.println("Digite a média negativa a qualquer momento para finalizar:");
      media = ler.nextInt();
      int maior; 
      int menor ; 
      int total ; 
      int cont;
      maior = media;
      menor = media;
      total =media;
      cont =0;
       if ( media <0){
           System.out.println("Média Negativa");        
       }
     while ( media >0){
    if ( menor > media){
     menor = media;
    total=total+media;
    System.out.println("Digite a média negativa a qualquer momento para finalizar:");
    media = ler.nextInt();
    cont =cont+1;  
   if( media <0){
             break;
         }
    }
    else{
        maior= media;
         total=total+media;
         System.out.println("Digite a média negativa a qualquer momento para finalizar:");
         media = ler.nextInt();
         cont =cont+1;  
        if ( media <0){
           break;    
         }
    }
    
}
     total = total/cont;
     System.out.println("A maior média é:"+maior);
      System.out.println("A menor média é:"+menor);
       System.out.println("A média da turma é:"+total);
    }
}


