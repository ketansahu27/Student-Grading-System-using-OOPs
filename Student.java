public class Student {
  String name;
  int[] marks; 

  // Constructor
  public Student(String name, int[] marks) {
    this.name  = name;
    this.marks = marks;
  }

  // Method to calculate average marks
  public double calculateAverage() {
    int sum = 0;
    for (int m : marks) sum += m;
    return (double) sum / marks.length;
  }

  // conditional logic to assign grade
  public String assignGrade() {
    double avg = calculateAverage();
    if      (avg >= 90) return "A";
    else if (avg >= 75) return "B";
    else if (avg >= 60) return "C";
    else if (avg >= 50) return "D";
    else                return "F";
  }

  // Display details
  public void display() {
    System.out.println("Name          : " + name);
    System.out.println("Average Marks : " + calculateAverage());
    System.out.println("Grade         : " + assignGrade());
  }

  // Main method 
  public static void main(String[] args) {
    int[] marks = {85, 72, 90, 67, 88};
    Student s = new Student("Aryan Sharma", marks);
    s.display();
  }
}