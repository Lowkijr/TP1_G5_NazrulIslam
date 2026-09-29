// j'ai aussi ajoute ce projet sur mon github https://github.com/Lowkijr/TP1_G5_NazrulIslam

import java.util.Scanner;


/*
4.

1.  Le code va nous demander d’entrer d’abord des nombres entiers puis réels et les afficher sur la console sous le format :

    “J’ai recupere un entier : (l’entier que j’aurai envoye)”
    “J’ai recupere un reel : (le reel que j’aurai envoye)”

2.  scanner.nextInt() va récupérer la valeur ici le nombre entier et scanner.nextFloat() va récupérer le nombre réel.

3.  Le programme se lance avec un message de console puis sans aucun message de demande de nombre (ici on doute qu’il faut
    entrer les nombres pour que le programme continue de dérouler)
*/



public class Main {

    public static void main(String[] args) throws InterruptedException {

        tableMultiplication();

    }


    public static void exo_nom(){
        Scanner scanner = new Scanner(System.in);
        //Affichage de messages en console
        System.out.println("Bonjour, quel est votre prénom ? ");
        String Nom = scanner.nextLine();
        System.out.println("Bonjour, " + Nom);
    }


    public static void exo_nombre() {

        Scanner scanner = new Scanner(System.in);
        //initialisation des variables scanner (un entier et un reel)
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();

        //affichage des sorties apres les inputs des nombres
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
    }

    //exo 5.1
    public static void somme() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();

        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();

        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);

    }

    //exo 5.2
    public static void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();

        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();

        int division = premierEntier / deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + division);

    }

    //exo 5.3
    /*  1.On a besoin de 4 variables Largeur, Hauteur, Longueur et Volume.
        2.Les variables seront en entier reel (float).
        3.On peut obtenir les valeurs de ces variables en demandant à l'utilisateur avec des scanner.
        4.La formule du volume est : Longueur * Largeur * Hauteur
        5.Le resultat sera affiche dans un sout avec la variable float volume
        6.Lors des entrees des valeurs float on peut entrer une valeur negative qui donne un volume negatif, Il faudrait
        donc securiser les valeurs(uniquement des valeurs positives) pour que le resultat soit coherent.
    */
    public static void volume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextFloat();

        System.out.println("Veuillez saisir le deuxième entier");
        float deuxiemeEntier = scanner.nextFloat();

        System.out.println("Veuillez saisir le troisieme entier");
        float troisiemeEntier = scanner.nextFloat();

        float volume = premierEntier * deuxiemeEntier * troisiemeEntier;
        System.out.println("Le volume du pave est " + volume );

    }

    //exo 6
    public static void testScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        // On saisit ’11’
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation");
        // Parce que le caractere newline n’a pas ete lu, c’est lui qui va se
        // retrouver dans la variable operation
        // Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();
        System.out.println(operation);
    }

    //exo 7.1
    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur de a ?");
        float a = scanner.nextInt();

        System.out.println("Quelle est la valeur de b ?");
        float b = scanner.nextInt();

        System.out.println("Quelle est la valeur de c ?");
        float c = scanner.nextInt();

        float delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta == 0){
            float x = -b / (2*a);
            System.out.println("La solution est " + x);
        }

        else if (delta < 0) {
            double x1 = -b / (2 * a);
            double y1 = Math.sqrt(-delta) / (2 * a);

            System.out.println("Les solutions sont x1 = " + x1 + " + i" + y1 + " et x2 = " + x1 + " - i" + y1);
        }

        else if (delta>0){
            double x1= ((-b + Math.sqrt(delta)) / (2*a));
            double x2= ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Les solutions sont " + x1 + " et " + x2);
        }
    }
    /*
        exo 7.2
        Parite d'un nombre

    */

    public static void parite(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre : ");
        int nombre = scanner.nextInt();

        if (nombre % 2 == 0){
            System.out.println("Le nombre "+ nombre +" est pair.");
        }
        else{
            System.out.println("Le nombre "+ nombre +" est impair.");
        }
    }

    //exo 7.3
    public  static void max(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre : ");
        float nombre1 = scanner.nextFloat();

        System.out.println("Veuillez saisir un autre nombre : ");
        float nombre2 = scanner.nextFloat();

        if  (nombre1 > nombre2){
            System.out.println("Le nombre "+ nombre1 +" est plus grand que " + nombre2 + ".");
        }

        else{
            System.out.println("Le nombre "+ nombre2 +" est plus grand que " + nombre1 + ".");
        }
    }

    public  static void min(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre : ");
        float nombre1 = scanner.nextFloat();

        System.out.println("Veuillez saisir un autre nombre : ");
        float nombre2 = scanner.nextFloat();

        if  (nombre1 < nombre2){
            System.out.println("Le nombre "+ nombre1 +" est plus petit que " + nombre2 + ".");
        }

        else{
            System.out.println("Le nombre "+ nombre2 +" est plus petit que " + nombre1 + ".");
        }
    }

    //exo 7.4
    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();

        int factorielle = 1;
        // ici la ligne de base etait for (int i = 0; i <= n; i++) mais si l'on commence par 0
        // la factorielle sera toujours 0 du coup on doit le modifier pour commencer par 1
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    //exo 7.5
    public static void countdown() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            //Thread.sleep(1000);
        }
        System.out.println("BOOM !");
    }

    //exo 7.6
    public static void carres() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier : ");
        float nombre = scanner.nextInt();

        System.out.println(nombre + "\t" + (nombre * nombre));

    }

    /* 7.7
    1. Le plus approprie est une boucle for, car on connait à l'avance le nombre de valeurs : de 1 à 10.
    3.
        public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
            }
        }
    */
    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

}