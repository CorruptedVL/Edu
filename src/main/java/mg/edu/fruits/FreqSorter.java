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

        final Map<String, Integer> freq = new HashMap<>();
        final Map<String, Integer> firstIndx = new HashMap<>();
        for (int i = 0; i < copy.size(); i++) {
            String name = copy.get(i);
            freq.merge(name, 1, Integer::sum);
            firstIndx.putIfAbsent(name, i);
        }
        List<String> uniques = new ArrayList<>(new LinkedHashSet<>(copy));
        uniques.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int fa = freq.get(a);
                int fb = freq.get(b);
                int byFreq = Integer.compare(fb, fa);
                if (byFreq != 0) return byFreq;
                return Integer.compare(firstIndx.get(a), firstIndx.get(b));
            }
        });

        copy.clear();
        copy.addAll(uniques);

//        Map<Integer, List<String>> byCount = new TreeMap<>(Collections.reverseOrder());
//        Set<String> seen = new HashSet<>();
//        for (String name : copy) {
//            if (seen.add(name)) {
//                int count = freq.get(name);
//                List<String> bucket = byCount.get(count);
//                if (bucket == null) {
//                    bucket = new ArrayList<>();
//                    byCount.put(count, bucket);
//                }
//                bucket.add(name);
//            }
//            copy.clear();
//            for (List<String> bucket : byCount.values()){
//                copy.addAll(bucket);
//            }
//        }
    }

}
