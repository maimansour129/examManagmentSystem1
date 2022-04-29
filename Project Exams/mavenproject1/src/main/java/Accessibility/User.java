
package Accessibility;
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
    public void Login(String username, String pass){
        if(this.username.equals(username) && this.password.equals(pass)){
            
        }
    }
}
