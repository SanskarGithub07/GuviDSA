package day3.comC;

public class Demo1 {
    public static void main(String[] args) {
        String name = "  Sanskar";
        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);
        String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);
        System.out.println(name.length());
        System.out.println(name.trim().length());
        System.out.println(name.length());

        System.out.println(name.replace('S', 's'));
        System.out.println(name.charAt(5));

        System.out.println(name.startsWith("a"));
        System.out.println(name.substring(1, 4));
        System.out.println(name.trim().concat(" Sugandhi"));

        System.out.println(name.contains("kar"));
        System.out.println(name.equals("Sanskar"));
        System.out.println("Sanskar".equalsIgnoreCase("sanskar"));

        StringBuffer sb = new StringBuffer("Sachin");
                sb.append("Kumar");
        System.out.println(sb);
        sb.insert(0, "Mr");
        System.out.println(sb);
        sb.delete(9, 14);

        System.out.println(sb); // Can also use System.err.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String str = "Madam";
        String reversed = new StringBuffer(str).reverse().toString();
        System.out.println(reversed);

        if(str.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        String str2 = "Java is a programming language";
        String words[] = str2.split("\\s");
        System.out.println(words.length);
        String longest = "";
        for(String word: words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }

        System.out.println("Longest word in the given sentence is:" + longest);
        int vowels = 0;
        int consonents = 0;
        for(char ch : str2.toCharArray()){
            if("aeiou".contains(String.valueOf(ch))){
                vowels++;
            }
            else{
                consonents++;
            }
        }

        System.out.println(vowels + " " + consonents);
    }
}