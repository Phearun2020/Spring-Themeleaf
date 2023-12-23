package itc.i4gic.themeleaf;

public class User {
   private String userName;
   private String email;
   private String role;

   public User(String userName, String email, String role) {
      this.userName = userName;
      this.email = email;
      this.role = role;
   }

   public String getUserName() {
      return userName;
   }

   public String getEmail() {
      return email;
   }

   public String getRole() {
      return role;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setRole(String role) {
      this.role = role;
   }


}
