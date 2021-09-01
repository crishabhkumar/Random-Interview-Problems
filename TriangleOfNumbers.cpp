/*Print the following pattern for the given number of rows.
Pattern for N = 4
   1
  232
 34543
4567654
  */
#include<iostream>
using namespace std;
int main(){
	//First Approach
	int totalrows = 4;
	int row = 1;
	while(row <= totalrows){
		int col = 1;
		int num = row;
		while(col <= totalrows + row -1){
			if(col <= (totalrows - row)){
				cout<<" ";
			}else if(col < totalrows){
				cout<<num;
				num = num+1;
			}else{
				cout<<num;
				num = num-1;
			}
			col++;
		}
		row++;
		cout<<"\n";
	}
	
	cout<<"----Second Approach----";
	//Second Approach
	int totalrows_2 = 4;
	int row_2 = 1;
	while(row_2 <= totalrows_2){
		int spaces = 1;
		while(spaces < totalrows_2 - row_2){
			cout<<" ";
			spaces++;
		}
		int temp = row_2;
		int col_2 = 1;
		while(col_2 <= row_2){
			cout<<temp;
			temp++;
		}
		temp--;
		int k = 1;
		while(k < row_2){
			temp--;
			cout<<temp;
		}
		row_2++;
		cout<<"\n";
	}
	
}
  
  
