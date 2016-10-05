// Program to print the "X" pattern:

class PrintX {
	
	public static void main(String[] args) {
		// Calling PrintXY method with Value (20,'X')
		PrintXY(5,'X');

}
// Defined PrintXY Method
public static void PrintXY(int size, char display){
	
	// For Loop for Create Row and Column
    for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
			// if Statement to Print X or not
            if (row == col || row + col == size - 1) {
                System.out.print(display);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}