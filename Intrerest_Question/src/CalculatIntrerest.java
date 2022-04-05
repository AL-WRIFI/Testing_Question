public class CalculatIntrerest {

public double AccountIntreset(double balance){
    double interest=0;
    if(balance<0)
        throw new IllegalArgumentException("invalid account balance !!!");

    if(balance>=0 && balance<=100)
        interest+=0.03*balance;

    if(balance>100 && balance<1000)
        interest+=0.05*balance;

    if(balance>=1000)
        interest+=0.07*balance;
return interest;
}
}
