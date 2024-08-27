/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab14soal1;

/**
 *
 * @author Lenovo
 */
abstract class AbstrakHewan {
    public abstract void suara();
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}
class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}
class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}