package Alists;

/** Array based list.
 * @author CloudH2O
 */

//index   0 1  2 3 4 5 6
//items: [6 9 -1 2 0 0 0 ...]
//size : 4

import Implements.List61B;

/** Invariants: 不变量
*   addLast: The next itrem we want to add, will go into position size
*   size: The number of items in the list should be size.
*   getLast: return position size -1 item
*/

public class AList<Item> implements List61B<Item> {
    private Item[] items;
    private  int size;

    /** Create an empty ;ost*/
    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity*/
    private void resize(int capacity){//任意变量
            Item [] a = (Item[]) new Object[capacity];
            System.arraycopy(items,0,a,0,size);
            items = a;
    }

    @Override
    public void addFirst(Item x) {
        insert(x,0);
    }

    /** insert X into the back of the list.*/
    @Override
    public void addLast(Item x ){
        if(size == items.length){
            resize(size + 1); //rfactor 因子
        }
        items[size] = x;
        size += 1;
    }

    @Override
    public Item getFirst() {
        return null;
    }

    /**Return the item from the back of the list */
    public Item getLast(){
        return items[size - 1];
    }

    @Override
    public Item removeLast() {
        return null;
    }

    public Item get(int i ){
        return items[i];
    }

    @Override
    public void insert(Item x, int position) {

    }

    public int size(){
        return size;
    }
    public Item removerLast(){
        Item x = getLast();
        items[size -1] = null;
        size = size - 1;
        return x;
    }

}
