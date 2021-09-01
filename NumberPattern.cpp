/*Print the Number pattern

   1
  23
 345
4567
*/

#include<iostream>
using namespace std;
int main(){
	//First Approach
	cout<<"---First Approach---\n";
	int totalrows = 4;
	int row = 1;
	while(row <= totalrows){
		int col = 1;
		int num = row;
		while(col <= totalrows + row -1){
			if(col <= (totalrows - row)){
				cout<<" ";
			}else if(col <= totalrows){
				cout<<num;
				num = num+1;
			}
			col++;
		}
		row++;
		cout<<"\n";
	}
	
	//Second Approach
	cout<<"\n----Second Approach----\n";
	int totalrows_2 = 4;
	int row_2 = 1;
	while(row_2 <= totalrows_2){
		int spaces = 1;
		while(spaces < totalrows_2 - row_2){
			cout<<" ";
			spaces++;
		}
		int col_2 = 1;
		while(col_2 <= row_2){
			cout<<(row_2+col_2-1);
			col_2++;
		}
		row_2++;
		cout<<"\n";
	}
}
