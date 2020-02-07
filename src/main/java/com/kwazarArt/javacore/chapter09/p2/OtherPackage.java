package main.java.com.kwazarArt.javacore.chapter09.p2;

class OtherPackage {
    OtherPackage() {
        main.java.com.kwazarArt.javacore.chapter09.p1.Protection p =
                new main.java.com.kwazarArt.javacore.chapter09.p1.Protection();
        System.out.println("Конструктор из другого пакета");
        //System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.n_pri);
        //System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
