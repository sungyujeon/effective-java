package com.effectiveJava.chapter02.item11;


/**
 * 1) 해시맵의 연결 리스트
 * 2) 해시 충돌이 더욱 적은 방법을 꼭 써야 한다면
 * 3) 클래스를 스레드 안전하게 만들도록 신경 써야 한다
 */
public class EtcApp {

    /* 해시맵 내부의 연결 리스트
    * 자바 8에서 해시 충돌 시 성능 개선을 위해 내부적으로 동일한 버켓에 일정 개수 이상의
    * 엔트리가 추가되면, 연결 리스트 대신 이진 트리를 사용하도록 바뀜
    * */

    /* 멀티스레드 환경에서 안전한 코드, Thread-safety
    * 가장 안전한 방법은 여러 스레드 간에 공유하는 데이터가 없는 것
    * 공유하는 데이터가 있다면
    * - Synchronization
    * - ThreadLocal
    * - 불변 객체 사용: hashMap(가변객체), hashTable(불변객체)-특정 hash값을 만들어 key로 관리하므로
    * - Synchronized 데이터 사용
    * - TODO Concurrent 데이터 사용
    *  */
    private volatile int result = 0; // volatile 사용 시 캐시가 아닌 main memory에 저장된 데이터를 참조

    public int updateResult(int val) {
//        int tmp = result;
//        tmp = 31 * val;
//        result = tmp;  // thread safe 하지 않지만, 같은 instance의 hashCode는 항상 같은 값을 반환할 것이므로 사실상 thread safe 하다
        if (this.result != 0)
            return result;

        synchronized (this) {
            if (result == 0) {
                // do sth
            }
            return result;
        }
    }


}
