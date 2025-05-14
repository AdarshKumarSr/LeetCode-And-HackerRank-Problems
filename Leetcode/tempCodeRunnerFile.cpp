#include<bits/stdc++.h>
using namespace std;

bool isValid(string str){
    stack<string> stk;
    for(char c:str){
        if(c=='{' || c=='[' || c=='('){
            stk.push(str);
        }else if (c=='}' || c == ']' || c == ')'){
            string top = stk.top();
            stk.pop();
            if(top == "{" && c!= '}' || top == "[" && c!=']' ||top == "(" && c!=')' ){
                    return false;
            }
        }

        return true;
    }

}
bool isEmpty(string str){
    if(str.empty()){
        return true;
    }
    return false;

}


int main(){
string str;
getline(cin, str);

if(isValid(str) && isEmpty(str)){
    cout<<"paranthese r valid";
}
else{
    cout<<"paranthese r not valid";

}

}