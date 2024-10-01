public class KISS_Principle01 {
public static void main(String[] args) {
        // GAME DESIGN
        boolean jump = true ;
        boolean run = true;
        boolean fly = false;
        boolean weapon = false;

        // god mode - all 4 weapon 
        // legend mode - run and weapom 
        //  else regular mode 

        // bad implementation 
        if (jump == true) 
        {if(run==true){
            if(fly== true){
                if(weapon==true){
                    System.out.println("Gode mode Activated ");
                }
            }
        }
        }

        else if(run== true){
            if (weapon==true) {
                System.out.println("Legend mode activated ");
            }
        }
        
        else{
            System.out.println("Regular mode activated ");
        }

// Good implementation 
if(jump && run && fly && weapon){
    System.out.println("God mode is activated ");
}
else if(run && weapon){
    System.out.println("Legend mode activated ");
}

else{
    System.out.println("Regular mode activated ");
}

}
     
}   