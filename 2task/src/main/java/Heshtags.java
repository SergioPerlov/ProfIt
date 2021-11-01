

import java.util.*;




public class Heshtags {
    public static void main(String[] args) {
        ArrayList<String> hashtags = new ArrayList<String>();
        hashtags.add("Крутой #спец по прогаммм #учить");
        hashtags.add("Сколько нужно #учить чтоб сказали что ты крутой #спец");
        find(hashtags);
    }

    public static void find(ArrayList<String> a) {
        System.out.println("Top 5 ###\n");

        List<String> hesh = new ArrayList<>();
        List<Integer> cnt = new LinkedList<>();

        Map<String, Integer> counterMap = new HashMap<>();
        for (int j = 0; j < a.size(); j++) {
            String[] b = a.get(j).split(" ");
            Integer count = 0;
            for (int i = 0; i < b.length; i++) {
                if(!b[i].isEmpty()) {

                    if(b[i].contains("#")){
                        counterMap.put(b[i], ++count);

                    }
                }
            }}

        for (String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
//--------------------------------------------------------------
    // тут обрабатывается массив строк
//        for (int j = 0; j < a.size(); j++) {
//            String[] b = a.get(j).split(" ");
//            System.out.println(Arrays.toString(b));
//            int count = 1;
//            // тут обрабатываем строку
//            for (int i = 0, h = 0; i < b.length; i++) {
//
//                if (b[i].contains("#")) {
//                    hesh.add(b[i]); cnt.add(h, count);
//                    String q = b[i];
//
//                    count++;
//                    System.out.println(b[i]);
//
//
//                }
//
//            }
//        }
//        for (int i = 0; i < hesh.size(); i++) {
//
//
//            System.out.println("Count of text: " + hesh.get(i) + "\nсколько раз встречалось: " + cnt.get(i));
//
//        }

}


