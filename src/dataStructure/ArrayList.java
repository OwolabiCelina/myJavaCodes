package dataStructure;

import java.util.Objects;

public class ArrayList implements List {
    private int count;
    private boolean isEmpty = true;
    private boolean contains;
    private  String[] element = new String[5];

    @Override
    public void remove(int id) {
        element[id] = null;
        count--;
    }

    @Override
    public void add(String item) {
        isEmpty = false;
        element[count] = item;
        count++;
    }
    public void add(int id, String item){
        isEmpty = false;
        for (int i = item.length() - 1; i > id; i--){
            element[id] = element[i - 1];
        }
        element[id] = element[id];
        count++;
    }
    public boolean contains(String item) {
        for (String b : element) {
            if (Objects.equals(b, item)) {
                contains = true;
                break;
            }
        }
        return contains;

    }

    @Override
    public String get(int id) {
        return element[id];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public void set(int id, String item) {
        element[id] = item;

    }

    @Override
    public void remove(String item) {
        for (int count = 0; count < item.length(); count++) {
            if (Objects.equals(element[count], item)) {
                element[count] = null;
            }
        }
        count --;
    }
    @Override
    public void clear(){
        for (int item = 0; item < element.length; item++){
            element[item] = null;
        }
        count = 0;
        isEmpty = true;
    }
}
