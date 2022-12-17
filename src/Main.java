public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500, 50);
        boss.weaponType.setWeaponType("weapon");
        boss.weaponType.setWeaponName("Infinity stones");
        System.out.println(boss.info());


        Skeleton skeleton = new Skeleton(100, 50, 20);
        skeleton.weaponType.setWeaponType("sword");
        skeleton.weaponType.setWeaponName("katana");
        System.out.println(skeleton.info());


        Skeleton skeleton1 = new Skeleton(150, 70, 40);
        skeleton1.weaponType.setWeaponType("sword");
        skeleton1.weaponType.setWeaponName("tecak");
        System.out.println(skeleton1.info());
    }
}
