package welcome;

public class Dog {
    public int weightInPounds;//实例变量instance variable

    public Dog(int startingWeight){//解释器Constructor(not a method)确定如何实例化类
        weightInPounds = startingWeight;
    }

    public void makeNoise(){//如果方法需要调用一个实例则必须为非静态
        if (weightInPounds < 10){
            System.out.println("yipyipyip");
        } else if (weightInPounds < 30){
            System.out.println("bark.bark");
        } else {
            System.out.println("woof!");
        }
    }
    //如果该方法需要使用我的实例变量，则该方法必须是非静态的
    // if the method needs to use my instance variables the method must be non-static

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }
}
