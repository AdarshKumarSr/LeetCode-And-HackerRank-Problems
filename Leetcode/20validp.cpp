#include<bits/stdc++.h>
using namespace std;

bool isValid(string str){
    stack<char> stk;
    for(char c:str){
        if(c=='{' || c=='[' || c=='('){
            stk.push(c);
        }else if (c=='}' || c == ']' || c == ')'){
            char top = stk.top();
            stk.pop();
            if(top == '{' && c!= '}' || top == '[' && c!=']' ||top == '(' && c!=')' ){
                return false;
            //    ? return (top!=0) ? false : true;
            }
        }
        
        return stk.empty();
    
    }

}
// bool isEmpty(char stk){

//     if(stk.empty()){
//         return false;
//     }
//     return true;
// }


int main(){
string str;
getline(cin, str);

if(isValid(str)){
    cout<<"paranthese r valid";
}
else{
    cout<<"paranthese r not valid";

}

}