import java.util.Scanner;

public class RotateMatrix {

    public static void rotateMatrix(int[][] array,int row,int col)
    {
        int temp=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i<j)
                {
                    temp=array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                temp=array[i][j];
                array[i][j]=array[i][array.length-1-j];
                array[i][array.length-1-j]=temp;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]= scanner.nextInt();
            }
        }
        rotateMatrix(array,row,col);
    }
}
