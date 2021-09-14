/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is the quote? ");
    String quote = input.nextLine();

    System.out.print("Who said it? ");
    String author = input.nextLine();

    System.out.printf("%s says, \"%s\"",author, quote);
  }
}