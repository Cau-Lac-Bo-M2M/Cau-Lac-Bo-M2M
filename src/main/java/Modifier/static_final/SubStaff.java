/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modifier.static_final;

/**
 *
 * @author ndhlt
 */
public class SubStaff extends Staff {
    @Override
    public String getName() {
        return name + this.getClass().getSimpleName();
    }
}
