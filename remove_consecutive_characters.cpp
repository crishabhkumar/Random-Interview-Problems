#include<iostream>
using namespace std;

void removecons(char s[]){
	if(s[0] == '\0'){
		return;
	}
	
	if(s[0] !=s[1]){
		removecons(s+1);
	}else{
		int i = 0;
		for(;s[i]!='\0';i++){
			s[i] = s[i+1];
		}
		s[i] = s[i+1];
		removecons(s);
	}
	
}

int main(){
	char str[50];
	cin>>str;
	cout<<str<<endl;
	removecons(str);
	cout<<str<<endl;
	
}
