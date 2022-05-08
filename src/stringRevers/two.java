package stringRevers;

public class two {
    public static void main(String[] args) {
        String string="Hello";
        String reverse="";
        for (int i = string.length()-1; i >=0 ; i--) {
            reverse=reverse+string.charAt(i);

        }
        System.out.println(reverse);
    }
}
