package com.mritunjay.passwordgenerator;

import java.util.Scanner;
public class TextBasedInterface implements UserInterface {

    private Scanner scanner;
    public TextBasedInterface(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getPasswordLength() {
        System.out.print("Please enter the password length: ");
        return scanner.nextInt();
    }

    @Override
    public boolean useLowercase() {
        System.out.print("Would you like the password to have lowecase characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useUppercase() {
        System.out.print("Would you like the password to have uppercase characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useNumbers() {
        System.out.print("Would you like the password to have numerical characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useSymbols() {
        System.out.print("Would you like the password to have symbol characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public void displayPassword(String password) {
        System.out.println("Here is the password: "+ password);

    }
}
