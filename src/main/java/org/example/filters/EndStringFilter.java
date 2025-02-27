package org.example.filters;

public class EndStringFilter extends Filter {
    public EndStringFilter(String pattern) {
        super(pattern);
    }

    @Override
    public boolean apply(String str) {
        return str.endsWith(pattern);
    }
}
