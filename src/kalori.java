public class kalori{

    public double calcWomen( double weight, double height, int age){
        if ( weight<1 || height<1 ||  age<1){
            throw new IllegalArgumentException("Hiba! ez az érték nem jó!");
        }
        double result=  9.247 * weight + 3.098 * height - 4.330 * age + 447.593;
        return result;
    }

    public double calcMen( double weight, double height, int age ){
        if ( weight<1 || height<1 ||  age<1){
            throw new IllegalArgumentException("Hiba! ez az érték nem jó!");
        }
        double result= 13.397 * weight + 4.799 * height - 5.667 * age +88.362;

        return result;
    }
}