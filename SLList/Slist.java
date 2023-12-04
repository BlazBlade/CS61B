package SLList;

//�������

import Implements.List61B;

/**An Slist is a list of integers, which hides the terrible truth of the nakedness within
 */

//���û���ⲿ��ʹ�ã�������Ϊ˽�е�
public class Slist<LochNess>  {

    private static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i , IntNode n ){
            item = i;
            next = n;
//            System.out.println(size);
        }
    }

    //please do not mess with first
    /*The first item (if it exists) is at sentinel.next*/
    private  IntNode sentinel; //�ڱ�����
    private int size;

    private static void lectureQuestion(){
        Slist L = new Slist();
        IntNode n = new IntNode(5,null);
    }
    /** Create an empty Slist*/

    public Slist(){
        sentinel = new IntNode(63,null);//����һ���ڵ�
        size = 0;
    }

    
    public Slist(int x ){
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }



    /** Add x to the front of the list*/
    public void addFirst(int x){
        sentinel.next = new IntNode(x,sentinel.next);
        size = size + 1;

    }

    /** Return the first item in the list*/
    public int getFirst(){
        return sentinel.next.item;
    }

    /** Add an item to the end of the list*/
    public void addLast(int x){
        size = size + 1;
        IntNode p = sentinel;



        /* Move p until it reaches the end of the list*/
        while (p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

//    /** return the size of the list that starts at IntNOde p */
//    private static int size(IntNode p){
//        if (p.next == null){
//            return 1;
//        }
//        return 1+size(p.next);
//    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        //create a list of one integer, namely 10
        Slist L= new Slist(); //����һ�����б�
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println("list.size = "+L.size());

    }

}


/*��ζž�special cases?
ʹ���е��б�ӵ����ͬ�Ľṹ
* */