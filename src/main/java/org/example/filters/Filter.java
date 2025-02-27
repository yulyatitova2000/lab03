package org.example.filters;

public abstract class Filter implements IFilter {
    String pattern;

    public Filter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return false;
    }
}