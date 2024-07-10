
public class Employee {
    int id;
    String name;

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    public static void main(){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "sachin";
        e1.id=1;
        e2=e1;
        if(e1==e2){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}

