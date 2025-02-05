package dsalgotutort.Revison;

// "static void main" must be defined in a public class.
public class Basics {

    public static void main(String[] args) {
        System.out.println("Basics of Iterations");
        newPattern();
        reverseTrainglePattern();
        irpryramid();
        trainglePattern();
        pryramidRightAligned();
        pryramid();
        numberPryramid();
        doWhile();

    }


    public static void trainglePattern(){
        System.out.println();
        System.out.println("----- Centre Aligned Traingle Pyramid ------- ");
        int rows = 5;  // number of rows

        // outer loop rows
        for(int i = 1; i <= rows; i++) {

            // inner loop for empty spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // inner loop for stars
            for(int k = 1; k <=(2 * i - 1); k++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }

    }


    public static void doWhile(){
        System.out.println();
        System.out.println("----- Do While Iterations ------- ");
        int i = 3;
        do{
            System.out.println("number : " + i);
            i++;
        } while( i <=6);
    }

    public static void pryramid(){
        System.out.println();
        System.out.println(" ------ Left Aligned Pyramids -------- ");
        int n = 5;
        int i = 0;
        while( i < n){
            for(int j=0; j<=i; j++ ){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }
    }

    public static void pryramidRightAligned(){
        System.out.println();
        System.out.println("--------- Right Aligned Pyramids ------ ");
        int n = 5;
        int p = 1;
        while( p <= n ){
            for(int j=0 ; j < n-p; j++) {
                System.out.print(" ");
            }
            for(int y = 0; y < p; y++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            p++;
        }

    }

    public static void numberPryramid(){
        System.out.println();
        System.out.println(" ---  Number Pyramids -- ");
        int n = 5;
        int i = 1;
        while( i <= n){
            for(int j=1; j<=i; j++ ){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }
    }

    public static void irpryramid(){
        System.out.println();
        System.out.println(" ------ Left Aligned Increasing Decreasing Pyramids -------- ");
        int n = 5;
        int i = 0;

        while( i < n){
            for(int j=0; j<=i; j++ ){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }

        int x = n-1;
        while(x > 0) {
            for(int k = x; k > 0; k--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            --x;
        }
    }

    public static void reverseTrainglePattern(){
        System.out.println();
        System.out.println("-----Reverse Centre Aligned Traingle Pyramid ------- ");
        int rows = 5;  // number of rows

        // outer loop rows
        for(int i = rows; i > 0; i--) {

            // inner loop for empty spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // inner loop for stars
            for(int k = 1; k <=(2 * i - 1); k++) {
                System.out.print(k);
            }

            // next line
            System.out.println();
        }

    }

    public static void newPattern(){
        System.out.println();
        System.out.println(" ------ New Pattern -------- ");

        int n = 5;
        int i = 0;

        while( i < n)   {
            for(int j=0; j<=i; j++ ){
                System.out.print(" ");
                if(j==i){
                    System.out.print("*");
                }
            }
            System.out.println();
            i++;
        }

        int x = n-1;
        while(x > 0) {
            for(int k = x; k > 0; k--) {
                System.out.print(" ");
                if(k == 1){
                    System.out.print("*");
                }
            }
            System.out.println();
            --x;
        }

    }

}