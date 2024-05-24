/**
  *
  * @author (32465092 MSM Dhlamini)
  * @version (1 September 2023)
  */
import java.util.Random;

public class MemoryGameTest {
    public static void main(String[] args) {
        MyArrayList<MemoryCard> list1 = new MyArrayList<>();
        MyArrayList<MemoryCard> list2 = new MyArrayList<>();
        MyArrayList<MemoryCard> list3 = new MyArrayList<>();
        MyArrayList<MemoryCard> list4 = new MyArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int value = random.nextInt(100); 
            MemoryCard card1 = new MemoryCard(value);
            MemoryCard card2 = new MemoryCard(value);
            list1.add(i, card1);
            list2.add(i, card2);
        }

        System.out.println("Is list1 full? " + list1.isFull());
        System.out.println("Is list2 full? " + list2.isFull());

        list3.add(0, new MemoryCard(42)); 
        list4.add(0, new MemoryCard(77));

        System.out.println("Is list1 all guessed? " + list1.isAllGuessed());
        System.out.println("Is list2 all guessed? " + list2.isAllGuessed());
        System.out.println("Is list3 all guessed? " + list3.isAllGuessed());
        System.out.println("Is list4 all guessed? " + list4.isAllGuessed());
    }
}
