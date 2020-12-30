package com.company;

public class Main{

    public static void main(String[] args) {
        /***********************************ЗАДАНИЕ №1.1+**********************************/
        int[] danil = new int[47];          //Создал массив danil с 47 ячейками
        System.out.println("Наш изначальный массив: ");
        for (int k = 0; k < danil.length; k++) {
            danil[k] = (int) (Math.random() * 47); //Значение каждой ячейки определяется случайным образом каждый запуск.
            System.out.println(danil[k]);
        }
        System.out.println("Конец нашего массива");
        for (int i = 0; i < danil.length - 1; i++) {  //Задаю цикл равный количеству ячеек кроме одной
            int maxValue = danil[i];  //Иницилизируем переменную и присваеваем ей значение каждой ячейкм
            int maxIndex = i;

            for (int j = i; j < danil.length; j++) { // Задаю цикл равный количеству ячеек
                if (danil[j] > maxValue) {
                    maxValue = danil[j];
                    maxIndex = j;
                }
            }
            int b = danil[i];
            danil[i] = maxValue;
            danil[maxIndex] = b;
        }

        for (int n = 0; n < danil.length; n++) {
            System.out.println(danil[n]);
        }
        System.out.println("-----------------ЗАДАНИЕ №1.2---------------------");
        /****************************************** ЗАДАНИЕ 2 *******************************/
        char[] polindroma1 = new char[]{'R', 'A', 'C', 'E', 'F', 'A', 'S', 'T', 'S', 'A', 'F', 'E', 'C', 'A', 'R'}; // Race fast, safe car
        char[] polindroma2 = new char[]{'P', 'U', 'L', 'L', 'U', 'P', 'I', 'F', 'I', 'P', 'U', 'L', 'L', 'U', 'P'};// Pull up, if i pull up
        int kk = polindroma1.length;
        int proverka1 = 10;
        int proverka2 = 10;
        int ll = polindroma2.length;
        for (int zz = 0; zz < polindroma1.length; zz++) {
            kk--;
            proverka1 += 6;
            if (polindroma1[zz] == polindroma1[kk]) {
                System.out.println("Идет процесс проверки: " + proverka1 + "%");
            } else {
                System.out.println("Проверка окончена. Результат: False");
                break;
            }
        }
        if (proverka1 == (10 + (6 * polindroma1.length))) {
            System.out.println("Проверка окончена. Результат: True");
        }
        for (int ccc = 0; ccc < polindroma2.length; ccc++) {
            ll--;
            proverka2 += 6;
            if (polindroma2[ccc] == polindroma2[ll]) {
                System.out.println("Идет процесс проверки: " + proverka2 + "%");
            } else {
                System.out.println("Проверка окончена. Результат: False");
                break;
            }
        }
        if (proverka1 == (10 + (6 * polindroma2.length))) {
            System.out.println("Проверка окончена. Результат: True");
        }

    }

    //************************** Задание 2.1 ***********************//




}
