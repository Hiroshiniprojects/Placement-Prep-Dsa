//Longest Subarray With Sum K.
//the loop hole:here is the major part is using hashmap-one single for loop
//if the sum==k we will take the direct length and update the max value
//then if the sum is not directly equal to k we use the logic like k,x-k where x is the prefix sum or the sum so if we sub the values
//and that remaining value exist in the hashmap we get the length-(current len(i),get the index from the map element) and take the len if the key contains
//maxlen(the maxlen,len) then the if condition is the key does not exist in map put that
HashMap<Integer,Integer>map=new HashMap<>();
     int maxlen=0;
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum==k){
            maxlen=Math.max(maxlen,i+1);
        }//full length i-0+1 which is the actual len when full prefix sum is found
        int rem=sum-k;
        if(map.containsKey(rem)){
        int len=i-map.get(rem);
        maxlen=Math.max(maxlen,len);
        }
        if(!map.containsKey(rem)){
        map.put(sum,i);
        }
     }
     return maxlen;
