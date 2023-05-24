package part6;

public class StringTypes {
    public static void main(String[] args) {
        StringBuffer strBff = new StringBuffer("stringbuffer");
        StringBuilder strBld = new StringBuilder("stringbuilder");
        String str = new String("string");

        System.out.println(strBff);
        System.out.println(strBld);
        System.out.println(str);

        strBff.append(" 2");
        System.out.println(strBff);
        strBff.append(1);
        System.out.println(strBff);
        strBff.delete(2,4);
        System.out.println(strBff);
        strBff.substring(7);
        System.out.println(strBff);
        strBff.reverse();
        System.out.println(strBff);


        strBld.append(" v");
        System.out.println(strBld);
        strBld.append(4);
        System.out.println(strBld);
        strBld.delete(3,5);
        System.out.println(strBld);
        strBld.substring(2,5);
        System.out.println(strBld);
        strBld.reverse();
        System.out.println(strBld);


    }
}
