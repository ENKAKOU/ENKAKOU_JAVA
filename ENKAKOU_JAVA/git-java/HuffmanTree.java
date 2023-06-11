import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HuffmanTree {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            int ans = 0;

            while (list.size() > 1) {
                Collections.sort(list);
                int tmp = list.get(0) + list.get(1);
                ans += tmp;

                list.add(tmp);
                list.remove(0);
                list.remove(0);
            }
            System.out.println(ans);
        }
        in.close();
    }
}

