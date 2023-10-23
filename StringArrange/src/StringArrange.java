

public class StringArrange {
    public static String stringArrange(String s) {
     StringBuilder result = new StringBuilder();
     for (char c : sort(s)) {
         result.append(c);
     }
     return result.toString();
    }

    public static char[] sort(String s) {
        char[] chars = s.toCharArray();
        int noSwap = 0;
        int count = chars.length - 1;
        while (noSwap < count) {
            noSwap = 0;
            for (int i = 0; i < count ; i++) {
                if (chars[i] > chars[i + 1]) {
                    char temp = chars[i];
                    chars[i] = chars[i+1];
                    chars[i+1] = temp;
                } else noSwap++;
            }
        }
        return chars;
    }



    public static String maximumSub(String s) {
        if (s.isEmpty()) {
            throw new RuntimeException("null string");
        }
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        char temp = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (temp < s.charAt(i)) {
                result.append(s.charAt(i));
                temp = s.charAt(i);
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
//        System.out.println(stringArrange("Hello"));
//        System.out.println(stringArrange("world"));
//        System.out.println(stringArrange("Welcome"));
//        System.out.println(stringArrange("bca"));

        System.out.println(maximumSub("Welcome"));
        System.out.println(maximumSub("1"));
        System.out.println(maximumSub("ba"));
    }
}
