

public class Value {
    public static Value VOID = new Value(new Object());
    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Float asFloat() {
        return (Float)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

/*
public class Value {
    Float f;
    Boolean bl;

    public Value(Float f) {
        this.f = f;
    }

    public Value(Boolean bl) {
        this.bl = bl;
    }

    public Boolean asBoolean() {
        return bl;
    }

    public Float asFloat() {
        return f;
    }
}*/