package app;

import java.lang.reflect.Method;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;

        // Отримання методів класу ArrayUtils
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            // Перевірка наявності анотації MethodInfo
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method Name: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
            }

            // Перевірка наявності анотації Author
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
            }
            System.out.println("---------------------------------");
        }

        // Виклик методів для перевірки результатів
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] testArray = {1, 2, 3, 4, 5};

        System.out.println("Sum: " + arrayUtils.sum(testArray));
        System.out.println("Max: " + arrayUtils.max(testArray));
        System.out.println("Min: " + arrayUtils.min(testArray));
    }
}