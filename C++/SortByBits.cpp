// Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's sort them in ascending order.

#include <bits/stdc++.h>
using namespace std;

bool static cmp(int x, int y)
{
  int xc = __builtin_popcount(x);
  int yc = __builtin_popcount(y);
  if (xc == yc)
  {
    return x < y;
  }
  else
  {
    return xc < yc;
  }
}

vector<int> sortByBits(vector<int> &arr)
{
  int n = arr.size();
  sort(arr.begin(), arr.end(), cmp);
  return arr;
}

int main()
{
  vector<int> arr = {1024,512,256,128,64,32,16,8,4,2,1};
  auto ans = sortByBits(arr);
  for(int a : ans) {
    cout << a << " ";
  }
  return 0;
}