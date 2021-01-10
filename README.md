# CMSC-22-JAVA-Project

# Table of contents

- [Bank Simulator](#project-title)
- [Design Patterns](#design-pattern)
- [Best Practices](#Best-Practices)
- [For the Clients](#Client-use)
- [Table of contents](#table-of-contents)

# Bank Simulator

   This project is a requirement for our CMSC 22 – Fundamentals of Object-Oriented Programming final project. This incorporates what I have learned in Java including the basic of Java Programming, Best Practices, TDD and especially the Design Patterns. 
   
   Lately, I have been obsessed with online shopping but when I stumbled upon a Youtube video about how I should start being careful in managing my accounts and that I should start saving mow that I'm in my 20's and learning how to manage my account is necessary, especially in this time where everything can be done online, from ordering foods and purchasing all kinds of products. The pandemic only heightened the need for these online platforms and online banking made everythings easier. 
  
  Since I am new to banking especially online banking, this program allows me to access all my accounts without a hassle and do the basic actions like withdrawing, depositing and checking the account balance. Most importantly, this program will help me monitor all my bank's balance and be careful in withdrawing my money. So I can buy, my wants or needs without going overboard or draining my bank accounts.

# Design Patterns
  I used the design patterns for this program. From the Creational Design Pattern I used the Factory Pattern as I have four banks and using the Factory will make it easier to create the bank that the client requested to access. For the Structural Design Pattern, I used the Facade Pattern. Since I have a lot of stuff that the program will be doing Facade Pattern is the best way to simplify it and hide the complexities from the client. Next for the Behavioural Design Pattern, I used the Template Pattern. Since all the banks will have the same methods (pin verification, withdraw, deposit and check account balance) I have decided to incoporate those methods to one abstract class to make it easier and to avoid code duplication.

# Best Practices

  For coding best practices, I followed the naming convention, using of switch case when deemed necessary, the indention for easier debugging and of course the comments for other developers and future purposes.
  
# For the Clients
  For the clients to use this, a correct pin code must be entered else the program will be terminated. You only need to input the pin as I designed the program to set the account number depending on what bank the client needed as I am a forgetful person and I can't memorise all account number of the four banks. Below are the pin code and their appropriate account numbers. Please note that this account number and pin are not real. This are made for this specific program only.
  
  LandBank
  Account Number -  46327861
  Pin Code       - 2152
  
  Gcash
  Account Number - 897365176
  Mpin           - 8756
  
  PayMaya
  Account Number - 287160428
  Pin Code       - 7650
  
  CIMB Bank
  Account Number - 694325618
  Pin Code       - 3951
