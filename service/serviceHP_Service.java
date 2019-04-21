package service; 

import java.util.LinkedList;
import java.util.List;

import model.HP;

public class  serviceHP_Service{

    private static List<HP> data = new LinkedList<>();

    public void addData(HP hp) {
        data.add(hp);
        System.out.println("data telah tersimpan");
    }

    public void updateData(HP hp) {
        int result = data.indexOf(hp);
        
        if(result >= 0) {
            data.set(result, hp);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(HP hp) {
        int result = data.indexOf(hp);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<HP> getAllData() {
        return data;
    }

}