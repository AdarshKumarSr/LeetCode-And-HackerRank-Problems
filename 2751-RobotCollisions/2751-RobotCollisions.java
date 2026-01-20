// Last updated: 1/20/2026, 5:32:25 PM
1class Solution {
2    class Robot {
3        int pos;
4        int hel;
5        char dir;
6        int idx;
7        Robot(int pos, int hel, char dir, int idx) {
8            this.pos = pos;
9            this.hel = hel;
10            this.dir = dir;
11            this.idx = idx;
12        }
13    }
14    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
15        // array of obj 
16        Robot[] robot = new Robot[positions.length];
17
18        for( int i=0; i<positions.length; i++) {
19            robot[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
20        }
21        // sort acc to position
22        Arrays.sort(robot, (a,b)-> a.pos - b.pos);
23
24        Stack<Robot> stack = new Stack<>();
25
26        for(Robot curr : robot) {
27            if(curr.dir == 'R') {
28                stack.push(curr);
29            }else {
30                // curr.dir == 'L'
31                while(!stack.isEmpty() && stack.peek().dir == 'R' && curr.dir == 'L') {
32                    // both hel is same both die
33                    if(stack.peek().hel == curr.hel) {
34                        stack.pop();
35                        curr = null;
36                        break;
37                    }
38                    // peek is bigger , curr die & peek --;
39                    else if(stack.peek().hel > curr.hel) {
40                        curr = null;
41                        stack.peek().hel --;
42                        break;
43                        // curr is bigger , peek die & curr --;
44                    }else {
45                        stack.pop();
46                        curr.hel --;
47                    }
48                }
49                
50                if(curr != null) {
51                    stack.push(curr);
52                }
53            }
54        }
55
56    int[] res = new int[positions.length];
57    for(Robot r : stack) {
58        res[r.idx] = r.hel;
59    }
60        
61    List<Integer> list = new ArrayList<>();
62    for(int i : res) {
63        if(i > 0){
64            list.add(i);
65        }
66    }
67    return list;  
68    }
69}