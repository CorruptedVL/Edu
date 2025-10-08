package mg.edu.fruits;

import java.util.*;


public class FreqSorter implements Sorter {
    @Override
    public List<String> getSortedCopy(List<String> names) {
        List<String> copy = new ArrayList<>(names);
        sorting(copy);
        return copy;
    }

    private void sorting(List<String> copy) {

        Map<String, Integer> freq = new HashMap<>();
        for (String s : copy) {
            freq.merge(s, 1, Integer::sum);
        }

        Map<Integer, List<String>> byCount = new TreeMap<>(Collections.reverseOrder());

        Set<String> seen = new HashSet<>();

        for (String name : copy) {
            if (seen.add(name)) {
                int count = freq.get(name);
                List<String> bucket = byCount.get(count);
                if (bucket == null) {
                    bucket = new ArrayList<>();
                    byCount.put(count, bucket);
                }
                bucket.add(name);
            }
        }
        copy.clear();
        for (List<String> bucket : byCount.values()) {
            copy.addAll(bucket);
        }

//
//        List<String> uniques = new ArrayList<>(new LinkedHashSet<>(copy));
//
//        uniques.sort(new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                int fa = freq.getOrDefault(a, 0);
//                int fb = freq.getOrDefault(b, 0);
//                return Integer.compare(fb, fa);
//            }
//        });
    }
}
