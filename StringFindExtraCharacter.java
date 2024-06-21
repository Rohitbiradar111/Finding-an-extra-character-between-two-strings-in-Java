//This program finds an extra character present in a String in Java

public class StringFindExtraCharacter {
    public static void main(String args[])
    {
        String str = "abcd";
        String str1 = "abcde";
        int res = 0;
        for(int i=0;i<str.length();i++)
        {
            res = res ^ str.charAt(i) ^ str1.charAt(i);
        }
        res = res ^ str1.charAt(str.length());
        System.out.println("Extra Character = "+((char)res));
    }
}