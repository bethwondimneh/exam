import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.println("enter the " + i + "  numbers");
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println("enter the number to be searched");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0;i<array.length;i++) {
            if (num == array[i]){
                count++;
            }
            else {
                System.out.println("number not found");

            }
        }
        System.out.println(num + "occured " + count + " times");
    }
}

class stack {
    int maxsize, top;
    int[] array;

    public stack(int size) {
        maxsize = size;
        array = new int[maxsize];
        top = -1;


    }

    public void push(int number) {
        if (top == maxsize - 1) {
            System.out.println("stack is full");
        }
        array[++top] = number;
        size++;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        }
        size--;
        return array[top--];
    }
//    public static void main(String[] args) {
//        stack list = new stack[maxsize];
//        list.push();
//        list.push();
//        list.push();
//        list.push();
//
//
//    }
//

}

class mergesort{
    int[] array;
    int size;
    public mergesort(int size){
        this.size = size
        array = new int[size];

    }

    int arraylength =array.length;
    public void merge(int[] array) {
        if (array.length == 1) {
            return;
        }
        int mid = arraylength / 2;
        int[] leftarray = new int[mid];
        int[] rightarray = new int[arraylength - mid];
        merge(leftarray);
        merge(rightarray);

        merging(int[] array, int)

    }
    public void merging()
}







    public static void main(String[] args){

    }
}