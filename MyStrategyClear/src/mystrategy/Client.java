/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.*;
import sort.strategy.Stopwatch;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

/**
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Algorytmy sortowania */
        Bubblesort bubblesort = new Bubblesort();
        Insertionsort insertionsort = new Insertionsort();
        Quicksort quicksort = new Quicksort();
        Selectionsort selectionsort = new Selectionsort();
        Stopwatch watch = new Stopwatch();
        Double time = 0.0;
        double[] dataNonSort = DataGenerator.generate(1000000);
        /* Wzorzec Stratega */
        String type = "Quicksort";
        switch (SortType.valueOf(type)) {
            case Bubblesort:
                bubblesort.sort(dataNonSort);
                time = watch.elapsedTime();
                break;
            case Insertionsort:
                insertionsort.sort(dataNonSort);
                time = watch.elapsedTime();
                break;
            case Quicksort:
                quicksort.sort(dataNonSort);
                time = watch.elapsedTime();
                break;
            case Selectionsort:
                selectionsort.sort(dataNonSort);
                time = watch.elapsedTime();
                break;
        }
        // Arrays.stream(dataNonSort).forEach( x -> System.out.println(x));
        System.out.println("Time: " + time);
    }

}
