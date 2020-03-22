package com.jaxonz;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入项目名称");
            TodoItem todoItem = new TodoItem(scanner.nextLine());
            System.out.println(todoItem.toString());
        }

    }
}
