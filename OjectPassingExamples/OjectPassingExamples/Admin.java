package OjectPassingExamples;

public class Admin {
    

    void check_registration(Student S)
    {
        if(S.id == 3421 && S.total_dues < 100000)
        {
            System.out.println("Payment Clearance not done printed");
        }
    }
}
