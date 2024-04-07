package com.demo.demo2.mode.handler.other;

import java.util.Objects;

public class Level {
    private String level;
    public Level(String level) {
        this.level = level;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level1 = (Level) o;
        return Objects.equals(level, level1.level);
    }
    @Override
    public int hashCode() {
        return Objects.hash(level);
    }
}
