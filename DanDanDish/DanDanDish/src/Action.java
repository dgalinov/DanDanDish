
public enum Action {
    LOAD,
    COVER,
    SHOOT;

    public static Action valueOf(int action) {
        for (Action a : Action.values()) {
            if(a.ordinal() == action-1) return a;
        }
        return null;
    }
}
