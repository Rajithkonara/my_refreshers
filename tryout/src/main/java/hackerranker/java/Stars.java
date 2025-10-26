package hackerranker.java;

public class Stars {
    public static void main(String[] args) {

        int depth = 4;

        for(int i=0;i<depth;i++){
            int nbDiez=i+1;
            int nbSpace=depth-nbDiez;
            while(nbSpace>0){
                System.out.print(" ");
                nbSpace-=1;
            }
            while(nbDiez>0){
                System.out.print('#');
                nbDiez-=1;
            }
            System.out.println("");
        }

    }
}
