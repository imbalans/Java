package Lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"11", "22", "33", "44"},
                {"111", "222", "333", "444"},
                {"1111", "2222", "3333", "4444"}};

        try{
            try{
                int result = check(arr);
                System.out.println("Сумма массива: " + result);
            } catch (MyArraySizeException e){
                System.out.println("Недопустимый размер массива!");
            }
        } catch (MyArrayDataException e){
            System.out.println("Недопустимый формат ячейки массива! \nОшибка в ячейке: " + e.i + "-" + e.j);
        }
    }

    public static int check(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
        if(arr.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++){
                if(arr[j].length != 4){
                    throw new MyArraySizeException();
                }
                try{
                    count = count + Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return count;
    }
}
