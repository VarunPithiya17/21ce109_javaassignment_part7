import java.util.*;

class AccountHolder
{
    private int age;
    private float monthly_income;
    private int work_experience;
    private String citizenship;

    AccountHolder(int age,float monthly_income,int work_experience,String citizenship)
    {
        this.age=age;
        this.monthly_income=monthly_income;
        this.work_experience=work_experience;
        this.citizenship=citizenship;
    }

    boolean isEligible()
    {
        if(this.age>=21 && this.age<=60 && this.monthly_income>=15000 && this.work_experience>=1 && this.citizenship.equals("Indian"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class P7P3
{
    public static void main(String... args)
    {
        ArrayList<AccountHolder> arr=new ArrayList<AccountHolder>();

        arr.add(new AccountHolder(28,50000,3,"Indian"));
        arr.add(new AccountHolder(48,25000,20,"Indian"));
        arr.add(new AccountHolder(31,1000,1,"American"));
        arr.add(new AccountHolder(18,20000,0,"Indian"));
        arr.add(new AccountHolder(43,5200,5,"Pakistani"));

        for(AccountHolder A:arr)
        {
            if(A.isEligible())
            {
                System.out.println("Eligible for loan");
            }
            else
            {
                System.out.println("Not Eligible fot loan");
            }
        }
    }
}

