/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modifier.Shelby;

import Modifier.Kadarshian.PapaKadarshian;

/**
 *
 * @author ndhlt
 */
public class YoungShelby {
    public static void main(String[] args) {
        MamaShelby mamaShelby = new MamaShelby();
        YoungShelby youngShelby = new YoungShelby();
        mamaShelby.kiss(youngShelby);
        
        //Không thể access thuộc tính protected
//        PapaKadarshian papa = new PapaKadarshian();
//        System.out.println(papa.familyName);
    }
}
