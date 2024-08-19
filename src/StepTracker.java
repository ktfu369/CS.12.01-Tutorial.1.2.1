public class StepTracker {
    int minSteps = 0;
    int totalSteps = 0;
    int totalDays = 0;
    int activeDays = 0;
    int activeSteps = 0;
    public StepTracker(int x){
        minSteps = x;
    }

    public int getActiveDays(){
        return activeDays;
    }

    public int activeDays(){
        return activeDays;
    }

    public int getDays(){
        return totalDays;
    }

    public double averageSteps(){
        if(totalDays == 0) return 0;
        return 1.0 * totalSteps / totalDays;
    }

    public int getStepsForActiveDay(){
        return minSteps;
    }

    public int getTotalSteps(){
        return totalSteps;
    }

    public void addDailySteps(int x){
        if(x >= minSteps){
            activeDays++;
            activeSteps += x;
        }
        totalDays++;
        totalSteps += x;
    }
}
