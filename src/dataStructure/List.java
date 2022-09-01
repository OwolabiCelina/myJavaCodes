package dataStructure;

public interface List {
   void remove(int id);
   void add(String item);
   String get(int id);
   int size();
   boolean isEmpty();
   boolean contains();
   void set(int id, String item);

   boolean contains(String item);

   void clear();
   void remove(String item);

}
