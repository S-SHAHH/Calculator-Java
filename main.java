import java.util.Scanner;

public class main {

 static int sum(int num1,int num2){
      int sum=num1+num2;
      System.out.print("Total: "+ sum);
     return 0;
    
  }

 static int multiply(int num1,int num2){
      int ttl=num1*num2;
      System.out.print("Answer: "+ ttl);
     return 0;
    
  }

 static int minus(int num1,int num2){

      if(num1>num2){
      int ttl = num1-num2;
        System.out.print("Total: "+ ttl);
      }
      else if(num2>num2){
        int ttl = num2-num1;
        System.out.print("Total: "+ ttl);
      }
     return 0;
    
  }
  static int divide(int num1,int num2){

      if(num1>num2){
      int ttl = num1/num2;
        System.out.print("Answer: "+ ttl);
      }
      else if(num2>num1){
        int ttl = num2/num1;
        System.out.print("Answer: "+ ttl);
      }
     return 0;
    
  }
 
  
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter First integer: ");
    int value1= reader.nextInt();

    System.out.print("Enter Second integer: ");
    int value2= reader.nextInt();    


    System.out.print("Enter + for Addition or - for Subtraction or / for Division or * for Multiplication: ");
    Scanner reader0= new Scanner(System.in);
    String opr = reader0.nextLine();
  
    if( opr == "+"){
     sum(value1,value2);
    }
    else if (opr == "-"){
    minus(value1,value2);
    }else if (opr == "*"){
    multiply(value1,value2);
    }else if (opr =="/"){
    divide(value1,value2);
    }

  }

}

