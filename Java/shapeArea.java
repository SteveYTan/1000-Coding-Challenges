/*	Date 2/19/2018
	Language Used : Java
	Familiarity (0-5) : 1
	Website used : Codefights.com

	Problem : Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
	A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the
	n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. 
	You can see the 1-, 2-, 3- and 4-interesting polygons in the picture 
	https://codefightsuserpics.s3.amazonaws.com/tasks/shapeArea/img/area.png?_tm=1491302317375
	
	Example Solution : For n = 2, the output should be shapeArea(n) = 5;
	For n = 3, the output should be shapeArea(n) = 13.
	Constraints:  1 ≤ n < 10 ^ 4

	How to run: In console-> Java ShapeArea
*/

public class ShapeArea{

	public static int area(int n){
	// After doing a for loop, I realized that the numbers 1 = 1, 2 = 5, 3 = 13 were 1 + (the sumation of 1 + 2 ....N-1)
	// and that it can be solved in one line as well as O(1) complexity 

		return 1 + n*(n-1)/2 * 4;
	}

// Test Cases - Taken from CodeFights.com
    public static void main(String[] args) {
        
        int input = 2, output = 5;
        System.out.printf("Input n: %d \nOutput: %d \nExpected Output: %d \n", input, area(input), output);
		input = 3; output = 13;
        System.out.printf("Input n: %d \nOutput: %d \nExpected Output: %d \n", input, area(input), output);
        input = 5; output = 41;
        System.out.printf("Input n: %d \nOutput: %d \nExpected Output: %d \n", input, area(input), output);
    }
}



