 class azadThread implements Runnable {
		   private Thread t;
		   private String threadName;
		   
		   azadThread( String name){
		       threadName = name;
		       System.out.println("Creating " +  threadName );
		   }
		   public void run() {
		      System.out.println("Running " +  threadName );
		      try {
		         for(int i = 4; i > 0; i--) {
		            System.out.println("Thread: " + threadName + ", " + i);
		            // Let the thread sleep for a while.
		            Thread.sleep(50);
		         }
		     } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		     }
		     System.out.println("Thread " +  threadName + " exiting.");
		   }
		   
		   public void start ()
		   {
		      System.out.println("Starting " +  threadName );
		      if (t == null)
		      {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }

		}

		 class TestThread {
		   public static void main(String args[]) {
		   
			   azadThread R1 = new azadThread( "Thread-1");
		      R1.start();
		      
		      azadThread R2 = new azadThread( "Thread-2");
		      R2.start();
		   }   
		}
