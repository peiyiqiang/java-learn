import java.util.ArrayList;
import java.util.List;

/**
 * Created by peiyiqiang on 2020/6/19.
 * Description:
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.stream().forEach(l -> {
            if (l == 1) {
                System.out.println(l);
                return ;
            }
            System.out.println(l);
        });

    }

    public static int test() {
        int a = 130;
        return a / 3;
    }

}
