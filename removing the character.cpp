/*Problem Statement: Remove X
Problem Level: MEDIUM
Problem Description:
Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S.

Sample Input 1 :
xaxb

Sample Output 1:
ab

Sample Input 2 :
abc

Sample Output 2:
abc

Sample Input 3 :
xx

Sample Output 3:
*/
#include<iostream>
using namespace std;

void removechar(char s[],char a,char b){
	if(s[0] == '\0'){
		return;
	}
	if(s[0] == a){
		s[0] = b;
		removechar(s+1,a,b);			//both are correct
	}else{
		removechar(s+1,a,b);
	}
	
	/*if(s[0] != a){
		removechar(s+1,a,b);
	}else{
		s[0] = b;
		removechar(s+1,a,b);
	}*/
	
}

int main(){
	char str[50];
	cin>>str;
	char a,b;
	cin>>a>>b;
	cout<<str<<endl;
	removechar(str,a,b);
	cout<<str<<endl;
}
