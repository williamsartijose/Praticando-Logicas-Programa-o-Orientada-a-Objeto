package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

// Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
// imposto). Em
// seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em
// seguida, aumentar o
// sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio
// bruto �
// afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a
// classe
// projetada abaixo.

public class Program
{
    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        final Employee emp = new Employee();

        System.out.printf( "Name:" );
        emp.name = sc.nextLine();
        System.out.printf( "Gross salary: " );
        emp.grossSalary = sc.nextDouble();
        System.out.printf( "Tax: " );
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println( "Employee: " + emp );
        System.out.println();
        System.out.print( "Which percentage to increase salary? " );
        final double percentage = sc.nextDouble();
        emp.increaseSalary( percentage );
        System.out.println();
        System.out.println( "Updated data: " + emp );
        sc.close();
    }
}