import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SolutionB {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int num = scanner.nextInt();

        List<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < count; i++)
            numList.add(scanner.nextInt());

        scanner.close();

        int index = getIndex(num, numList);

        if (index > 0)
            System.out.println(index);
        else
            System.out.println("NOT_FOUND");
    }

    static int getIndex(int num, List<Integer> numList) {
        AtomicInteger position = new AtomicInteger(0);

        numList.stream().peek(x -> position.incrementAndGet()).filter(x -> x == num).findFirst().get();

        return position.get();
    }

}
