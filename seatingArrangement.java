import java.util.Scanner;

public class seatingArrangement {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the Total no. of students: ");
		int totalStudents = reader.nextInt();
		reader.close();
		final int rows = 2;
		int cols= totalStudents/2;
		int subjStudents = totalStudents/3;
		int mathStudents = subjStudents;
		int phyStudents = subjStudents;
		int chemStudents = subjStudents;
		char[][] seatingArr = new char[rows][cols];

		//Arranging the Math Students
		for(int i=0;i<cols; mathStudents--) {
			seatingArr[0][i] = 'M';
			i=i+2;
		}
		
		if(mathStudents != 0) {
			for(int i=1;i<cols && mathStudents>0;mathStudents--) {
				seatingArr[1][i] = 'M';
				i=i+2;
			}
		}
		//Arranging the other Students in the empty spaces
		for(int i=0;i<rows;i++) 
			for(int j=0;j<cols;j++) {
				if((seatingArr[i][j] == 0) && (phyStudents>0)) {
					seatingArr[i][j] = 'P';
					phyStudents--;
				}
				else if((seatingArr[i][j] == 0) && (chemStudents>0)) {
					seatingArr[i][j] = 'C';
					chemStudents--;
				}
				else if(seatingArr[i][j] == 0)
					seatingArr[i][j] = 'X';
		}
		
		// Printing the Student's Seating Arrangement
		for(int i=0;i<rows; i++) {
			for( int j=0;j<cols;j++) {
				System.out.print(" " + seatingArr[i][j] + " ");
				
			}
			System.out.println("\n");
		}
		
	}
}
