package com.xie.Day06.Mark_wordTest;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;
import static java.lang.System.out;

/**
 *
 * https://www.jianshu.com/p/9998a9db17f7
 */
public class Mark_Word {
    static A a;

    public static void main(String[] args) {

        System.out.println("计算hashCode之后................");
        //show_Hashcode();
        Testsyc();
    }


    public static void show_Hashcode() {
        A a = new A();
        //没有计算HashCode之前的对象头
        out.println("before hash");
        out.println(ClassLayout.parseInstance(a).toPrintable());

        //jvm计算HashCode
        out.println("jvm----------" + Integer.toHexString(a.hashCode()));

        //当计算完HashCode之后，我们可以查看对象头的信息变化
        out.println("after hash");
        out.println(ClassLayout.parseInstance(a).toPrintable());
    }

    public static void Testsyc(){
        a = new A();
        out.println("before lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    out.println("t1 release");
                }
            }
        });
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println("t1 lock ing");
        out.println(ClassLayout.parseInstance(a).toPrintable());

        sync();
        out.println("after lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());

        System.gc();
        out.println("after gc()");
        out.println(ClassLayout.parseInstance(a).toPrintable());
    }

    private static void sync() {
        synchronized (a) {
            out.println("main lock ing");
            out.println(ClassLayout.parseInstance(a).toPrintable());
        }

    }
}

