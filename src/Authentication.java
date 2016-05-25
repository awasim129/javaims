/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anas
 */
public class Authentication {
    private String username,password,adminuser,adminpass;
    
    public Authentication() {
        username = "user";
        password = "humidity";
        adminuser = "admin";
        adminpass = "ims123";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAdminuser() {
        return adminuser;
    }

    public String getAdminpass() {
        return adminpass;
    }
    
    
    
    
}
