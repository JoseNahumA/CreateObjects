import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(4);
        numbersList.add(2);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(6);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbersList);

        
        System.out.println("The numbers unique are: " + uniqueNumbers);
        }
    }

