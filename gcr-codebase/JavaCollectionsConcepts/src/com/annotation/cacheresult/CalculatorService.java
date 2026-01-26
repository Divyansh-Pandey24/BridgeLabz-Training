package com.annotation.cacheresult;
class CalculatorService {

    @CacheResult
    int slowSquare(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return x * x;
    }
}
