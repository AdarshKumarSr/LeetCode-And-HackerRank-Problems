#include<bits/stdc++.h>
using namespace std;

int postfix(string str){
    stack<int> stk;
    // stack<int> stk;
    for(char c: str) {
         if(isdigit(c)){
            stk.push(c - '0'); //conv to int 
         }
         else {
           int  b = stk.top(); stk.pop();
           int a = stk.top(); stk.pop();
           
               switch(c) {
                case '+': stk.push(a + b); break;
                case '-': stk.push(a - b); break;
                case '*': stk.push(a * b); break;
                case '/': stk.push(a / b); break;
                   
                   default: throw invalid_argument("Invalid operator");
               }  
         }
         
         }
         return stk.top(); //empty 
    }
int main() {
string str;
getline(cin, str);
str.erase(remove_if(str.begin(), str.end(), ::isspace), str.end());

// cout<<str<<endl;  correct
cout<<"value: "<<postfix(str);
// operation(v1,v2,c);
return 0;
}