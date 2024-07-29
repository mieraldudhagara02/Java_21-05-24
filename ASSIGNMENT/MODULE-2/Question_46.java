/*
	W.A.J.P to start the same Thread twice by calling start () method twice. 
	Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
*/

package assignment_module_2;

public class Question_46 extends Thread
{
	
	public void run() {
        System.out.println("Thread is running.");
    }

	public static void main(String[] args) {
	
		
		Question_46 t1 = new Question_46();
        t1.start(); // This will start the thread and print "Thread is running..."
        
        // Attempting to start the same thread again will throw an IllegalThreadStateException
        try {
            t1.start(); // This will throw an exception
        } 
        catch (IllegalThreadStateException e) 
        {
            System.out.println("Exception caught: " + e);
        }
		
	}

}