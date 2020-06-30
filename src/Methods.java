import java.io.*;

public class Methods {

    public void serialize(Object[] o) {
        File file = new File("C:\\Users\\sasha\\IdeaProjects\\IOStreamHomeWork\\src\\employee.data");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(o);
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Object[] deserialize() throws InvalidObjectException {
        File file = new File("C:\\Users\\sasha\\IdeaProjects\\IOStreamHomeWork\\src\\employee.data");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            return (Object[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        } finally {
            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object faile");
    }
}
