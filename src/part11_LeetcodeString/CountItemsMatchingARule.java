package part11_LeetcodeString;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");

        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");

        List<List<String>> items = new ArrayList<>();
        items.add(list1);
        items.add(list2);
        items.add(list3);


        String ruleKey = "type";
        String ruleValue = "phone";
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            if (ruleKey.equals("type") && ruleValue.equals(item.get(0))) {
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(item.get(1))) {
                count++;
            } else if (ruleKey.equals("name") && ruleValue.equals(item.get(2))) {
                count++;
            }
        }
        return count;
    }
}

 /*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.


 */