/*here we are showing how an Exception occurs at run time in arrays 
 * if we given the size of the index of an element is out of the array size then it shows an exception
 * as array index out of bound .
 * this exception are known as unchecked exceptions 
*/
package example; //i have created a package as example

public class ArrayException {          //i have taken the class name as ArrayException as we are trying to show
	public static void main (String[]args){   //here i have the main method 
	
		int a[] = new int [5];           //here I'm creating an array  size of index  five 

		a[0] =10;            //here I am initializing and declaring the  5 elements of array  
		a[1] =20; 
		a[2] =30;
		a[3] =40;
		a[4] =50;
		System.out.println( a[5]=70);//here i am trying to print the size of the 6th element which i have not declared
	}                               //so it shows an exception here where array index out of bound

}
