class Assignment2_2
{
public static void main(String args[])
{
int length = 5;

int width = 5;

for(int i=0; i<width; i++){
    for(int j=0; j<length; j++){
        if(i==j  || (i+j)%width==width-1){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }System.out.println();
}
}
}