package org.example.filters;

public class CaseInsensitiveStringFilter extends Filter {
    public CaseInsensitiveStringFilter(String pattern) {
        super(pattern);
    }

    @Override
    public boolean apply(String str) {
        return str.toLowerCase().contains(pattern.toLowerCase());
    }
}
