package com.effectiveJava.chapter01.item06;

/**
 * - Mark, Sweep, Compact
 * - Young Generation (Eden, S0, S1), Old Generation
 * - Minor GC, Full GC
 *   Full GC mechanism >> Serial, Parallel(jdk 1.8), CMS(deprecated from jdk 9), G1(jdk 11), *ZGC*, Shenandoah
 * - GC를 보는 관점
 *   Throughput(처리량), 'Latency (Stop-The-World)'(어플리케이션이 멈추는 정도), Footprint(GC를 위해 얼만큼의 메모리가 필요한가)
 * - 참고 How to choose the best Java garbage collection
 */

public class GarbageCollection {

}
