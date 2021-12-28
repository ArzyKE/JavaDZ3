package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {1.2,3.5,-4.7,3.6,8.5,-2.3,4.7,-3.7,-3.8,2.7,6.8,-9.6,9.5,5.9,-3.6};
        double totalSumma = 0.0;
        int kolichestvo = 0;
        boolean isNegative = false;

        for (double sum:nums) {
            if (sum < 0){
                isNegative = true;

            }else if (isNegative){
                totalSumma = totalSumma + sum;
                kolichestvo++;
            }
        }
        System.out.println("Сумма: " + totalSumma);
        System.out.println("Количество: " + kolichestvo);

        double answer = totalSumma / kolichestvo;
        System.out.println("Ответ: " + answer);
        

    }

}
