package task_1;

import java.util.Locale;

public class test1 {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String trimed = hi.trim();
        String editedWorld = world.toLowerCase();
        String answer = trimed + editedWorld + newLine;
        System.out.println(answer.repeat(3));


    }
}
