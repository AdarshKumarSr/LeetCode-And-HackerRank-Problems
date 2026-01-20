// Last updated: 1/20/2026, 12:22:37 PM
1class Solution {
2
3    class Robot {
4        int pos;
5        int hel;
6        char dir;
7        int idx;
8        Robot(int pos, int hel, char dir, int idx) {
9            this.pos = pos;
10            this.hel = hel;
11            this.dir = dir;
12            this.idx = idx;
13        }
14    }
15
16    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
17        // array of obj 
18        Robot[] robot = new Robot[positions.length];
19
20        for( int i=0; i<positions.length; i++) {
21            robot[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
22        }
23
24        // sort acc to position
25        Arrays.sort(robot, (a,b)-> a.pos - b.pos);
26
27        Stack<Robot> stack = new Stack<>();
28
29        for(Robot curr : robot) {
30            if(curr.dir == 'R') {
31                stack.push(curr);
32            }else {
33                // curr.dir == 'L'
34                while(!stack.isEmpty() && stack.peek().dir == 'R' && curr.dir == 'L') {
35                    // both hel is same both die
36                    if(stack.peek().hel == curr.hel) {
37                        stack.pop();
38                        curr = null;
39                        break;
40                    }
41                    // peek is bigger , curr die & peek --;
42                    else if(stack.peek().hel > curr.hel) {
43                        curr = null;
44                        stack.peek().hel --;
45                        break;
46                        // curr is bigger , peek die & curr --;
47                    }else {
48                        stack.pop();
49                        curr.hel --;
50                    }
51                }
52                
53                if(curr != null) {
54                    stack.push(curr);
55                }
56            }
57        }
58
59    int[] res = new int[positions.length];
60    for(Robot r : stack) {
61        res[r.idx] = r.hel;
62    }
63        
64    List<Integer> list = new ArrayList<>();
65    for(int i : res) {
66        if(i > 0){
67            list.add(i);
68        }
69    }
70    return list;  
71
72    }
73}