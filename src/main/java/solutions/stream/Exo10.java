package solutions.stream;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

/*
 ** Consigne **
 *
 * Avec les Streams, codez getStringWithStream
 * Elle devra avoir le même comportement que getString
 *
 *************
 *
 * Resultat attendu :
 * i3,p44
 * i3
 */
public class Exo10 {

    public static void main(String[] args) {
        List<Integer> values1 = asList(3, 44);
        List<Integer> values2 = asList(3);

        String result1 = getString(values1);
        System.out.println(result1);
        String result2 = getString(values2);
        System.out.println(result2);

        String result3 = getStringWithStream(values1);
        System.out.println(result3);
        String result4 = getStringWithStream(values2);
        System.out.println(result4);
    }

    public static String getString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % 2 == 0) {
                sb.append('p').append(element);
            } else {
                sb.append('i').append(element);
            }
            if (i < list.size() - 1) sb.append(',');
        }
        return sb.toString();
    }

    public static String getStringWithStream(List<Integer> list) {
        return list.stream()
                .map(i -> (i % 2 == 0) ? "p" + i : "i" + i)
                .collect(joining(","));
    }

}

