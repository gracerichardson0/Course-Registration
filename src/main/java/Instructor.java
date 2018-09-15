public class Instructor {
   private String firstName;
   private String lastName;
   private String officeNumber;
   
   public Instructor(String firstName, String lastName, String officeNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.officeNumber = officeNumber;
   }
   
   public String getFirstName() { return this.firstName; }
   public String getLastName() { return this.lastName; }
   public String getOfficeNumber() { return this.officeNumber; }   
   
   public boolean setFirstName(String firstName) {
      if (firstName.equals("")) {
         return false;
      }
      else {
         this.firstName = firstName;
         return true;
      }
   }

   public boolean setLastName(String lastName) {
      if (lastName.equals("")) {
         return false;
      }
      else {
         this.lastName = lastName;
         return true;
      }
   }
   
   public boolean setOfficeNumber(String officeNumber) {
      if (officeNumber.equals("")) {
         return false;
      }
      else {
         this.officeNumber = officeNumber;
         return true;
      }
   }
   
   public String toString() {
      return "Name: " + this.getFirstName() + " " + this.getLastName()
         + "\nOffice Number: " + this.getOfficeNumber();   
   }      
}

