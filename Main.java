package main;

import java.util.Scanner;

public class Main{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
	System.out.println("Enter the Size of your array: ");
	
int s = input.nextInt();

int [] L = new int[s];

	System.out.println();
	System.out.print("Original values are: {");

for(int i = 0; i < L.length; i++){

L[i] = (i+1) * 10;
	System.out.print(L[i]);

if(i < L.length -1) {
	System.out.print(", ");

}}

	System.out.print("}");
System.out.println();
System.out.println();
	System.out.print("Reserved of the original values are: {");

int hold;

if((L.length % 2) != 0) {
	int middle = L.length / 2;
for(int i = 0; i < middle; i++){
	
hold = L[i];
	
L[i] = L[L.length - i -1];
	
L[L.length - i -1] = hold;
}}

if((L.length % 2) == 0) {
	int middle_1 = L.length / 2 - 1;
	int middle_2 = L.length / 2;
for(int i = 0; i <= middle_1; i++){
		
hold = L[i];
		
L[i] = L[L.length - i -1];
		
L[L.length - i -1] = hold;
}

for(int i = middle_2; i < L.length; i++){
	
hold = L[i];
		
L[i] = L[L.length - i -1 + middle_2];
		
L[L.length - i -1 + middle_2] = hold;
}}

for(int i = 0; i < L.length; i++) {

System.out.print(L[i]);

if(i < L.length -1) {
	System.out.print(", ");
	
}}

	System.out.print("}");
}}