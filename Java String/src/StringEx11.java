/*Given two strings, a and b, return the result of putting them together in the order
abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/
public class StringEx11 {
public static void main(String[] args) {
String str1="Hi";
String str2="Bye";
System.out.println(makeAbaAba(str1,str2));
}
public static String makeAbaAba(String str1,String str2){
return(str1+str2+str2+str1);
}
}
