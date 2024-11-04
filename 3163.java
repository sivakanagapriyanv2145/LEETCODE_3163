class Solution {
    public String compressedString(String word) {
          StringBuilder a = new StringBuilder();
        int i,j,count;
    for(i=0;i<word.length();i++){
        count=1;
        for(j=i+1;j<word.length();j++)
        {
            if(word.charAt(i)==word.charAt(j)){
                count++;
            
                if(count==9){
                    break;
                }
            }
            else{
                break;
            }
        }
            a.append(count).append(word.charAt(i));
            i+=count-1;
        
        
    }
 
        return a.toString();
    }
}
