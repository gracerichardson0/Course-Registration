public class Textbook {
   private String title;
   private String edition;
   
   public Textbook(){}
   
   public Textbook(String title, String edition) {
      this.title = title;
      this.edition = edition;
   }
   
   public String getTitle() { return this.title; }
   public String getEdition() { return this.edition; }
   
   public boolean setTitle(String title) {
      if (title.equals("")) {
         return false;
      }
      else {
         this.title = title;
         return true;
      }
   }
   
   public boolean setEdition(String edition) {
      if (edition.equals("")) {
         return false;
      }
      else {
         this.edition = edition;
         return true;
      }
   }
   
   public String toString() {
      return "Title: " + this.getTitle()
         + "\nEdition: " + this.getEdition();
   }
}



