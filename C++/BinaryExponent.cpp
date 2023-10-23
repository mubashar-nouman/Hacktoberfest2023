/*
  A cpp program to find x^n using binary exponentiation which works in O(log(n)) time
  compared to the trivial method which takes O(n) time.
  @author [Abdul Kadir](https://github.com/AK3847)
*/
#include<bits/stdc++.h>
using namespace std;
using ll=long long;

ll binarexpo(ll x, ll n)
{
    if(n==0)  return 1ll;
    ll ans=1;
    while(n){ 
        if(n&1) 
            ans=ans*x;    
        x=x*x,n>>=1;
    }
    return ans;
}
int main(){
    ll x,n;
    cout<<"Give your number: ";
    cin>>x;
    cout<<"Give its power: ";
    cin>>n;
    ll ans=binarexpo(x,n);
    cout<<"Your answer is: "<<ans;
    return 0;
}