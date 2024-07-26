package com.falabella.utils;

public class  AlmacenDinamico {
    private static int iterable = 0;
    private static int iterableRowExcel = 1;

    public static void setIterador(int nuevoValor)
    {
        iterable = nuevoValor;
    }
    public static int getIterador()
    {
        return iterable;
    }

    public static void setIterableRowExcel(int nuevoValor)
    {
        iterableRowExcel = nuevoValor;
    }
    public static int getIterableRowExcel()
    {
        return iterableRowExcel;
    }

}
