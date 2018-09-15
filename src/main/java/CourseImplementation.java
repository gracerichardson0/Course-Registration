import javax.swing.JOptionPane;
public class CourseImplementation {
   public static void main(String[] args) {

      final int MAX_COURSES = 2;
      Course[] catalog = new Course[MAX_COURSES];
      
      //Add courses to the catalog
      //Since there is no static counter in the Course class, we must track that
      //in the addCourses method and return the number added back to main
      int numCourses = addCourses(catalog);
      
      //Once the catalog has been populated, print it out
      printCatalog(catalog,numCourses);
   }      
   
   private static int addCourses(Course[] catalog)
   {
      //Create 2 courses and add them to the catalog
      int count = 0;
      
      //Add first course
      JOptionPane.showMessageDialog(null,"Adding first course to catalog");
      catalog[count++] = createCourse("Course 1","John","Smith","250");

      //Add second course
      JOptionPane.showMessageDialog(null,"Adding second course to catalog");
      catalog[count++] = createCourse("Course 2","Jane","Smith","230");
      
      return count;
   }
   
   private static Course createCourse(String courseName,String firstName, String lastName, String officeNumber)
   {
      //Instantiate a new course object
      Course course = new Course(courseName);
      course.setInstructor(addInstructor(firstName,lastName,officeNumber));
      course.setTextbook(addTextbook());
      
      return course;
   }
   
   private static Instructor addInstructor(String firstName, String lastName, String officeNumber)
   {
      //Instantiate an instructor object      
      Instructor instructor = new Instructor(firstName,lastName,officeNumber);
      
      //Prompting logic ommitted
      
      return instructor;
   }
   
   /*
      Object population via user input
      Compared to the method above which uses hard coding
   */
   private static Textbook addTextbook()
   {
      //Instantiate a textbook object
      Textbook textbook = new Textbook();

      //Prompt for the textbook title
      boolean valid = false;
      do
      {
         valid = textbook.setTitle(answerString("Enter textbook title"));
         if(!valid)
         {
            JOptionPane.showMessageDialog(null,"Please enter a valid title");
         }      
      }while(!valid);
      
      //Prompt for the textbook edition
      valid = false;
      do
      {
         valid = textbook.setEdition(answerString("Enter textbook edition"));
         if(!valid)
         {
            JOptionPane.showMessageDialog(null,"Please enter a valid edition");
         }      
      }while(!valid);
      
      return textbook;
   }
   
   private static void printCatalog(Course[] catalog, int numCourses)
   {
      String output = "Course Catalog: \n";
      for(int x=0; x < numCourses; x++)
      {
         output += catalog[x].toString() + "\n\n";   
      }
      
      JOptionPane.showMessageDialog(null,output);
   }
   
   public static String answerString(String prompt)
   {
      String input = "";
      do
      {
         input = JOptionPane.showInputDialog(prompt);
         if(input.equals(""))
         {
            JOptionPane.showMessageDialog(null,"Please enter a value");
         }
      }while(input.equals(""));
      
      return input;
   }
}