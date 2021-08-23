#include<iostream>
#include<algorithm>
using namespace std;
int unbounded_knapsack_recursion(int wt,int val[],int cap){
	if(cap == 0){
		return 0;
	}
	int ans = 0;
	for(int i = 0;i < 4;i++){
		if((cap - wt[i]) >= 0){
			ans += std::max(unbounded_knapsack_recursion(wt[],val[],cap-wt[i]+val[i])
		}
	}
	return ans;
}
int main(){
	int wt[] = {1,4,3,5};
	int val[] = {10,40,50,70};
	int cap = 5;
	cout<<unbounded_knapsack_recursion(wt,val,cap);
}
