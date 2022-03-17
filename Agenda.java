import java.util.Scanner;
public class Agenda {
    public static void main(String[] args){


        //Agenda

        //matriz de la agenda
        String[][] agenda = new String[9][2];


        //valores de la agenda
        boolean i1,i2,i3,i4,i5,i6,i7,i8,i9;

        agenda[0][0]="8am";
        agenda[1][0]="8am";
        agenda[2][0]="8am";
        agenda[3][0]="8am";
        agenda[4][0]="8am";
        agenda[5][0]="8am";
        agenda[6][0]="8am";
        agenda[7][0]="8am";
        agenda[8][0]="8am";

        int i,j;

        for (i=0;i<agenda.length;i++){
            for (j=0;j< agenda.length;j++){
                System.out.print(agenda[i][j]+" ");
            }
            System.out.print("\n");
        }







    }
}
