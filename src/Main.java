import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ESERCIZIO 1");
        boolean pd= pariDispari(2);
        System.out.println(pd);
        String annoBi=annoBisestile(1956);
        System.out.println(annoBi);
        System.out.println("ESERCIZIO 2");
        String num=numlet(4);
        System.out.println(num);
        System.out.println("ESERCIZIO 3");
        String caratt =caratteri("Come quando");
        System.out.println(caratt);
        System.out.println("ESERCIZIO 4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero:");
        int numero = scanner.nextInt();
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();

    }
    //esercizio 1
    public static boolean pariDispari (int a){
        return a % 2 == 0;
    }
    public static String annoBisestile (int anno){
        if(anno%4==0){return "l'anno è bisestile";}else{return "l'anno non è bisestile" ;}
    }
    //esercizio 2
    public static String numlet (int numero){
        String risultato;
        switch(numero) {

            case 0: risultato= "zero";
            break;
            case 1: risultato= "uno";
            break;
            case 2: risultato= "due";
            break;
            case 3: risultato= "tre";
            break;
            default: risultato= "il numero non è uguale a 0,1,2 o 3";

        }
        return risultato;

    }
    //esercizio 3
    public static String caratteri (String str){
       while(!str.equals("q")){   String[] caratteri = str.split("");
           return String.join(",", caratteri);
       }

       return "Hai inserito la Q"; };


}


