

package com.mycompany.typecasting;


public class TypeCasting {

    public static void main(String[] args) {
     double d = 35.25, dd = 35.99;
        int i = (int) d;
        int ii = (int) dd;
        System.out.println("Explicit Casting:");
        System.out.println("Double to Int (35.25 -> " + i + ", 35.99 -> " + ii + ")\n");

        int num = 35;
        float f = num;
        System.out.println("Implicit Casting:");
        System.out.println("Int to Float (35 -> " + f + ")\n");

        System.out.println("Performance Test:");
        long start1 = System.currentTimeMillis();
        Integer sumObject = 0;
        for (int j = 0; j < 100_000; j++) {
            sumObject += j;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Object Type Sum: " + sumObject + " (Time: " + (end1 - start1) + " ms)");

        long start2 = System.currentTimeMillis();
        int sumPrimitive = 0;
        for (int j = 0; j < 100_000; j++) {
            sumPrimitive += j;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Primitive Type Sum: " + sumPrimitive + " (Time: " + (end2 - start2) + " ms)\n");

        System.out.println("Handling null values:");
        Integer objInt = 10;
        objInt = null;
        System.out.println("Object type (Integer) set to null: " + objInt);

        System.out.println("Primitive types cannot be null!\n");

        System.out.println("Summary:");
        System.out.println("- Explicit Casting: Converts larger types to smaller types (may lose data).");
        System.out.println("- Implicit Casting: Automatic conversion to larger types (safe).");
        System.out.println("- Primitive Types: Faster and memory-efficient.");
        System.out.println("- Object Types: Slower, allow null values, and provide additional methods.");
    }
}

