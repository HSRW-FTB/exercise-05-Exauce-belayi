public class TestCourse{
  public static void main(String args[] ){
  
    Professor prof1  = new Professor("xyq", "X", "Yq");
    Course oop = new Course("EL-2309", "Object Oriented Programming", prof1, 5);

  System.out.println("The course name is ," + course1.getName() + "The lecturer is ," + course1.getLecturer());
  System.out.println("The course id is ," + course1.getID() + "The course credit is ," + course1.getCredit());
  }
}
