package com.yasar;

public class Runner {
    /**
     * Yönergeler
     * Menu diye bir sınıfnmız olsun
     * <p>
     * Corbalar Icecekler Yemekler ve Tatlılar için birer enum olustularım
     * <p>
     * icecek sayım 7 olsun
     * bu enumları menu sınfı içinde tutalım
     * <p>
     * yine gunlerimizi bir enumda tutabilirz
     * <p>
     * ve Manager sınfımız olsun
     * manager sınıfında her gune random bir menu belirleyeceğiz
     * her gun random bir corba icecek yemek ve tatlı olacak  pazartesiden pazara kadar ;
     * ve bu işlemler sonunda  menumuzu yazdıralım
     * (aynı degerler farklı gunlerde cıkabilir)
     * <p>
     * haftalık menuyu bir listede toplayabilirsiniz (opsiyonel)
     * <p>
     * extra
     * iceceklerimiz her gune sadece bir icecek gelecek şekilde olacak aynı hafta içinde aynı içecek bir daha cıkmayacak
     * Çalışmam
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showMenu();
        manager.menuList();

    }
}
