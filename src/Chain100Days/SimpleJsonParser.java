package Chain100Days;

public class SimpleJsonParser {

    public String parseName(String json) {

        if (json == null || !json.contains("name")){
            throw new IllegalArgumentException("Invalid JSON");
        }

        int start = json.indexOf("\"name\"") + 7;
        int colon = json.indexOf(":", start);
        int firstQuote = json.indexOf("\"", colon + 1);
        int secondQuote = json.indexOf("\"", firstQuote + 1);

        return json.substring(firstQuote + 1, secondQuote);
    }
}

// Write a JUnit test for a method that parses JSON