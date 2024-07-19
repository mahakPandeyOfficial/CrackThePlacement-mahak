class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int [] nsr = new int[heights.length];  
        int [] nsl = new int[heights.length];

        //next Smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i = heights.length-1; i>=0; i--){      //Right se Start karo
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;  //n ko store kara do
            }else{
                nsr[i] = s.peek();   //Top ko store kara do
            }

            //push index into stack
            s.push(i);
        }

        //next Smaller Left
        s = new Stack<>();

        for(int i = 0; i<heights.length; i++){       //Left se Start karo
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;  //not found
            }else{
                nsl[i] = s.peek();   //Top ko store kara do
            }

            //push index into stack
            s.push(i);
        }

        //Current Area : width = j-i-1 : nsr[i]-nsl[i]-1
        for(int i = 0; i<heights.length; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

     return maxArea;
    }
}
