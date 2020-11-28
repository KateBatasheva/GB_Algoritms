package lesson2;

import java.io.RandomAccessFile;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(2);
//        mal.add(1);
//        mal.add(3);
//        mal.add(4);
//        System.out.println(mal);


//
//        mal.add(3, 99);
//        System.out.println(mal);
//
////        mal.remove((Integer) 1);
////        System.out.println(mal);
//
//        System.out.println(mal.indexOf(44));


//        MySortedArraylist<Integer> msal = new MySortedArraylist<>();
//        msal.add(5);
//        msal.add(2);
//        msal.add(1);
//        msal.add(3);
//        msal.add(4);
//        System.out.println(msal);
//        System.out.println(msal.binaryFind(3));

        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(10);
        for (int i = 0; i < 100; i++) {
            mal.add(random.nextInt(100));
        }
         System.out.println("Текущий размер массива (капасити): " + mal.getCapacityAtMoment());

        System.out.println(mal);
         long time = System.currentTimeMillis();
//        mal.selectionSort(Comparator.naturalOrder());
//        mal.selectionSort(Comparator.reverseOrder());
//        mal.selectionSort((a,b)->{return a%10 - b %10;});
//        mal.insertionSort(Comparator.reverseOrder());
        mal.bubbleSort(Comparator.reverseOrder());
        System.out.println("Время выполнения сортировки: " + (System.currentTimeMillis() - time));
        System.out.println(mal);
    }
}
