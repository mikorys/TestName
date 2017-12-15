package sztucznainteligencja;

import java.util.Scanner;

public class ArrayStack implements Stack {


    Scanner read = new Scanner(System.in);

    int[] tableOfInt = new int[0];

    @Override
    public int pop() {// usuniecie wartosci


        if (isEmpty()) {
            return -1;// jeśłi jest zwracane -1 to jest pusty stos
        } else {
            int lastValue=tableOfInt[tableOfInt.length - 1];// zapisywanie zmienniej która w forze zostanie pominięta
            int [] temporaryTab = new int[tableOfInt.length-1];// stworzenie tablicy mniejszej o 1 od aktrualnej
            for (int i=0; i<tableOfInt.length-1; i++)
            {
                temporaryTab[i]=tableOfInt[i];

            }
            tableOfInt=temporaryTab;// referencja na pomniejszoną tablicę
            return lastValue ;
        }
    }
    @Override
    public void push(int value) {// dodanie wartosci
        int [] temporaryTab = new int[tableOfInt.length+1];//tworzymy tablicę dodatkową o jeden rozmiar większą niż aktualna
        for (int i=0; i<tableOfInt.length; i++)
        {
         temporaryTab[i]=tableOfInt[i];

        }
        temporaryTab[temporaryTab.length-1]=value;// tutaj tabelaj tableof int popada w niepamięc dlatego tez
        tableOfInt=temporaryTab;// musimy do niej przypisac referencję teblicy temporrary

    }

    @Override
    public int size() {

        return tableOfInt.length;
    }

    @Override
    public boolean isEmpty() {
        if (tableOfInt.length == 0)
            return true;
        else

            return false;
    }
    @Override
    public void print() {
        for (int i = 0; i < tableOfInt.length; i++) {
            System.out.println("tableOfInt[" + i + "] = " + tableOfInt[i]);
        }

    }


}
