package lesson16;

public class MagicArray {
    int[] array;
    int cursor;//default value = 0

    public MagicArray(){
        array = new int[5];

    }
    void add(int value){
        //add one element
        //check if there is free space in the array
        //if not , need to add free space

        if (cursor == array.length -1){
            //make the array wider/larger//expand array
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }
    //dynamic expand array

    void add(int ... numbers){
        //to work with numbers is the same as int array link
        //System.out.println("several int values accepted. exactly : " + numbers.length);
        //System.out.println("each int has index as at array. index 0: " + numbers[0]);

        for (int i = 0 ; i < numbers.length; i++){
            add(numbers[i]);
        }
    }

    void expandArray(){
        System.out.println("expand array. cursor: " + cursor);
        //create new array twice larger
        //rewrite all values to new array from old array(till cursor)
        //new link

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        //give link. variable array keeps link of a new array
        System.out.println("array expand finished");
    }
    public  String toString(){
        //return string array representation

        if (cursor==0) return "[]";
        //in case of empty array

        String result = "[";
        for (int i = 0 ; i < cursor; i++){
            result = result + array[i] + (i < cursor -1 ? "," : "]");
        }
        return result;
    }
    int size(){
        return cursor;
    }

    //return value by index
    int get(int index){
        if(index >= 0 && index < cursor){
            return  array[index];
        }
        return Integer.MIN_VALUE;
        //there is no good variant for else case
        //need to think how to describe this case better
        //how to work correctly with index when it is incorrect
        //in case index is incorrect
    }
    int remove (int index){
        return -1;
    }

    /*
    remove element
    1 check validity
    2 delete value by index
    3 move cursor place when number of elements reduces
    4 return old value

     */

}
/*
1.add to array an element and
do not pay attention to index
 or array size
 2.dynamic change array size
 3.return string representation
 4.add to array several values
 5. current number of elements
 6. returns value by index
 7. delete element by index. then method returns old value

 */
