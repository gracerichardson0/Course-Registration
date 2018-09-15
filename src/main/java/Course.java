public class Course {
   private String courseName;
   private Instructor instructor;
   private Textbook textbook;
   
   public Course(String courseName)
   {
      this.courseName = courseName;
   }
   
   public Course(String courseName,Instructor instructor, Textbook textbook) {
      this.courseName = courseName;
      this.instructor = instructor;
      this.textbook = textbook;
   }
   
   public Instructor getInstructor(){ return this.instructor; }
   public Textbook getTextbook(){ return this.textbook; }
   
   public void setInstructor(Instructor instructor)
   {
      this.instructor = instructor;
   }
   
   public void setTextbook(Textbook textbook)
   {
      this.textbook = textbook;
   }

   public String getCourseName() { return this.courseName; }

   public boolean setCourseName(String courseName) {
      if (courseName.equals("")) {
         return false;
      }
      else {
         this.courseName = courseName;
         return true;
      }
   }
   
   public String toString() {
      return "**" + this.getCourseName() + "**\n" +
             "[INSTRUCTOR]\n"+ this.instructor.toString() + "\n\n" +
             "[TEXTBOOK]\n" + this.textbook.toString();
   }
}