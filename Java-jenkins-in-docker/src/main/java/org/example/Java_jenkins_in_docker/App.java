package org.example.Java_jenkins_in_docker;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	        System.out.println( CheckedInputIsAnEvenNumber(122));
	    }

		public static boolean CheckedInputIsAnEvenNumber( int number) {
			// TODO Auto-generated method stub
			return number%2==0;
		}
}
