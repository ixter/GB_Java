package controlwork_my;

public class Main {
    public static void main(String[] args) {
        RedBlackTree<String> tree = new RedBlackTree<>();
        tree.add("a");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("h");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("o");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("b");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("c");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("d");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("f");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("e");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        tree.add("x");
        System.out.println("-------------------------");
        tree.print(tree.root, "");
        System.out.println("-------------------------");
    }
}