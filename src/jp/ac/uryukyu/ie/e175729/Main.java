package jp.ac.uryukyu.ie.e175729;

public class Main {
    public static void main(String[] args) {
        {

            try {
                String str = "3．14";
                System.out.println(str.length());
                double value;
                Double.parseDouble(str);
            } catch (NullPointerException e) {
                System.out.println("NullPointerExceptionが発生しました");
                System.err.println(e.getMessage());
            }
        }
    }
}