package solutions.stream;

import java.util.List;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez calculateWithStream pour additionner tous les éléments d'une liste
 * Elle devra avoir le même comportement que calculate
 * (Utilisez Reduce plutôt que IntStream)
 *
 *************
 *
 * Resultat attendu : 15
 *
 */
public class Exo5 {

    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        int result = calculate(numbers);
        System.out.println(result);

        int result2 = calculate(numbers);
        System.out.println(result2);
    }

    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculateWithStream(List<Integer> numbers) {
//        Solution 1
//        numbers.stream().mapToInt(n -> n).sum();
//        Solution 2
        return numbers.stream().reduce(0, (a, b) -> Integer.sum(a, b));
    }


}

