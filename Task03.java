// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task03 {
    public static void main(String[] args)    {

        Integer[] A = { 6, 8, 3, 5, 1, 9, 0, 77, 102 };
 
        List<Integer> ints = Arrays.asList(A);
        double avg = getAverage(ints);
        String result = String.format("%.2f", avg);
 
        System.out.println("Минимальный элемент списка: " + Collections.min(ints));
        System.out.println("Максимальный элемент списка: " + Collections.max(ints));
        System.out.printf("Среднее значение элементов списка: " + result);
        
    }

    private static double getAverage(List<Integer> ints) {
        return ints.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
}

    
}
