package Chain100Days;

public class FileMain {
    public static void main(String[] args) {
        FileProcessor genericProcessor = new FileProcessor();
        FileProcessor textProcessor = new TextFileProcessor();
        FileProcessor imageProcessor = new ImageFileProcessor();

        //Overloading
        genericProcessor.process("data.txt");
        genericProcessor.process("data.txt", "UFT-8");
        genericProcessor.process("data.txt", 3);

        System.out.println("-----");

        //Overriding
        textProcessor.process("notes.txt");
        imageProcessor.process("photo.png");
    }
}

// Demonstrate method overloading and overriding in Java