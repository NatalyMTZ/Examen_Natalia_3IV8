import java.util.Scanner;
import java.util.*;
import java.io.*;

class PokedexNatalia{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int opcion, numero;
        char letra;

    do{
        System.out.println("3IV8 MARTINEZ GAMBOA NATALIA");
        System.out.println(" ");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Consultar datos de Charmander");
        System.out.println("2.- Consultar datos de Bulbasaor ");
        System.out.println("3.- Consultar datos de Squartle ");
        System.out.println("4.- Batalla ");

        opcion = entrada.nextInt();

        switch(opcion) {

            case 1:
            do{
                System.out.println("ID DEL POKEMON: 004 ");
                System.out.println("NOMBRE DEL POKEMON: Charmander ");
                System.out.println("ENERGIA VITAL DEL POKEMON: 15");
                System.out.println("FUERZA DEL POKEMON: 30 ");
                System.out.println("DEFENSA DEL POKEMON: 40 ");
                System.out.println("VIDA DEL POKEMON: 100 ");
                System.out.println("ATAQUE PRINIPAL DEL POKEMON: 50 ");
                System.out.println("ATAQUE SECUNDARIO DEL POKEMON : 40");

            System.out.println(" ");
            System.out.println("Digite r si desea repetir el programa.");
            System.out.println("Si desea volver al menu, digite m.");
            letra = entrada.next().charAt(0);
            }while(letra ==  'r');

                break;

            case 2:
            do{
                System.out.println("ID: 006");
                System.out.println("NOMBRE DEL POKEMON: Bulbasao");
                System.out.println("ENERGIA VITAL DEL POKEMON: 16");
                System.out.println("FUERZA DEL POKEMON: 40 ");
                System.out.println("DEFENSA DEL POKEMON: 50 ");
                System.out.println("VIDA DEL POKEMON: 100 ");
                System.out.println("ATAQUE PRINIPAL DEL POKEMON: 60 ");
                System.out.println("ATAQUE SECUNDARIO DEL POKEMON : 50 ");

            System.out.println(" ");
            System.out.println("Digite r si desea repetir el programa.");
            System.out.println("Si desea volver al menu, digite m.");
            letra = entrada.next().charAt(0);
            }while(letra ==  'r');

                break;

            case 3:
            do{
                System.out.println("ID: 006");
                System.out.println("NOMBRE DEL POKEMON: Squartle");
                System.out.println("ENERGIA VITAL DEL POKEMON: 17");
                System.out.println("FUERZA DEL POKEMON: 50 ");
                System.out.println("DEFENSA DEL POKEMON: 60 ");
                System.out.println("VIDA DEL POKEMON: 100 ");
                System.out.println("ATAQUE PRINIPAL DEL POKEMON: 80 ");
                System.out.println("ATAQUE SECUNDARIO DEL POKEMON : 70 ");

            System.out.println(" ");
            System.out.println("Digite r si desea repetir el programa.");
            System.out.println("Si desea volver al menu, digite m.");
            letra = entrada.next().charAt(0);
            }while(letra ==  'r');
    
                break;

            case 4:
            do{
                System.out.println("Escoje un numero del 1-3 para la batalla");
                numero = entrada.nextInt();

                if(numero == 1){
                    System.out.println("Charmander es el ganador");
                    System.out.println("Bulbasao ha sido derrotado");
                    System.out.println("Esta debilitado Bulbasao");
                }
                if(numero == 2){
                    System.out.println("Bulbasao es el ganador");
                    System.out.println("Squirtle ha sido derrotado");
                    System.out.println("Esta debilitado Squirtle");
                }
                if(numero == 3){
                    System.out.println("Squirtle es el ganador");
                    System.out.println("Charmander ha sido derrotado");
                    System.out.println("Esta debilitado Charmander");
                }
                
                else{
                    System.out.println("Escoje nuevamente un numero del 1-3 para la batalla");
                }
                System.out.println("Para reiniciar la batalla digita n");
                System.out.println("Si desea volver al menu, digite m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'n');

                break;
        }
        System.out.println(" ");
        System.out.println("Digite m nuevamente para salir al menu.");
        System.out.println("Digite x para cerrar el programa.");
        System.out.println(" ");
        letra = entrada.next().charAt(0);

    }while(letra == 'm');       
    }
}