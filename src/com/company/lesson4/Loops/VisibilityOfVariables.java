package com.company.lesson4.Loops;

public class VisibilityOfVariables {
    public static void main(String[] args) {

        String textOutside = "Outside";

        System.out.println(textOutside);
        for (int i = 0; i < 5; i++) {   //fori - шикарный хоткей
            textOutside = "Now we are inside loop";


            String insideLoop = "Inside Loop";
        }
        // insideLoop // Нам не доступна эта переменная вне цикла
        System.out.println(textOutside);

       //var type of variable
        var gh = 6;
    }
}
