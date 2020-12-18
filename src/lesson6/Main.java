package lesson6;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        MyTreeMap<Integer, Integer> mapa = new MyTreeMap<>();

//        map.put(5,"five");
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,"four");
//        map.put(2,"two two");

//        System.out.println(map);
//        System.out.println(map.get(2));

////        map.deleteMin();
//        System.out.println(map);
//        System.out.println(map.size());
//
////        map.delete(5);
//        System.out.println(map);
//        System.out.println(map.size());
//
//        Random random = new Random();
//
        ArrayList<MyTreeMap> mapas = new ArrayList<>();
        createTrees(20, mapas);
        System.out.println(mapas.toString());
        int countBalance = 0;
        for (int i = 0; i <mapas.size() ; i++) {
            if (mapas.get(i).isBalanced()){
                countBalance++;
            }
        }
        System.out.println(countBalance/mapas.size());


    }

    public static ArrayList createTrees(int count, ArrayList<MyTreeMap> mapas) {
        for (int i = 0; i < count; i++) {
            mapas.add(new MyTreeMap<>());
        }
        Random random = new Random();
        for (int j = 0; j < mapas.size(); j++) {
            for (int i = 0; i < 63; i++) {
                mapas.get(j).put(random.nextInt(200) - 100, random.nextInt(200) - 100);
                if (mapas.get(j).hight() == 6) {
                    break;
                }
            }
        }
        return mapas;
    }

    }

