public class Task3{   
    public static void main (String [] args){
        String a = "Wow";
        String b = a;
        String c =  "Ok";
        String d = "Wow!";

boolean b1 = a == b;
boolean b2 = d.equals(b + "!");
boolean b3 = !c.equals(a);

if (b1 && b2 && b3) {
    // b1 true, b2 true, b3 true
    System.out.println("Success!");}
}
}