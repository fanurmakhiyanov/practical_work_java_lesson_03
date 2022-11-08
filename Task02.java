// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.*;

public class Task02 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fh = new FileHandler("Task02Logger.xml");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);

        System.out.println("Изначальный список: " + List);

        for (Iterator<Integer> iterator = List.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("Число является четным: " + number);
                iterator.remove();
            }

        }

        Collections.sort(List);
        System.out.println("Список с нечетными числами: " + List);
        logger.log(Level.INFO, "Сообщение");

    }

}