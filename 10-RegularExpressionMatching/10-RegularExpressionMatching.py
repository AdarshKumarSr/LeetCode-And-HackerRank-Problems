# Last updated: 1/3/2026, 9:32:16 PM
1class Solution:
2    def isMatch(self, s: str, p: str) -> bool:
3        i, j = len(s) - 1, len(p) - 1
4        return self.backtrack({}, s, p, i, j)
5
6    def backtrack(self, cache, s, p, i, j):
7        key = (i, j)
8        if key in cache:
9            return cache[key]
10
11        if i == -1 and j == -1:
12            cache[key] = True
13            return True
14
15        if i != -1 and j == -1:
16            cache[key] = False
17            return cache[key]
18
19        if i == -1 and p[j] == '*':
20            k = j
21            while k != -1 and p[k] == '*':
22                k -= 2
23            
24            if k == -1:
25                cache[key] = True
26                return cache[key]
27            
28            cache[key] = False
29            return cache[key]
30        
31        if i == -1 and p[j] != '*':
32            cache[key] = False
33            return cache[key]
34
35        if p[j] == '*':
36            if self.backtrack(cache, s, p, i, j - 2):
37                cache[key] = True
38                return cache[key]
39            
40            if p[j - 1] == s[i] or p[j - 1] == '.':
41                if self.backtrack(cache, s, p, i - 1, j):
42                    cache[key] = True
43                    return cache[key]
44        
45        if p[j] == '.' or s[i] == p[j]:
46            if self.backtrack(cache, s, p, i - 1, j - 1):
47                cache[key] = True
48                return cache[key]
49
50        cache[key] = False
51        return cache[key]