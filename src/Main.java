public class Main {
    public static void main(String[] args) {
        BinaryHeap b=new BinaryHeap(5);
        b.levelOrder();
        b.insert(10,"Max");
        b.insert(5,"Max");
        b.insert(15,"Max");
        b.insert(1,"Max");
        System.out.println();
        b.levelOrder();
        System.out.println();
        b.extractHead("Max");
        System.out.println();
        b.levelOrder();
        System.out.println();
        b.deleteBH();
        System.out.println();
        b.levelOrder();


    }
}