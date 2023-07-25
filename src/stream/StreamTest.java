package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //tworzenie strumienia

        List<String> names = Arrays.asList("Tom","Max","Paul","Mat"); //utworzenie listy

        Stream<String> streamNames = names.stream(); //utworzenie strumienia do listy
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2,3,4}).stream(); //stream z tablicy
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4); //tworzenie double stream
        IntStream intStream = IntStream.range(1,100);

        //Przetwarzanie danych
        //filter - filtrowanie - za pomocą lambdy będziemy podawali jakiś warunek który ma spełnić element w naszym strumieniu
        //map - zmiana elementu na coś innego
        //limit - zwraca określoną liczbę elementów
        //peek - pozwala przeprowadzić operację na każdym elemencie

        //Zakończenie strumienia
        //forEach - wykonanie akcji dla każdego z elementów strumienia
        //count - zwróci ilość elementów w strumieniu
        //allMatch - sprawdza czy elementy spełniają jakiś warunek
        //collect - zwraca nowy typ na podstawie strumienia

        //zapis lambda
        /*streamNames.filter(el -> el.startsWith("T"))    //filtrowanie strumienia czy występuje T
                .map(el -> el.toUpperCase())            //zamiana wielkości liter
                .forEach(el -> System.out.println(el));*/
        List<String> modifiedNames = streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());


        /*intStream.filter(el -> el>20)               //filtrowanie elementów intStream el>20
                .map(el -> el*2)                    //powiększenie każdego elementu
                .limit(10)                  //ograniczenie ilości wyświetlonych elementów do 10
                .forEach(el -> System.out.println(el));*/

        long count = intStream.filter(el -> el>20)
                .map(el -> el*2)
                .count();
        System.out.println(count);



    }
}
