// https://leetcode.com/submissions/detail/808919222/
// 26.09
class Solution {
public:
    bool isValid(string s) {
     stack<char> paren;
     int n = s.size();
     for(int i=0;i<n;i++)
     {   
         if(s[i]=='(' || s[i]=='{' || s[i]=='[')
         { 
           paren.push(s[i]);
           continue;
         }
         if(paren.empty())
             return false;
         char x = paren.top();
         if((x=='(' && s[i]==')') || (x=='{' && s[i]=='}') || (x=='[' && s[i]==']'))
             paren.pop();
         else
            return false;
     } 
     if(paren.empty())
         return true;
     return false;
 }
};
