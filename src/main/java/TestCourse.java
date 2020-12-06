public class TestCourse{
  public static void main(String args[] ){
  Course course1 = new Course(String id, String name, Professor lecturer, int credit);

  System.out.println("The course name is ," + course1.getName() + "The lecturer is ," + course1.getLecturer());
  System.out.println("The course id is ," + course1.getID() + "The course credit is ," + course1.getCredit());
  }
}
