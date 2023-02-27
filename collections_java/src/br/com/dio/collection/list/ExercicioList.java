package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;


public class ExercicioList {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList();
        temperaturas.add(12d);
        temperaturas.add(5d);
        temperaturas.add(1.2);
        temperaturas.add(25d);
        temperaturas.add(13d);
        temperaturas.add(10d);
        double media = 0;

        for (Double temperatura: temperaturas) {
            media += temperatura;
        }
        media= media/temperaturas.size();
        for (int i = 0; i < temperaturas.size();i++){
            if (media<temperaturas.get(i)){
                System.out.println(temperaturas.get(i));
            }
        }
        System.out.printf("%.2f",media);

    }
}
