import java.util.Scanner;

public class pattern{


public static void main(String args[]){

Scanner scn = new Scanner(System.in);
System.out.println("Input the number of times the pattern should continue: ");
int a = scn.nextInt();
int i,j;
for (i= 1;i<=a;i++){

for (j = i;j<=a;j++){
System.out.print("*"+"\t");

}
System.out.print("\n");
}



}

}
