public class Trial {
  public static void main(String[] args){
    int countrycode = 832;

    if (countrycode == 852) {
      System.out.println("For Hong Kong number, please start dialing with " + countrycode);
    } else if (countrycode == 853) {
      System.out.println("For Macau number, please start dialing with " + countrycode);
    } else if (countrycode == 86) {
      System.out.println("For China number, please start dialing with " + countrycode);
    } else {
      System.out.println("Location is unknown");
    }
  }
  
}
