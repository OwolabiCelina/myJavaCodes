package dataStructure;

public class Stack extends Vector{

    public void push(String item){
        add(item);
    }
    public boolean pop(){
        int initialCount = count;
        remove(count-1);
        return count==initialCount-1;
    }
    public String peek(String element){
        return element;
    }
    public String search(String element){
        return  element;
    }
    public boolean empty(){
        return false;
    }

    }

