package javaTest;
import java.util.*;
public class Teste {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1,num2,soma;
	System.out.println("Digite um numero");
	num1=sc.nextInt();
	System.out.println("Digite outro numero");
	num2=sc.nextInt();
	soma=num1+num2;
	System.out.println("A soma dos numeros e :" + soma);
}
}
