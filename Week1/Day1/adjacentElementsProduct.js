/* 	Date 2/19/2018
	Language Used : JavaScript
	Familiarity (0-5) : 3
	Website used : Codefights.com
	
	Problem : Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
	Example Solution : For inputArray = [3, 6, -2, -5, 7, 3], the output should be adjacentElementsProduct(inputArray) = 21.
	Constraints:  2 ≤ inputArray.length ≤ 10, -1000 ≤ inputArray[i] ≤ 1000

	How to run: in console-> Node adjacentElementsProduct
*/

function adjacentElementsProduct(inputArray) {
    var size = inputArray.length;
    var product = inputArray[0] * inputArray[1];
    
    for (var i = 1; i < size-1; i++){
        if (inputArray[i] * inputArray[i+1] > product)
            product = inputArray[i] * inputArray[i+1];
    }
    return product;
}

// Test Cases - Taken from CodeFights.com
var inputArray = [3, 6, -2, -5, 7, 3];
console.log(" Input Array : [3, 6, -2, -5, 7, 3] \n Output: " + adjacentElementsProduct(inputArray) + " \n Expected Output : 21 \n");
inputArray = [-1, -2];
console.log(" Input Array : [-1, -2] \n Output: " + adjacentElementsProduct(inputArray) + " \n Expected Output : 2 \n ");
inputArray = [1, 0, 1, 0, 1000];
console.log(" Input Array : [1, 0, 1, 0, 1000] \n Output: " + adjacentElementsProduct(inputArray) + " \n Expected Output : 0 \n");