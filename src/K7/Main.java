package K7;

public class Main {

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "B";

        System.out.println(s2.compareTo(s1));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s2));
        System.out.println(s2.compareTo(s4));
        System.out.println((int)s2.charAt(0));
        System.out.println((int)s4.charAt(0));


        System.out.println("Das ist ein String".charAt(4));
        String s5 = "Das ist ein netter String";
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());

        int i1 = 23;
        System.out.println(String.valueOf(i1)+5);
        System.out.println(i1+5);
        System.out.println(i1+""+5);

        StringBuilder sb = new StringBuilder("Hallo Welt");
        sb.append("23");
        System.out.println(sb);
        sb.insert(4,"Neu");
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);

        //Substring
        String sub = "Hallo Welt";
        System.out.println(sub.substring(5));
        System.out.println(sub.substring(5, 7));


    }
}
