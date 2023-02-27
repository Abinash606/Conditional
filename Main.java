public class Main{
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//Q1
          System.out.println("Enter The Length:");
          int length = sc.nextInt();
          System.out.println("Enter The Breadth:");
          int breath = sc.nextInt();
          if(length == breath){
              System.out.println("It is Square");
          }
         else{
            System.out.println("It is Rectangle");
            }
//Q2
            int x = sc.nextInt();
            System.out.println(~(x-1));
 //Q3
        System.out.println("Enter The Cost_price : ");
        int cost_price = sc.nextInt();
        System.out.println("Enter The Selling_price : ");
        int selling_price = sc.nextInt();
        if (selling_price > cost_price){
            int profit = selling_price - cost_price;
            System.out.println("Profit = " + profit);
        }
        else {
            int loss = cost_price - selling_price;
            System.out.println("Loss = "+loss);
        }
//Q4
        System.out.println("Enter The Positive Number :");
        int y = sc.nextInt();
        if ( y > 0){
            System.out.println(y);
        }
        else if ( y < 0){
            System.out.println("The Number is Negative And Skipped");
        }
//Q5
        System.out.println("Enter The Operator Among + ,- ,* ,/ ,");
        String operator = sc.next();
        System.out.println("Enter The First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second NUmber");
        int num2 = sc.nextInt();
        switch (operator){
            case "+":
                System.out.println(num1+num2);
                break;
            case  "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
//Q6
        System.out.println("Enter The Mark Among  100 ");
        int mark = sc.nextInt();
        switch (mark/10){
            case 10:
            case 9:
                System.out.println("Your Grade is A+");
                break;
            case 8:
                System.out.println("Your Grade is A");
                break;
            case 7:
                System.out.println("Your Grade is B+");
                break;
            case 6:
                System.out.println("Your Grade is B");
                break;
            case 5:
                System.out.println("Your Grade is C");
                break;
            case 4:
                System.out.println("Your Grade is D");
                break;
            case 3:
                System.out.println("Your Grade is E");
                break;
            case 2:
                System.out.println("Your Grade is F");
                break;
            default:
                System.out.println("You are Failed");


        }
        
        


}
}
