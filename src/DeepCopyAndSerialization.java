import java.io.*;
import java.rmi.server.ExportException;

public class DeepCopyAndSerialization {
    /*
    通过序列化来进行深拷贝
    本质和字节流拷贝非常像
     */
    public static void main(String[] args) {
        ByteArrayOutputStream bao = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            bao = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bao);
            User user1 = new User("lili",new Age(11),161);
            oos.writeObject(user1);
            oos.flush();

            ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
            User user2 = (User)ois.readObject();

            System.out.println("user1:"+user1);
            System.out.println("user2:"+user2);

            user1.setName("xxx");
            user1.setAge(new Age(99));
            user1.setLength(185);

            System.out.println("user1:"+user1);
            System.out.println("user2:"+user2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if( oos !=null){
                    oos.close();
                }
            }catch (IOException e ){
                throw  new RuntimeException(e);
            }finally {
                try {
                    if(ois != null){
                        ois.close();
                    }
                }catch (IOException e){
                    throw  new RuntimeException(e);
                }
            }
        }
    }

}
