package stringpalidrom;

public class StringPalidrom {
    public static void main(String[] args) {
        System.out.println(isPalidrome("madam"));
    }


    public static boolean isPalidrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

}


