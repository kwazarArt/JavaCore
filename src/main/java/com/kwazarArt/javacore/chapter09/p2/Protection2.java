package main.java.com.kwazarArt.javacore.chapter09.p2;

class Protection2 extends main.java.com.kwazarArt.javacore.chapter09.p1.Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");
        //System.out.println("n = " + n);
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
