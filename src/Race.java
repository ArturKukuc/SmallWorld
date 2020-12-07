public abstract class Race {

    private int startingUnits;
    private boolean isExtinct;

    public Race(int startingUnits, boolean isExtinct){
        this.startingUnits = startingUnits;
        this.isExtinct = isExtinct;
    }

    public Race(String name, int startingUnits){
        this(startingUnits, false);
    }

    public int getStartingUnits() {
        return startingUnits;
    }

    public boolean isExtinct() {
        return isExtinct;
    }

    public void extinctRace() {
        isExtinct = true;
    }

}