/*
Print the pattern
1      1
12    21
123  321
12344321
*/

#include<iostream>
using namespace std;
int main(){
	int totalrows = 4;
	int row = 1;
	while(row <= totalrows){
		int col = 1;
		int num1 = 1;
		int num2 = row;
		while(col <= 2*totalrows){
			if(col <= row){
			cout<<num1;
			num1++;
			}else if(col >= row+1 && col <= (2*totalrows - row)){
				cout<<" ";
			}else{
				cout<<num2;
				num2--;
			}
			col++;
		}
		row++;
		cout<<"\n";
	}

}
