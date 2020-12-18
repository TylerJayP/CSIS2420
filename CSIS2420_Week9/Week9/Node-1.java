package Week9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Node {
    private Node root, left, right;
    private int key;
    private String val;

    public Node(int key, String val) {
        this.key = key;
        this.val = val;
    }

    public Node() {
    }

    public void buildUsersTree() throws IOException {
        BufferedReader bufferedReader;
        String dataFile;
        int numLines;

        dataFile = "C:\\Users\\tyler\\Desktop\\Users.csv";
        bufferedReader = null;
        numLines = 0;
        try (FileReader fileReader = new FileReader(dataFile)) {
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                numLines++;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println();
            System.out.println("The system cannot find the path specified. " +
                    "Please change the path for your environment.");
            System.exit(0);
        }

        try (FileReader fileReader = new FileReader(dataFile)) {
            bufferedReader = new BufferedReader(fileReader);
            for (int i = 0; i < numLines; i++) {
                String[] account = bufferedReader.readLine().split(",");
                this.insert(Integer.parseInt(account[0]), account[1]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The system cannot find the path specified. " +
                    "Please change the path for your environment.");
        }
        System.out.println();
        System.out.println("Finished building the tree.");
        System.out.println();
    }

    private void insert(int key, String val) {
        root = insert(root, key, val);
    }

    private Node insert(Node node, int key, String val) {
        if (node == null) {
            return new Node(key, val);
        }
        if (key < node.key) {
            node.left = insert(node.left, key, val);
        } else if (key > node.key) {
            node.right = insert(node.right, key, val);
        } else {
            node.val = val;
        }
        return node;
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        int count;

        count = 0;
        if (node == null) return 0;
        count++;
        count += (size(node.left) + size(node.right));
        return count;
    }

    public void searchByIP(int key) {
        String val;

        val = searchByIP(root, key);
        System.out.println();
        if (val != null) {
            System.out.println("Found: 10.0.0." + key + " " + val);
        } else {
            System.out.println("IP 10.0.0." + key + " not found");
        }
        System.out.println();
    }

    private String searchByIP(Node node, int key) {

        if (node == null) {
            return null;
        }

        if (key < node.key) {
            return searchByIP(node.left, key);
        } else if (key > node.key) {
            return searchByIP(node.right, key);
        } else {
            return node.val;
        }
    }

    public void searchByName(String name) {
        int key;

        key = searchByName(root, name);
        System.out.println();
        if (key > 0) {
            System.out.println("Found: 10.0.0." + key + " " + name);
        } else {
            System.out.println("User " + name + " not found");
        }
        System.out.println();
    }

    private int searchByName(Node node, String name) {
        int left, right;

        if (node == null) return 0;
        if (node.val.equals(name)) {
            return node.key;
        } else {
            left = searchByName(node.left, name);
            right = searchByName(node.right, name);
            if (left != 0) {
                return left;
            } else {
                return right;
            }
        }
    }

    public void printTree() {
        printTree(root);
    }

    private void printTree(Node node) {

        if (node == null) return;
        printTree(node.left);
        System.out.println("10.0.0." + node.key + " " + node.val);
        printTree(node.right);
    }
}
