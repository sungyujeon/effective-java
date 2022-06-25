package com.effectiveJava.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // CPU intensive 작업들
        // thread n만큼 스레드를 실행
//        int numberOfCpu = Runtime.getRuntime().availableProcessors();  // CPU 갯수
//        ExecutorService service = Executors.newFixedThreadPool(numberOfCpu);  // blocking queue 사용
//        ExecutorService service = Executors.newCachedThreadPool();  // 작업을 위한 공간이 하나 queue에 들어오자마자 쓰레드 할당(스레드가 무한정 늘어날 수 있음)
//        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newScheduledThreadPool(10);

//        for (int i = 0; i < 100; i++) {
//            service.submit(new RunnableTask());
//        }

        // callable
        Future<String> submit = service.submit(new CallableTask());  //non blocking

        System.out.println(Thread.currentThread() + "hello");

        System.out.println(submit.get());  // blocking 시작

        service.shutdown();
    }

    static class RunnableTask implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread() + " world");
        }
    }

    static class CallableTask implements Callable {

        @Override
        public Object call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }
}
