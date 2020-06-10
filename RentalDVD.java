
/**
 * 랜탈 DVD 할인 요금을 계산하는 소프트웨어
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민) 
 * @version (2020)
 */
public class RentalDVD
{
    /**calculate 나이와 구작여부에 맞는 요금을 return 해준다.
     * @param age 나이 
     * @param oldVideo 구작 여부
     * @return 나이와 구작 여부에 맞는 요금을 return 해준다.  
     */
    public double calculate(int age, boolean oldVideo){
        double discountRate = 0;
        if (age <= 18)
        {
        discountRate = 0.1;
        }
        return discountRate;
    }
}
