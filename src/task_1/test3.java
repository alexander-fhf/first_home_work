package task_1;

public class test3 {
    public static void main(String[] args) {
        char newlane = '\n';
        char[] myArray = new char [5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';
        System.out.print(myArray);
        System.out.print(newlane);
            char[] myArray2 = myArray;
            myArray[3] = 'h';
            System.out.print(myArray2);
    }
}
