package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog();
        //Hedgehog newHedgehog = null;

        boolean exit = false;
        while(!exit) {
            System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );
            
            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String hedgehogSays = sc.nextLine();
                        hedgehog.Speak(hedgehogSays);
                        break;
                    
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        int age = Integer.parseInt(sc.nextLine());

                        hedgehog = new Hedgehog(name, age);
                        break;
                    
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int laps = Integer.parseInt(sc.nextLine());
                        hedgehog.Run(laps);
                        break;
                    
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    
                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                        
                }
            }
        }

        sc.close();
    }
}
