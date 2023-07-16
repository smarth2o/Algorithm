import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> S = new ArrayList<>();
        List<Character> T = new ArrayList<>();

        String sInput = scanner.nextLine();
        for (char c : sInput.toCharArray()) {
            S.add(c);
        }

        String tInput = scanner.nextLine();
        for (char c : tInput.toCharArray()) {
            T.add(c);
        }

        while (S.size() != T.size()) {
            if (T.get(T.size() - 1) == 'A') {
                T.remove(T.size() - 1);
            } else if (T.get(T.size() - 1) == 'B') {
                T.remove(T.size() - 1);
                Collections.reverse(T);
            }
        }

        if (S.equals(T)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}