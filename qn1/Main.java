//authors: Caleb Mugisha, Samuel Anumudu
// Program that simulates traffic lights.

package qn1;


import java.util.*;


class Main {
    

    public static void main(String[] args) throws InterruptedException 
    {
        int rand;

        Queue <String> car = new LinkedList<>();

       for(int i =1 ; i<101; i ++)
       {
           car.add("car "+i);
       }
       
       // created a color array which has the lightcolors
       String [] color = {"Green", "Yellow", "Red"};


     // variable to get a random integer.

        rand = new Random().nextInt(3);

        
        
        if("Green" == color[rand])
        {
            System.out.println();
            System.out.println(">The Traffic light is Green <");
            System.out.println();

            int j =1;
            while(j<31) 
            {
                //since it takes 30sec when it's green, therefore a car should go once every second
                Thread.sleep(1000);
                System.out.println("Removed: " + car.remove());
                j++;
            }
            while(car.size()>0)
            {
                
                rand = new Random().nextInt(2); // overwriting rand in order to exhaust all the cars in our queue.

                if("Green" == color[rand])
                {
                    System.out.println();
                    System.out.println("> The Traffic light is Green <");
                    System.out.println();
            
                    int t =1;
                    while(t<31) 
                    {
                        //since it takes 30sec when it's green, therefore a car should go once every second
                        Thread.sleep(1000);
                
                        System.out.println("Removed: " + car.remove());
                        t++;
                        break;
                        
                    }
                    
                }else if("Yellow" == color[rand])
                {
                    System.out.println();
                    System.out.println("> The Traffic light is Yellow <");
                    System.out.println();
            
                    int t =1;
                    while(t<6) 
                    {
                        //since it takes 30sec when it's green, therefore a car should go once every second
                        Thread.sleep(2000);
                
                        System.out.println("Removed: " + car.remove());
                        t++;
                        break;
                        
                    }
                    
                }
                else
                {       
                    System.out.println();
                    System.out.println(">The Traffic light is Red <");
                    System.out.println();
                    System.out.println("You can't move!!");
                    Thread.sleep(20000);
        
                }

            }
                
            

        }

        else if("Yellow" == color[rand])
        // since it takes 10 secs, and rests 2secs, therefore it will only allow five cars 

        {
            System.out.println();
            System.out.println(">The Traffic light is Yellow <");
            System.out.println();
            int k =1;
            while(k<6){
                Thread.sleep(2000);
                System.out.println("Removed  : " + car.remove());
                k++;
            }
        } else
        {       
                System.out.println();
                System.out.println(">The Traffic light is Red <");
                System.out.println();
                System.out.println("You can't move!!");
                Thread.sleep(20000);

        }

            
    }
       
}


