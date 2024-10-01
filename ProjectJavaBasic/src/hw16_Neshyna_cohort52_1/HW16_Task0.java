package hw16_Neshyna_cohort52_1;

import lesson12.ArraysUtils;
import lesson16.MagicArray;

import java.util.Arrays;

public class HW16_Task0 {

    int[] array;
    int cursor ;


    public HW16_Task0() {

        array = new int[4];//array created with n elements

    }

    void addElement(int element) {

        if (cursor == array.length -1){
            MagicArray();
        }

        array[cursor] = element;
        cursor++;
    }

    public String printArray(int [] array) {

        if (cursor <= 0) {
            return "[]"; // Return empty array representation if cursor is 0 or negative
        }

        String printArray = "[";
        for (int k = 0; k < cursor; k++) {
            printArray = printArray + array[k] + (k < cursor - 1 ? "," : "]");

        }
        return printArray;
    }
    public int indexOf(int value, int[] array){

        int i = 0;

        while ( i < array.length){

            if (array[i] == value){
                return i;
            }
            i++;
        }
        return -1;
    }
    public int valueOf(int index){

        for (int i = 0; i < array.length; i++){
            if(index >= 0 && i < cursor){
                return array[index];
            }return  -1;
        }return index;
    }

    public int currentNumberOfElements(){
        return cursor;
    }

    void addMultipleElements(int ... numbers){
        for (int i = 0 ; i < numbers.length; i++){
            addElement(numbers[i]);
        }
    }

    void MagicArray() {

        int[] magicArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            magicArray[i] = array[i];
        }
        array = magicArray;
    }

     public int[] removeByIndex (int indexToDelete){

        if( indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("index not found");
            return array;
        }

        int [] newArray = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length ;i++){
            if(i != indexToDelete){
                newArray[j++] = array[i];
            }
        }
        System.out.println("remove by index: " + printArray(newArray));
        return newArray;
    }


    public int[] removeByValue (int valueToDelete){

        int indexToDelete = -1;
        for(int i = 0; i < array.length; i++){
            if (array[i] == valueToDelete){
               indexToDelete = i;
               break;
            }
        }
        int [] newArray2 = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length ;i++){
            if(i != indexToDelete){
                newArray2[j++] = array[i];
            }
        }
        System.out.println("remove by value: " + printArray(newArray2));
        return newArray2;
    }


}
