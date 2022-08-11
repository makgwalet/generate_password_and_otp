public class Main {
    public static void main(String[] args) {
        System.out.println("unique password ="+generatePassword());

        String otpSting  =generateOTP();//function calling
        System.out.println("OTP : "+otpSting);
    }

    public static long Code() //this code returns the  unique 16 digit code
    { //creating a 16 digit code using Math.random function
        long code = (long) ((Math.random()*9*Math.pow(10,15))+Math.pow(10,15));
        return code;
    }

    public static String generatePassword(){
        long code = Code();
        String uniquePassword = "";

        for (long i=code;i !=0; i/=100) //a loop extracting 2 digits from the code
        {
            long digit = i%100; //extracting two digits
            if (digit <=90)
                digit+=32;

            //converting those two digits(ascii value) to its character value
            char ch = (char) digit;
            // adding 32 so that our least value be a valid character
            uniquePassword = ch+uniquePassword;
        }
        return uniquePassword;
    }

    public static String generateOTP(){
        //int randomPin declared to store the otp
        //since we using Math.random() hence we have to type cast it int
        //because Math.random() returns decimal value
        int randomPin = (int) ((Math.random()*9000)+1000);
        String otp = String.valueOf(randomPin);
        return otp;
    }
}

