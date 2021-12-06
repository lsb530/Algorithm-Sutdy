package programmers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import programmers.SolvedTime;

public class SolvedUtil {

    public static void printExecutionTime(String className) throws Exception {
        Class<?> c = Class.forName(className);
        for (Method method : c.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {

                if (annotation instanceof SolvedTime) {
                    System.out.println(method);
                    long startTime = System.currentTimeMillis();
                    method.invoke(c.newInstance());
                    long endTime = System.currentTimeMillis();
                    System.out.println("That took " + (endTime - startTime) + " milliseconds");
                }
            }
        }
    }
}