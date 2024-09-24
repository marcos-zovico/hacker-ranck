package hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DeterminingDNAHealth {

    class Result {

        // some tests cases are falling for timeout
        public static int determineDnaHealth(List<String> genes, List<Integer> values, int first, int last, String d) {
            Integer health = 0;

            Map<String, GemValueMap> map = new HashMap<>();

            for (int i = first; i <= last; i++) {
                Integer value = values.get(i);
                String gen = genes.get(i);
                String key = gen + value;
                map.put(key, new GemValueMap(key, gen, value));
            }

            for (int i = 0; i < d.length(); i++) {
                for (Map.Entry<String, GemValueMap> m : map.entrySet()) {
                    GemValueMap gvm = m.getValue();
                    int endIndex = Math.min(i + gvm.getGen().length(), d.length());
                    String gen = d.substring(i, endIndex);
                    String key = gen + gvm.getValue();

                    if (map.containsKey(key)) {
                        health += gvm.getValue();
                    }
                }
            }

            return health;
        }

    }

    static class GemValueMap {
        private final String key;
        private final String gen;
        private final Integer value;

        GemValueMap(String key, String gen, Integer value) {
            this.key = key;
            this.gen = gen;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getGen() {
            return gen;
        }

        public Integer getValue() {
            return value;
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> genes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .toList();

            List<Integer> values = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .toList();

            int s = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> healths = new ArrayList<>();

            IntStream.range(0, s).forEach(sItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int first = Integer.parseInt(firstMultipleInput[0]);

                    int last = Integer.parseInt(firstMultipleInput[1]);

                    String d = firstMultipleInput[2];

                    int health = Result.determineDnaHealth(genes, values, first, last, d);

                    healths.add(health);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int unhealthiest = healths.stream().min(comparing(Integer::valueOf)).get();
            int healthiest = healths.stream().max(comparing(Integer::valueOf)).get();

            System.out.println(unhealthiest + " " + healthiest);

            bufferedReader.close();
        }
    }
}
