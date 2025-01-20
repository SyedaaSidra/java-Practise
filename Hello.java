class Hello
{
    public static void main(String arg[])
    {
    //jagged array: 2D array in which we are using different length for each row;
      int nums[][]=new int[3][];

      nums[0]=new int[4];
      nums[1]=new int[3];
      nums[2]=new int[5];


      for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums[i].length;j++){
            nums[i][j]=(int)(Math.random()*100);
          }
      }

      for(int numsArray[]:nums){
         for(int n:numsArray){
            System.out.print(n+ " ");
         }
         System.out.println();
      }
}}
