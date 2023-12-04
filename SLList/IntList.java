package SLList;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    /* ʹ�õݹ�����ȡ�б��ĳ���
    return the size of the list using ... recursion*/
    public int size(){
        if (rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }
    /*ʹ�õ������ı��б��Ĵ�С
    return the size of the list using no recursion ! */
    public int iterativeSize(){
        IntList p = this; //ָ�����
        int totalSize = 0;
        while (p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /*return the ith item of this Intlist. */
    public int get(int i){
        if (i == 0){
            return first;
        }
        return rest.get(i - 1);
    }


    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10,L);
        L = new IntList(5, L);

        System.out.println(L.get(1));//get ��һλ��ֵ
    }

}
//����ǰ
//        IntList L = new IntList();
//        L.first  = 5;
//        L.rest = null;
//
//        L.rest = new IntList();
//        L.rest.first = 10;
//
//        L.rest.rest = new IntList();
//        L.rest.rest.first = 15;