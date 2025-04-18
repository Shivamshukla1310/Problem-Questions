import java.util.Scanner;

class Read_Character_Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            char ch = sc.next().charAt(0);
            if(ch == '$'){
                break;
            }
            count += 1;
        }
        System.out.print(count);
        sc.close();
        
    }
}