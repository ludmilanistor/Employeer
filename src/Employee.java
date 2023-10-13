public class Employee {

private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;    }

    public  String getName(){
        return name;
    }
    
  private int age;
    
   public Employee (int age) {}
        if (age > 0) {
            this.age = age;
       } else {
           System.out.println("Stagiu de lucru mai putin de un an nu sunt");
       }
   }
  public void setAge(int age) {
        if (age > 0) {
        this.age = age;
    } else {
        System.out.println("Stagiu de lucru mai putin de un an nu sunt");
    }
}
    public int getAge() {
        return age;}


private String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department){
        this.department = department;}

}
