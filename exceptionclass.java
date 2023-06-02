
class account{
    float balance;
    account(float b){
        balance =b;

    }

    
    void withdraw(float money){
        try{
            if(balance <money){
                throw new insufficientexception("no sufficient balance");
            }
            else{
                balance = balance - money;
            }
            System.out.println(" the available balance is " + balance);
        }
        catch(insufficientexception e){
            a.printStackTrace();

        }
    }
}

class insufficientexception extends RuntimeException
{
    String msg;
    insufficientexception(String m){
        msg = m;
    }

    @Override
    public String toString(){
        // return msg;
        return this.getClass().getName()+ " : "+msg;
    }
}

//example of unchecked exception 

public class exceptionclass {
    public static void main(String[] args){
        account myaccount = new account(1000);
        myaccount.withdraw(500);
        myaccount.withdraw(5000);    
    
    
    }
    
}
