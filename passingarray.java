public class passingarray {

    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i]+=1;
        }
    }

    public static void main(String args[]){
        int ar[] = {1,2,3,4,5};
        update(ar);
        System.out.println("ater updatation\n");
        for(int i = 0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
