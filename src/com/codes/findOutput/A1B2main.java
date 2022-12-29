package com.codes.findOutput;

public class A1B2main {
	 public static void main(String[] args) {

         A1B2ThreadProb an= new A1B2ThreadProb(false);

         Thread t1=new Thread(new Runnable() {

           @Override
           public void run() {

               try {

                   an.Alpha();
               } catch (InterruptedException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }
           }
       });


         Thread t2= new Thread(new Runnable() {

           @Override
           public void run() {
               try {
                   an.numbers();
               } catch (InterruptedException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }

           }
       });


         t1.start();
         t2.start();
}
}
