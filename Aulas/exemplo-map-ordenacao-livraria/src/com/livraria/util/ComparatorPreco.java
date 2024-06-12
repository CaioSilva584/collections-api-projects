package com.livraria.util;

import com.livraria.model.Livro;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPreco implements Comparator<Map.Entry<String, Livro>> {


    @Override
    public int compare(Map.Entry<String, Livro> m1, Map.Entry<String, Livro> m2) {
        return Double.compare(m1.getValue().getPreco(), m2.getValue().getPreco());
    }
}
