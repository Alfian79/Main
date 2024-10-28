import java.util.*;

public class NinjaFruit {

    public static void main (String[]args){
        //1
        List<String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka");

        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Buah terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }
    public static int calculateTotalLength(List<String> words) {
        int totalLength = 0;
        //3. for (int i = 0; i <= words.size(); i++)
        for (int i = 0; i < words.size(); i++) {
            totalLength += words.get(i).length();
        }
        return totalLength;
    }
    //4.
    public static String findLongestWord(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong");
        }
        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
                //menghapus kondisi else if yang salah
                //Jika kondisi word.length() <= longestWord.length() terpenuhi, longestWord tidak perlu diperbarui.
            }
        }
        return longestWord;
    }

    public static List<String> capitalizeWords(List<String> words) {
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            //6
            capitalized.add(word.toUpperCase());
        }
        return capitalized;
    }

    public static List<Integer> wordLengths(List<String> words) {
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            //7. ubah if (word == null) menjadi if (word != null) untuk memastikan word tidak null sebelum menghitung panjangnya.
            if (word != null) {
                lengths.add(word.length());
            }
        }
        return lengths;
    }
}
