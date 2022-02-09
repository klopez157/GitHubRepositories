public class Policy
{
   private int policyNum; //Policy Number
   private String providerName; //Provider Name
   private String fName; //Policyholder’s First Name
   private String lName; //Policyholder’s Last Name
   private int age; //Policyholder’s Age
   private String smokeStat //Policyholder’s Smoking Status (“smoker” or “non-smoker”)
   private double height; //Policyholder’s Height (in inches)
   private double weight; //Policyholder’s Weight (in pounds)
   
   //no-arg constructor
   public Policy();
   
   {
      policyNum = 0;
      providerName = "";
      fName = "";
      lName = "";
      age = 0;
      smokerNosmoker = "";
      height = 0;
      weight = 0;  
   }
   
    public Policy(int policyNum, String provName, String f, String l, int a, String s, String h, String w)   
   {
      policyNumber = policyNum; 
      providerName = provName;
      fName = f;
      lName = l;
      age = a;
      smokeStat = s
      height = h;
      weight = w;
   }

/**
   Mutator method for the policy number
*/
   public void setpolicyNum(String policyNum)
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
   public void setsmokeStat(int a)
   {
      age = a;
   }

//setSmokingStatus - this method accepts and tells the smoking status and stores it in the smokStatus field.
   public void setSmokingStatus(boolean smokStatus)
   {
      smokingStatus = smokStatus;
   }

}