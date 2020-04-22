import java.util.Scanner;
public class PrintGradesWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score=0;
        String input="Yes";
        char ans='Y';
        while(ans=='Y'||ans=='y'){
            System.out.println("Please enter your score");
            score=scanner.nextInt();
            if(score >=97&&score<=100 )
                System.out.println("Your grade is A+");

        else if(score >=94&&score<=96 )
            System.out.println("Your grade is A");
            else if(score >=90&&score<=93 )
                System.out.println("Your grade is B+");

        else if(score >=84&&score<=86 )
            System.out.println("Your grade is B");
        else if(score >=80&&score<=83 )
            System.out.println("Your grade is B-");
        else if(score >=77&&score<=79 )
            System.out.println("Your grade is C+");
            else if(score >=74&&score<=76 )
                System.out.println("Your grade is C");
            else if(score >=70&&score<=73 )
                System.out.println("Your grade is C-");
            else if(score >=60&&score<=69 )
                System.out.println("Your grade is D");

            else if(score<60)
                System.out.println("Go back to School");

            System.out.println("Do you want to enter another score");
            scanner.nextLine();
            input=scanner.nextLine();
            ans= input.charAt(0);

    }
    }
    }

