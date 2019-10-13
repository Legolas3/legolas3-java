package ryan.star_wars;

public class TheForce extends AGalaxyFarFarAway implements UseForce {
    private boolean isJedi;

    public void setIsJedi(boolean isJedi) {
        this.isJedi = isJedi;
    }

    public boolean getIsJedi() {
        return this.isJedi;
    }

    public TheForce(boolean isJedi) {
        setIsJedi(isJedi);
    }
}
