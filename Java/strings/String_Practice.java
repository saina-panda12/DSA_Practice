package strings;
//Two ways to Declare and Initialize String
public class String_Practice {

//    public static void main(String[] args) {
//
//        String str = "testing";
//        String str1 = "testing";
//        System.out.println(str);
//
//        String strobj = new String("testingwithobj");
//        System.out.println(strobj);
//    }


//String literal = String Pool = No duplication
//if same thing is trying to get stored in string pool its reference will be returned
public static void main(String[] args) {
    String str1 = "Hello,World";
    String str2 = "Hello,World";
    System.out.println("str1: "+ str1);
    System.out.println("str2:" +str2);

    //check if str1 and str2 reference to same object
    System.out.println("Are str1 and str2 the same object? "+(str1==str2));

    String str3 = new String("Hello");//String Heap
    String str4 = new String("Hello");//String Heap
    boolean result1 = (str3 == str4);
    boolean result2= str3.equals(str4);

    System.out.println(result1);
    System.out.println(result2);
    String strMethod1 = "testing";
    System.out.println(strMethod1.charAt(4));
    System.out.println("ABC".equalsIgnoreCase("abc"));
    System.out.println("ABC".equals("abc"));
    System.out.println("ABC".replace("C","A"));
    System.out.println("abcghjhjk".toUpperCase());
    System.out.println("ADFGTYUJJ".toLowerCase());
    System.out.println("    abvh   ".trim().equals("abvh"));
    System.out.println("apple".substring(0));
    System.out.println("apple".substring(1,4));
}
}

//the difference between == and equals() when comparing strings





