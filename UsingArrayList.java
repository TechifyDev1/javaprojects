import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {

    public static void main(String[] args) {
        ArrayList<String> mArrayList = new ArrayList<String>();
        mArrayList.add("Ford");
        mArrayList.add("Mazda");
        mArrayList.add("Lexus");
        mArrayList.add("Camry");
        mArrayList.add(0, "BMW");
        System.out.println(mArrayList);
        System.out.println(mArrayList.get(3));
        mArrayList.set(3, "Modified lexus");
        System.out.println(mArrayList.get(3));
        System.out.println(mArrayList.size());
        mArrayList.remove(4);
        System.out.println(mArrayList.size());

        for (int i = 0; i < mArrayList.size(); i++) {
            System.out.println(mArrayList.get(i));
        }

        for (String i : mArrayList) {
            System.out.println(i);
        }

        Collections.sort(mArrayList);

        System.out.println(mArrayList);
    }
}