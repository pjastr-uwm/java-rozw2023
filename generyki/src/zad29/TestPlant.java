package zad29;

public class TestPlant {

    public static void main(String[] args) {
        Tree[] t1 = new Tree[4];
        t1[0] = new Tree( 45);
        t1[1] = new Tree( 45);
        t1[2] = new Tree( 55);
        t1[3] = new Tree( 12);
        Pair<Tree> temp = new Pair<>(null, null);
        findMinMaxHeight(t1, temp);
        System.out.println(temp.getFirst());
        System.out.println(temp.getSecond());
        //zastosuj metodę findMinMaxHeight dla plant
        Pair<Plant> temp2 = new Pair<>(null, null);
        findMinMaxHeight(t1, temp2);
        System.out.println(temp2.getFirst());
        System.out.println(temp2.getSecond());

     
    }

    public static void findMinMaxHeight(Tree[] array, Pair<? super Tree> result){
        Tree min = array[0];
        Tree max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        result.setFirst(max);
        result.setSecond(min);
    }
}
