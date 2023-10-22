#include <iostream>
using namespace std;

int main()
{
	int a = 5;
	int b = 7;
	cout<<"Before Swapping, a = "<<a<<" "<<"b = "<<b<<endl;
	a ^= b;
	b ^= a;
	a ^= b;
	cout<<"After Swapping, a = "<<a<<" "<<"b = "<<b<<endl;
	return 0;
}

