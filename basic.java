// I'm aware this code has a lot of errors and fixing to do


import java.util.Scanner;

class main {

    static int bullet;
    static int currentChamber;
    static boolean status;

    static int reload() {
        bullet = (int)(Math.random() * 6);
        currentChamber = (int)(Math.random() * 6);
        return bullet;
    }


    static int intro(){
        System.out.println("1. Reload gun");
        System.out.println("2. Shoot");
        Scanner input = new Scanner(System.in);
        int decision = input.nextInt();
        return decision;
    }
    
    public static void main (String[] args) {
        System.out.println("Russian Roulette");
        int decision = intro();
    
        while(true){
            if(decision == 1) {
                reload();
                System.out.println("You spin the barrel...");
                decision = intro();

            }
            else if(decision == 2) {
                System.out.println("You pull the trigger.");
                if(currentChamber == bullet) {
                System.out.println("You died.");
                reload();
                decision = intro();
                status = false;
                }
            
                else {
                    System.out.println("You're alive");
                    currentChamber = (currentChamber + 1) % 6;
                    decision = intro();
                    status = true;
                }
            }
        }
    }
}
