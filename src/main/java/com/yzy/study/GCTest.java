package com.yzy.study;

import java.lang.ref.WeakReference;

public class GCTest {
    private static final int _1MB = 1024 * 1024;


    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M 新生区占用 -XX:+PrintGCDetails -XX:SurvivorRatio=8  eden区占比
     -XX:MaxTenuringThreshold=15
     * -XX:+PrintTenuringDistribution
     */

    /**
     * Heap
     *  PSYoungGen      total 9216K, used 4480K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
     *   eden space 8192K, 54% used [0x00000000ff600000,0x00000000ffa60378,0x00000000ffe00000)
     *   from space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
     *   to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
     *  ParOldGen       total 10240K, used 8893K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
     *   object space 10240K, 86% used [0x00000000fec00000,0x00000000ff4af450,0x00000000ff600000)
     *  Metaspace       used 3104K, capacity 4486K, committed 4864K, reserved 1056768K
     *   class space    used 322K, capacity 386K, committed 512K, reserved 1048576K
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        /**
         * 为了能更好地适应不同程序的内存状况，HotSpot虚拟机并不是永远要求对象的年龄必须达到XX：MaxTenuringThreshold才能晋升老年代，如果在Survivor空间中相同年龄所有对象大小的总和大于
         * Survivor空间的一半，年龄大于或等于该年龄的对象就可以直接进入老年代，无须等到-XX：
         * MaxTenuringThreshold中要求的年龄。
         */
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        WeakReference a = new WeakReference(new byte[2 * _1MB]);
        WeakReference b = new WeakReference(new byte[2 * _1MB]);
        WeakReference c = new WeakReference(new byte[2 * _1MB]);
        WeakReference d = new WeakReference(new byte[2 * _1MB]);
        WeakReference e = new WeakReference(new byte[2 * _1MB]);
        WeakReference f = new WeakReference(new byte[2 * _1MB]);
        WeakReference g = new WeakReference(new byte[2 * _1MB]);
        WeakReference h = new WeakReference(new byte[2 * _1MB]);
        WeakReference i = new WeakReference(new byte[2 * _1MB]);
        WeakReference j = new WeakReference(new byte[2 * _1MB]);
        WeakReference k = new WeakReference(new byte[2 * _1MB]);
        WeakReference l = new WeakReference(new byte[2 * _1MB]);
        WeakReference m = new WeakReference(new byte[2 * _1MB]);
        WeakReference n = new WeakReference(new byte[2 * _1MB]);
        WeakReference o = new WeakReference(new byte[2 * _1MB]);
        WeakReference p = new WeakReference(new byte[2 * _1MB]);
        WeakReference q = new WeakReference(new byte[2 * _1MB]);
        WeakReference r = new WeakReference(new byte[2 * _1MB]);
//        System.gc();
//        Thread.sleep(3000L);
        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(c.get());
        System.out.println(d.get());
        System.out.println(e.get());
        System.out.println(f.get());
        System.out.println(g.get());
        System.out.println(h.get());
        System.out.println(i.get());
        System.out.println(j.get());
        System.out.println(k.get());
        System.out.println(l.get());
        System.out.println(m.get());
        System.out.println(n.get());
        System.out.println(o.get());
        System.out.println(p.get());
        System.out.println(q.get());
        System.out.println(r.get());

//        allocation3 = new byte[2 * _1MB];
//        allocation1 = null;
//        allocation4 = new byte[2 * _1MB];
//        allocation5 = new byte[2 * _1MB];
//        allocation6 = new byte[2 * _1MB];
//        allocation4 = null;
//        allocation5 = null;
//        allocation6 = null;
//        allocation7 = new byte[2 * _1MB];
//        System.gc();
    }
}
