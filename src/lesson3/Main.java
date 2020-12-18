package lesson3;

import java.util.Comparator;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack.peek());
//        for (int i = 0; i < 4; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression expression = new Expression("( 4-( 5+{ i*p } ) )");
//        System.out.println(expression.checkBracket());


/*        MyQueue<Integer> queue = new MyQueue<>(5);
        System.out.println(queue);
        queue.insert(5);
        System.out.println(queue);
        queue.insert(3);
        System.out.println(queue);
        queue.insert(2);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        queue.insert(2);
        System.out.println(queue);
        queue.insert(2);
        System.out.println(queue);
        queue.insert(2);
        System.out.println(queue);*/
//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>(Comparator.reverseOrder());
//        mpq.insert(5);
//        mpq.insert(2);
//        mpq.insert(15);
//        mpq.insert(3);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(mpq.remove());
//        }

// 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
/*       // вар 1
        MyStack stack = new MyStack();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = scanner.nextLine();
        String[] str2 = str.split(" ");
        for (int i = 0; i < str2.length; i++) {
            stack.push(str2[i]);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        int temp = sb.length();
        sb.delete(temp - 1, temp);
        System.out.println(sb.toString());

        // вар 2
        ReWrite reWrite = new ReWrite();
        System.out.println(reWrite.read());*/

        // 2. Создать класс для реализации дека.

        MyDeQueue <Integer> myDeQueue = new MyDeQueue<>(5);
        System.out.println(myDeQueue);
        myDeQueue.insertBegin(1);
        System.out.println(myDeQueue);
        myDeQueue.insertBegin(2);
        System.out.println(myDeQueue);
        myDeQueue.insertBegin(3);
        System.out.println(myDeQueue);
        myDeQueue.insertEnd(4);
        System.out.println(myDeQueue);
        myDeQueue.insertEnd(5);
         System.out.println(myDeQueue);
         System.out.println(myDeQueue.removeBegin());
        System.out.println(myDeQueue);
        System.out.println(myDeQueue.removeEnd());
        System.out.println(myDeQueue);
    }
}
