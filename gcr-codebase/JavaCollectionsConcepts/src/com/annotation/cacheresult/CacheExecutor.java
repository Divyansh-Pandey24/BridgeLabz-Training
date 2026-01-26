package com.annotation.cacheresult;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    static Object invoke(Object obj, String methodName, Object... args) throws Exception {

        Method method = obj.getClass().getDeclaredMethod(methodName, int.class);

        if (method.isAnnotationPresent(CacheResult.class)) {

            String key = methodName + Arrays.toString(args);

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result");
                return cache.get(key);
            }

            Object result = method.invoke(obj, args);
            cache.put(key, result);
            System.out.println("Computed and cached result");
            return result;
        }

        return method.invoke(obj, args);
    }
}
