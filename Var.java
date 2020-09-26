public class Var {
    int level;
    Value val;

    public Var() {
        level = 0;
        val = null;
    }

    public Var(int level, Value val) {
        this.level = level;
        this.val = val;
    }

    public int getLevel() {
        return level;
    }

    public Value getVal() {
        return val;
    }
}