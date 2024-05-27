package org.hieunguyen.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman firstSwordsman = new Swordsman();
        firstSwordsman.move(new Point3D(-3, 3, 3), 30);
        firstSwordsman.attack();
        System.out.println("firstSwordsman = " + firstSwordsman);

        Swordsman secondSwordsman = (Swordsman) firstSwordsman.clone();
        System.out.println("firstSwordsman = " + firstSwordsman);
        System.out.println("secondSwordsman = " + secondSwordsman);
    }

}
