package org.example;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class GetGenericTypeThroughReflect {

    public void genericParameters(Map<Integer, String> map, List<String> list) {};

    public Map<Integer, String> genericReturn(){return null;};

    public static void main(String[] args) {
        try {
            Method method1 = GetGenericTypeThroughReflect.class.getMethod("genericParameters", Map.class, List.class);

            Type[] parameterTypes = method1.getGenericParameterTypes();

            for(Type parameterType : parameterTypes) {
                System.out.println(parameterType);

                if(parameterType instanceof ParameterizedType) {

                    Type[] genericTypes = ((ParameterizedType) parameterType).getActualTypeArguments();

                    for(Type genericType : genericTypes) {
                        System.out.println(genericType);
                    }
                }
            }

            System.out.println("------------------");

            Method method2 = GetGenericTypeThroughReflect.class.getMethod("genericReturn", null);

            Type returnType = method2.getGenericReturnType();

            System.out.println(returnType);

            if(returnType instanceof ParameterizedType) {

                Type[] genericTypes = ((ParameterizedType) returnType).getActualTypeArguments();

                for(Type genericType : genericTypes) {
                    System.out.println(genericType);
                }
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
