package Lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        try {
            try {
                int result = check(arr);
                System.out.println("Сумма массива: " + result);
            } catch (MyArraySizeException e){
                System.out.println("Превышен размер массива!!!");
            }
        } catch (MyArrayDataException e){
            System.out.println("Некорректное значение массива!!! \nОшибка в ячейке: " + e.i + " - " + e.j + "!");
        }
    }

    public static int check(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != 4){
                throw new MyArraySizeException();
            }
            for(int j = 0; j < arr[i].length; j++){
                if(arr[j].length != 4){
                    throw new MyArraySizeException();
                }
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return count;
    }
}