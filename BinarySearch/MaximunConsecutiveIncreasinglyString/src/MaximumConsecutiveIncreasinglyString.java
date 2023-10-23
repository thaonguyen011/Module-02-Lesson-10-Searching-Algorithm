import java.util.LinkedList;
import java.util.Scanner;

public class MaximumConsecutiveIncreasinglyString {
    public static String find(String s) {
        String result = "";
        StringBuilder temp = new StringBuilder();
        s = s + " ";
        temp.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(i-1)) {
                temp.append(s.charAt(i));
            } else {
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
//                temp.delete(0, temp.length());
//                temp.append(s.charAt(i));
                temp = new StringBuilder(String.valueOf(s.charAt(i)));
            }
        }
       return result;

    }
    public static void main(String[] args) {
        System.out.println(find("abcabcdgabxy"));
        System.out.println(find("abcabcdgabmnsxy"));

        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) { 		//1 Vòng lặp
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear(); //1 câu lệnh
            }

            list.add(string.charAt(i)); // 1 câu lệnh

            if (list.size() > max.size()) { // 1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }

        // Hiển thị chuỗi liên tiếp dài nhất
        for (Character ch: max) { // 1 vòng lặp
            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
}