public class SubjectData {
    public static String[][] getJavaConcepts() {
        return new String[][] {
                {"OOPs", "Object-Oriented Programming includes Inheritance, Encapsulation, Abstraction, and Polymorphism."},
                {"JVM", "Java Virtual Machine converts bytecode into machine code."},
                {"Exception", "Used to handle runtime errors using try-catch blocks."}
        };
    }

    public static String[][] getDBMSConcepts() {
        return new String[][] {
                {"Normalization", "Process of organizing data to reduce redundancy."},
                {"SQL vs NoSQL", "SQL databases are structured, NoSQL are unstructured or semi-structured."},
                {"Transaction", "A unit of work that is performed against a database (ACID properties)."}
        };
    }

    public static String[][] getOSConcepts() {
        return new String[][] {
                {"Process", "An instance of a program in execution."},
                {"Deadlock", "When two or more processes are waiting for each other indefinitely."},
                {"Paging", "Memory management scheme that eliminates the need for contiguous memory."}
        };
    }
}
