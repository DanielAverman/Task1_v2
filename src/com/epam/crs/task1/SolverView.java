package com.epam.crs.task1;

public class SolverView {

    public void printBoolean(int number, boolean output) {
        System.out.println("First 2 digits of number " + number + " equal last 2 digits is " + output);
    }

    public void printMinPlusMax(double x, double y, double z, double sum) {
        System.out.println("x=" + x + "\ny=" + y + "\nz=" + z + "\nSum(min+max)=" + sum);
    }

    public void printTemplateMatrix(int[][] template) {
        System.out.println("The template matrix for " + template.length + " looks:");
        int[][] var1 = template;
        int var2 = template.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int[] ints = var1[var3];
            int[] var5 = ints;
            int var6 = ints.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                int anInt = var5[var7];
                System.out.print(anInt + " ");
            }

            System.out.println();
        }

    }
}
