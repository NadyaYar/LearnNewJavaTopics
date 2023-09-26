package string;

public class Regex {

    public static void main(String[] args) {

        int b = 011101;

        String binary = Integer.toBinaryString(b);

        System.out.println(binary.matches("[0-1]+"));

        String dex = "10F";

        System.out.println(dex.matches("[0-9A-F]+"));

        String date = "12/22/2023";

        System.out.println(date.matches("([1-9]|1\\d|2[0-9]|30|31)\\W{1}([1-9]|10|11|12)\\W{1}\\d{4}"));

        String symbols = "123qwe$#%7#fhd!";

        System.out.println(symbols.replaceAll("\\W",""));

        String space = "hgjr  jhl  hgf  hk ";

        System.out.println(space.replaceAll("\\s+"," ").trim());

        String num = "words12qwer";

        System.out.println(num.replaceAll("\\d",""));

        String [] words = space.split("\\s");

        System.out.println(words.length);
    }
}
