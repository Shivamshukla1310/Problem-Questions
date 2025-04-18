// First take input from user based on direction i.e NWES ok 
// Then use 2 count for vertical axis and horizontal axis
// then on the basis of string input by user find the position of the user

import java.util.*;

class Mapping_Direction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int horizontal = 0;
        int vertical = 0;
        String map = sc.nextLine();
        for(int i = 0; i < map.length(); i++){
            if(map.charAt(i) == 'N'){
                vertical++;
            }
            else if(map.charAt(i) == 'S'){
                vertical--;
            }
            else if(map.charAt(i) == 'E'){
                horizontal++;
            }
            else if(map.charAt(i) == 'W'){
                horizontal--;
            }
        }
        System.out.print("Horizontal: " + horizontal);
        System.out.print("Vertical: " + vertical);
    }
}