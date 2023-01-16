class Student {
    static String collegeName = "ABC College";
    static int IT_count = 0;
    static int Computer_count = 0;

    String name;
    int id;
    String branch;

    public Student(String name, int id, String branch) throws Exception {
        if (!branch.equals("IT") && !branch.equals("Computer")) {
            throw new Exception("Invalid branch. Only IT and Computer are allowed.");
        }
        this.name = name;
        this.id = id;
        this.branch = branch;
        if (branch.equals("IT")) {
            IT_count++;
        } else if (branch.equals("Computer")) {
            Computer_count++;
        }
        System.out.println(getITCount());
        System.out.println(getComputerCount());
    }

    public static int getITCount() {
        return IT_count;
    }

    public static int getComputerCount() {
        return Computer_count;
    }
}
public class st{
    public static void main(String args[]) throws Exception{
        Student s1 = new Student("Rishabh", 1, "Computer");
        Student s2 = new Student("Rishabh", 1, "Computer");
        Student s3 = new Student("Rishabh", 1, "Computer");
        Student s4 = new Student("Rishabh", 1, "Computer");

        // s1.getITCount();
        // s1.getComputerCount();

    }
}
