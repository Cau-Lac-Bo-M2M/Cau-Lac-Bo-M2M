/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modifier.Kadarshian;

import Modifier.Kadarshian.PapaKadarshian;

/**
 *
 * @author ndhlt
 */
public class YoungKadarshian extends PapaKadarshian {
    public static void main(String[] args) {
        //Chỉ access được thuộc tính được kế thừa
        YoungKadarshian papa = new YoungKadarshian();
//        PapaKadarshian papa = new PapaKadarshian();
        System.out.println(papa.familyName);
//        System.out.println(papa.maBank);
    }
}
