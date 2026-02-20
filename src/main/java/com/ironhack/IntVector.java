package com.ironhack;

public class IntVector implements IntList{
    private int[] array;
    private int size;

    public IntVector(){
        array = new int[20];
        size = 0;
    }

    @Override
    public void add(int number){
        if (size == array.length){
            int newArraySize = array.length * 2;
            int[] newArray = new int[newArraySize];
            for (int i=0; i<array.length; i++){
                newArray[i]=array[i];
            }
            newArray[array.length+1] = number;
            setArray(newArray);
            size++;
        }
        array[size] = number;
        size++;
    }

    @Override
    public int get(int id){
        return array[id];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
