package app;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo {
    String name();
    String returnType();
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String firstName();
    String lastName();
}

public class ArrayUtils {
    @MethodInfo(name = "sum", returnType = "int", description = "Calculates the sum of array elements.")
    @Author(firstName = "Viktoria", lastName = "Melnyk")
    public int sum(int[] array) {
        int result = 0;
        for (int num : array) {
            result += num;
        }
        return result;
    }

    @MethodInfo(name = "max", returnType = "int", description = "Finds the maximum value in the array.")
    @Author(firstName = "Viktoria", lastName = "Melnyk")
    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @MethodInfo(name = "min", returnType = "int", description = "Finds the minimum value in the array.")
    @Author(firstName = "Viktoria", lastName = "Melnyk")
    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
