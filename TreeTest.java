import java.util.Scanner;

public class TreeTest {
    public static void Menu() {
        System.out.println("1 - Insert Value");
        System.out.println("2 - Print the Tree");
        System.out.println("3 - Print the Tree (by level)");
        System.out.println("4 - Quit");
    }

    public static void main(String[] args) {
        System.out.println("Binary Search Trees");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Tree tree = new Tree();
        boolean isAlive = true;
        int status = 0, choice = 0;

        while (isAlive) {
            Menu();
            status = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception exception) {
                System.out.println("Integers Only - Enter Again");
                status = 1;
            }

            switch (choice) {
                case 1:
                    System.out.println("Input Value");
                    int input = scanner1.nextInt();
                    tree.insert(input, tree.getRoot());
                    break;
                case 2:
                    if (tree.isEmpty()) {
                        System.out.println("The tree is empty");
                    } else {
                        tree.outputTree(tree.getRoot(), 0);
                    }
                    break;
                case 3:
                    if (tree.isEmpty()) {
                        System.out.println("The tree is empty");
                    } else {
                        tree.printTreeByLevel(tree.getRoot());
                    }
                    break;
                case 4:
                    isAlive = false;
                    System.out.println("End of Program");
                    break;
                default:
                    System.out.printf("'%d' is invalid.\n", choice);
                    break;
            }
            System.out.println("\n");
        }
    }
}
