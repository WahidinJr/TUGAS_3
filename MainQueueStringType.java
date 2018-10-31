
public class MainQueueStringType {
    public static void main(String[] args){
        QueueStringType q = new  QueueStringType();
     
        q.insert("Wahidin");
        q.insert("Hendra");
        q.insert("Abdillah");
       
        System.out.println("List Nama Mahasiswa :");
        String o1 = q.get();
        System.out.println( "1 : " +o1);
        String o2 = q.get();
         System.out.println("2 : " +o2);
        String o3 = q.get();
         System.out.println("3 : " +o3);
        String o4 = q.get();
        System.out.println(o4);
    }
}
