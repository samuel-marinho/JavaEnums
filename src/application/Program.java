package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        Scanner sc = new Scanner(System.in);
        int a=0;
        for (int i=0; i<4; i++){
        a = sc.nextInt();
        }
        System.out.println(a);
    }

}
