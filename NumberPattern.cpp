#include<iostream>
using namespace std;
int main(){
	cout<<"NumberPattern:\n";
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
}
