package zad29;

public class Tree extends Plant implements Comparable<Tree>{

    private int height;

    public Tree(int height) {
        this.height= height;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+" "+height;
    }

    @Override
    public int compareTo(Tree obj)
    {
        return Integer.compare(this.height, obj.height);

    }
}
