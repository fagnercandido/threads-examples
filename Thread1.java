import java.util.stream.*;

public class Thread1 implements Runnable{

    public static void main(String[] args) {
        new Thread1().run();
        new Thread1().run();
        new Thread1().run();
    }

    public void contar() {
        IntStream.iterate(0, i -> i + 1).limit(10000).forEach(x -> System.out.println(x));
    }

    public void contarDeNovo() {
        synchronized (this) {
            IntStream.iterate(0, i -> i + 1).limit(900000).forEach(x -> System.out.println(x));
        }
    }

    public void run() {
        contar();
    }

}
