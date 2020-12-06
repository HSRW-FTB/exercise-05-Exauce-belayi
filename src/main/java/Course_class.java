class Course_class{
  private String id;
  private String name;
  private Professor lecturer;
  private int credit;
  
  private Course(){
  }
  
  Course(String id, String name, Professor lecturer, int credit){
    this.id = id;
    this.name = name;
    this.lecturer = lecturer;
    this.credit = credit;
  }
  public String getID(){
    return id;
  }
  public void setName(String newName){
    this.name = newName;
  }
  public String getName(){
    return this.name;
  }
  public void setLecturer(Professor newLecturer){
    this.lecturer = newLecturer;
  }
  public Professor getLecturer(){
    return lecturer;
  }
  public void setCredit(int newCaredit){
    this.credit = newCredit
  }
  public int getCredit(){
    return credit;
  }
  
}
