package part5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookAuthor {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Book6","Berat");
        map.put("Book7","Furkan");
        map.put("Book3","Kenan");
        map.put("Book2","Furkan");
        map.put("Book5","Kenan");
        map.put("Book1","Berat");
        map.put("Book4","Furkan");
        map.put("Book8","Furkan");
        System.out.println("collectBooks(map) = " + collectBooks(map));

    }
    static Map<String, List<String >> collectBooks(Map<String,String> oldMap){
        Map<String, List<String>> newMap = new HashMap<>();

        oldMap.forEach((book,author)->{
            List<String> bookList = new ArrayList<>();
            if (!newMap.containsKey(author)){
                bookList.add(book);
                newMap.put(author, bookList);
            } else {
                newMap.get(author).add(book);
                newMap.put(author, newMap.get(author));
            }
        });
        return newMap;
    }
}
