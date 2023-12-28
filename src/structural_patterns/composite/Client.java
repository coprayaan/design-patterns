package structural_patterns.composite;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 50);
        File file3 = new File("file3.txt", 200);

        Directory subDirectory = new Directory("Subdirectory");
        subDirectory.addComponent(file1);
        subDirectory.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(file3);
        rootDirectory.addComponent(subDirectory);

        int totalSize = rootDirectory.getSize();
        System.out.println("Total size of the root directory: " + totalSize + " bytes");
    }
}
