package Chain100Days;

public class FileProcessor {

    public void process(String fileName){
        System.out.println("Processing file: " + fileName);
    }

    public void process(String fileName, String encoding){
        System.out.println("Processing file: " + fileName + " with encoding: " + encoding);
    }

    public void process(String fileName, int retryCount){
        System.out.println("Processing file: " + fileName + " with retries: " + retryCount);
    }
}

class TextFileProcessor extends FileProcessor{
    @Override
    public void process(String fileName){
        System.out.println("Processing TEXT file: " + fileName);
    }
}

class ImageFileProcessor extends FileProcessor{
    @Override
    public void process(String fileName){
        System.out.println("Processing IMAGE file: " + fileName);
    }
}

