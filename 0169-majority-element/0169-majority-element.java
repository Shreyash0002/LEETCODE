
class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
      for (Map.Entry<Integer,Integer> mapElement : map.entrySet())
      {
         int key=mapElement.getKey();
          int value=mapElement.getValue();
          if(value>(int)(nums.length)/2)
              return key ;
      }
   return 0;
    }
}