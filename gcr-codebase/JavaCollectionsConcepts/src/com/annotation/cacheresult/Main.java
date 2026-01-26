package com.annotation.cacheresult;
class Main {

    public static void main(String[] args) throws Exception {

        CalculatorService service = new CalculatorService();

        System.out.println(CacheExecutor.invoke(service, "slowSquare", 5));
        System.out.println(CacheExecutor.invoke(service, "slowSquare", 5));
        System.out.println(CacheExecutor.invoke(service, "slowSquare", 6));
    }
}
