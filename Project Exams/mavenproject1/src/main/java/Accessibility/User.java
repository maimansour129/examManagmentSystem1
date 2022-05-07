
package Accessibility;

import java.util.ArrayList;

public abstract class User {
    
    private String name;
    private String username;
    private String password;
    public String role;

    public User(String name, String username, String password, String role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    
    public static User Login(String username, String pass, ArrayList<Student> allstuds,ArrayList<Teacher> allteachers,int choice){
        
          
        if(choice == 1){
            if(username.equals("Hoba") && pass.equals("69")){
                
                return Principle.getPrinciple();
            }
        }
        else if(choice == 2){
              for(int i=0; i<allteachers.size(); i++){
                    if(allteachers.get(i).getUsername().equals(username) && allteachers.get(i).getPassword().equals(pass)){
                        System.out.println("Hi teacher");
                        return allteachers.get(i);
                    }
                }
          }
          else if(choice == 3){
              for(int i=0; i<allstuds.size(); i++){
                    if(allstuds.get(i).getUsername().equals(username) && allstuds.get(i).getPassword().equals(pass)){
                        System.out.println("HI");
                        return allstuds.get(i);
                    }
                }
          }
        return null;
        
          //StudentLogin(username, pass, allstuds);
          
//        if(this.username.equals(username) && this.password.equals(pass)){
//            
//    
    }
   
    
   
}