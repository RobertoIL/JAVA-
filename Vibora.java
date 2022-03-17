import java.util.Scanner;
public class Vibora {

    public static void main(String[] args) {


        //declaracion de varibles
        int[][] vibora = new int[10][10];
        int i, j;
        String opcion = "";
        boolean opcionvalid = false;
        Scanner teclado = new Scanner(System.in);

        //vibora

        int i1 = 7, i2 = 6, i3 = 5, j1 = 4, j2 = 4, j3 = 4;

        //aqui le asignamos de posicion una variables para poder modificarlas
        //y asi poder trasladar la vibora
        vibora[i1][j1] = 1;
        vibora[i2][j2] = 1;
        vibora[i3][j3] = 1;


        //mostrar en imagen la mnatriz vacia
        for (i = 0; i < vibora.length; i++) {
            for (j = 0; j < vibora.length; j++) {
                System.out.print(vibora[i][j] + " ");
            }
            System.out.print("\n");
        }
        //vibora inicial
        boolean q = true;

        //proceso y entrada de datos.

        while (q) {
            System.out.println("Para delplazarse use las teclas ASDW, para salir del juego presione q");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "w":  //caso para mover hacia arriba
                    for (i = 0; i < vibora.length; i++) {
                        for (j = 0; j < vibora.length; j++) {
                            vibora[i1][j1] = 0;
                            vibora[i3 - 1][j3] = 1;
                            System.out.print(vibora[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    //nueva asigancion de valores
                    i3=i3-1;
                    i2=i2-1;
                    i1=i1-1;
            }
            //caso para mover hacia abajo
            switch (opcion) {
                case "s":
                    for (i = 0; i < vibora.length; i++) {
                        for (j = 0; j < vibora.length; j++) {
                            vibora[i3][j3] = 0;
                            vibora[i1+1][j1] = 1;
                            System.out.print(vibora[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    //nueva asignacion de valores
                    i3=i3+1;
                    i2=i2+1;
            }
            //caso para mover a la izquierda
            switch (opcion) {
                case "a":
                    for (i = 0; i < vibora.length; i++) {
                        for (j = 0; j < vibora.length; j++) {
                            vibora[i3][j3] = 0;
                            vibora[i3][j3 - 1] = 1;
                            System.out.print(vibora[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    //nueva asignacion de valores
                    j3=j3-1;
                    j2=j2-1;
                    j1=j1-1;
            }
            //caso para mover hacia la derecha
            switch (opcion) {
                case "d":
                    for (i = 0; i < vibora.length; i++) {
                        for (j = 0; j < vibora.length; j++) {
                            vibora[i3][j3] = 0;
                            vibora[i3][j3 + 1] = 1;
                            System.out.print(vibora[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    //nueva asignaicon de valores
                    j3=j3+1;
            }
            switch (opcion){
                    case "q":
                        System.out.println("adios :)");
                        q = false;
                        break;
                }

            }


            }
        }




