/*

@Author : Yasir Karam

 */

package LMS;


public abstract class Account extends Person {

    private String password;
    private String role;

    public Account(String name, String password, String identifyNumber, String role) {
        super(name, identifyNumber); 
        this.password = password;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
