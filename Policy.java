public class Policy
{
   private String policyNumber; //Policy Number
   private String providerName; //Provider Name
   private String fName; //Policyholder’s First Name
   private String lName; //Policyholder’s Last Name
   private int age; //Policyholder’s Age
   private String smokingStatus; //Policyholder’s Smoking Status (“smoker” or “non-smoker”)
   private double height; //Policyholder’s Height (in inches)
   private double weight; //Policyholder’s Weight (in pounds)
   
   //no-arg constructor
   public Policy()
   
   {
      policyNumber = "";
      providerName = "";
      fName = "";
      lName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;  
   }
   
    public Policy(String policyNum, String provName, String f, String l, int a, String s, double h, double w)   
   {
      policyNumber = policyNum; 
      providerName = provName;
      fName = f;
      lName = l;
      age = a;
      smokingStatus = s;
      height = h;
      weight = w;
   }

/**
   Mutator method for the policy number
*/
   public void setpolicyNumber(String policyNum)
   {
      policyNumber = policyNum;
   }
   
/**
   Mutator method for the provider name
*/
   public void setproviderName(String provName)
   {
      providerName = provName;
   }

/**
   Mutator method for the Policyholder’s First Name
*/
   public void setfName(String f)
   {
      fName = f;
   }

/**
   Mutator method for the Policyholder’s Last Name
*/
   public void setlName(String l)
   {
      lName = l;
   }

/**
   Mutator method for the Policyholder’s Age
*/
   public void setAge(int a)
   {
      age = a;
   }
   
/**
   Mutator method for the Policyholder’s Smoking Status
*/
   public void setsmokingStatus(String s)
   {
      smokingStatus = s;
   }

/**
   Mutator method for height
*/
   public void setHeight(double h)
   {
      height = h;
   }

/**
   Mutator method for weight
*/

   public void setWeight(double w)
   {
      weight = w;
   }
   
 
   //accessor methods
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return fName;
   }
   
   public String getLastName()
   {
      return lName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
      
   //Calculates the Policyholder's BMI
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   //Calculates the Policy's price
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;   
   }
}