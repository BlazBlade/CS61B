package welcome;

public class Dog {
    public int weightInPounds;//ʵ������instance variable

    public Dog(int startingWeight){//������Constructor(not a method)ȷ�����ʵ������
        weightInPounds = startingWeight;
    }

    public void makeNoise(){//���������Ҫ����һ��ʵ�������Ϊ�Ǿ�̬
        if (weightInPounds < 10){
            System.out.println("yipyipyip");
        } else if (weightInPounds < 30){
            System.out.println("bark.bark");
        } else {
            System.out.println("woof!");
        }
    }
    //����÷�����Ҫʹ���ҵ�ʵ����������÷��������ǷǾ�̬��
    // if the method needs to use my instance variables the method must be non-static

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }
}
