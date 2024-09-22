/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modifier.static_final;

/**
 *
 * @author ndhlt
 */
public class Staff {
    String name;
    int role;
    static int staffCount = 0;
    static final int ADMIN = 0;
    static final int CULI = 1;

    public Staff(String name, int role) {
        this.name = name;
        this.role = role;
        staffCount++;
    }

    public Staff() {
        staffCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
}
