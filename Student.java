class Student {

    String name;
    int id;
    double cgpa;

    Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Joti", 71, 3.61);
        s1.showDetails();
    }
}