import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ShootoutCounting {
    public static void main(String... aArguments) {
        List<String> flavours = new ArrayList<>();
        flavours.add("chocolate");
        flavours.add("strawberry");
        flavours.add("vanilla");

        System.out.println(useWhileLoop(flavours));
    }

    private static String useWhileLoop(Collection<String> aFlavours) {
        Iterator<String> flavoursIter = aFlavours.iterator();
        int count = 0;
        while (flavoursIter.hasNext()) {
            if (count % 2 == 0){
                String str = flavoursIter.next();
                flavoursIter.remove();
            }
            count++;
        }
        return flavoursIter.toString();
    }

}
