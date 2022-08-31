package four;

import java.util.LinkedList;
import java.util.Objects;

public class CustomHashMap<K,V> {
    private LinkedList<K> ks = new LinkedList<>();
    private LinkedList<V> vs = new LinkedList<>();
    //put for not exist key or replace for exist key
    public void put(K key,V value){
        if (ks.contains(key)){
           int index = ks.indexOf(key);
           vs.remove(index);
           vs.add(index,value);
        }else {
            ks.add(key);
            vs.add(value);
        }
    }

    public boolean containsKey(K key){
        return ks.contains(key);
    }

    public boolean isEmpty(){
        return ks.isEmpty();
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < ks.size(); i++) {
            temp += ks.get(i).toString() + " = " + vs.get(i).toString() + "\n";
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomHashMap<?, ?> that = (CustomHashMap<?, ?>) o;
        return ks.equals(that.ks) && vs.equals(that.vs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ks, vs);
    }
}
