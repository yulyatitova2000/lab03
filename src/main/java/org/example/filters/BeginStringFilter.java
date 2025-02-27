package org.example.filters;

public class BeginStringFilter extends Filter {
    public BeginStringFilter(String pattern) {
        super(pattern);
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }
}
