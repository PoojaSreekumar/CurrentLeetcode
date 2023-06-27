package com.interview.amazon;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		System.out.println(new GasStation().canCompleteCircuit(gas, cost));

	}
	//leetcode
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,avail=0,index=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            avail+=gas[i]-cost[i];
            if(avail<0){
                avail=0;
                index=i+1;
            }
        }
        if(total<0){
            return -1;
        }
        return index;
    }

	//mine
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        if(gas.length==1){
            if(gas[0]-cost[0]<0)
                return -1;
            return 0;
        }
        for(int i=0;i<gas.length;i++){
            
            if(gas[i]-cost[i]>0){
                int next= circuit(gas,cost,i);
                if(next==i){
                    return i;
                }
            }
        }
        return -1;
    }

    public int circuit(int[] gas,int[] cost,int start){
        int count=0;
        //int nextPos=0;
        int costToNext=0;
        while(count<gas.length){
            costToNext=costToNext+gas[start]-cost[start];
            if(costToNext>=0){
                start++;
                count++;
            }
            else{
                return -1;
            }
            if(start==gas.length){
                start=0;
            }

        }
        return start;
    }

}
