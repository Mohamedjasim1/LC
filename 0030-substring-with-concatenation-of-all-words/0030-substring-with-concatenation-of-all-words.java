class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> list = new ArrayList<>();
        int len = words[0].length();
        int size = words.length;

        HashMap<String, Integer> freq = new HashMap<>();
        for (String w : words) freq.put(w, freq.getOrDefault(w, 0) + 1);

        for (int start = 0; start < len; start++) {

            HashMap<String, Integer> map = new HashMap<>();
            int count = 0;
            int l = start;

            for (int r = start; r + len <= s.length(); r += len) {

                String temp = s.substring(r, r + len);

                if (!freq.containsKey(temp)) {
                    map.clear();
                    count = 0;
                    l = r + len;
                    continue;
                }

                map.put(temp, map.getOrDefault(temp, 0) + 1);
                count++;

                while (map.get(temp) > freq.get(temp)) {
                    String rem = s.substring(l, l + len);
                    map.put(rem, map.get(rem) - 1);
                    l += len;
                    count--;
                }

                if (count == size) {
                    list.add(l);
                    String rem = s.substring(l, l + len);
                    map.put(rem, map.get(rem) - 1);
                    l += len;
                    count--;
                }
            }
        }

        return list;
    }
}
