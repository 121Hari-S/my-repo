import java.io.*;
import java.lang.*;
public class multi
 {
public static void main(String[]args)throws NumberFormatException, IOException
{
int m=0,n,i,j,k;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
DataInputStream in=new DataInputStream(System.in);
System.out.println("How many rows");
m=Integer.parseInt(in.readLine());
System.out.println("How many columns");
n=Integer.parseInt(in.readLine());
System.out.println("Enter the first matrix");
for (i=0;i<m;i++)
for (j=0;j<n;j++)
a[i][j]=Integer.parseInt(in.readLine());
System.out.println("Enter the second matrix");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=Integer.parseInt(in.readLine());
System.out.println("The result matrix is");
for (i=0;i<m;i++)
{
for (j=0;j<n;j++)
{
for (k=0;k<n;k++)
{
c[i][j]+=a[i][k]*b[k][i];
}
System.out.print(c[i][j]+"\t");
}
System.out.println("\t");
}
}
}
