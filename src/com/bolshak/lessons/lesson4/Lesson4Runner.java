package com.bolshak.lessons.lesson4;

public class Lesson4Runner {
    public static void main(String[] args) {
      String str1= "Hello";
      String str2 = "World";
      print(findChars(str1,str2));
    }

    private static String findChars (String str1, String str2) {
        if (checkString(str1) && checkString(str2)) {
            String result = "";
            int length = str1.length();
            int index = 0;
            while (index < length) {
                char ch = str1.charAt(index);
                if (str2.indexOf(ch) >= 0 && !result.contains(String.valueOf(ch))) {
                    result = result + ch;
                }
                index++;
            }

            return result;
        }
        return null;
    }

    private static boolean checkString (String  s){
        return s !=null && s.length() != 0 && s.trim().length() !=0;
    }

    private static void print (String s) {
        System.out.println(s);
    }
}
