/**
 1)Define a one-to-many dependency between objects so that when one object changes state, 
   all its dependents are notified and updated automatically.
 2)
 */

import java.util.*; 

class ObserverDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        int option = 0;
        int state = 0;
        while(true)
        {
            System.out.println("1:Enter state no: \n2:Exit \nOpt: ");
            option = sc.nextInt();

            if(option == 1)
            {
                System.out.print("State: ");
                state = sc.nextInt();
                subject.setState(state);
            }
            else
                break;
        }
    }
}