package date9_19;

/**
 * Created by I334189 on 9/19/2016.
 */
public class FrogJump {
    public boolean canCross(int[] stones){
        int gap = stones[1];
        boolean canCross = true;
        int i = 1;
        while (i<stones.length-1){
            int step = stones[i+1] - stones[i];
            if (inRange(step,gap)){
                if(step!=gap)
                    gap = step;
            }else{
                canCross = false;
                break;
            }
            i++;
        }
        return canCross;
    }
    private boolean inRange(int step,int gap){
        if(step==gap || step == gap-1 || step==gap+1)
            return true;
        return  false;
    }

    public static void main(String[] args){
        FrogJump frogJump = new FrogJump();
        int[] stones = {0,1,2,3,4,8,9,11};
        System.out.print(frogJump.canCross(stones));
    }
}
