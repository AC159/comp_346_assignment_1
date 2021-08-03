
public class Transactions {
    
    private String accountNumber;       /* Account number */
    private String operationType;       /* Operation type : deposit, withdrawal, query */
    private double transactionAmount;   /* Amount to deposit or withdraw */
    private double transactionBalance;  /* Account balance after transaction */
    private String transactionError;    /* Transaction error : NSF, invalid amount, invalid account, none */
    private String transactionStatus;   /* Current transaction status : pending, sent, received, transferred, done */
    
    /** Constructor method of Transactions class */
    Transactions() {
        accountNumber = " ";
        operationType = " ";
        transactionAmount = 0.00;
        transactionBalance = 0.00;
        transactionError = "none";
        transactionStatus = " ";
    }
    
     /**
      *  Accessor method of Transactions class
     * 
     * @return accountNumber
     */
     public String getAccountNumber()
     {
         return accountNumber;
     }
         
    /**
     *  Mutator method of Transactions class
     *
     */
     public void setAccountNumber(String accNumber)
     { 
         accountNumber = accNumber;
     }
     
    /**
     *  Accessor method of Transactions class
     * 
     * @return operationType
     */
     public String getOperationType()
     {
         return operationType;
     }
         
    /**
     *  Mutator method of Transactions class
     *
     */
     public void setOperationType(String opType)
     { 
         operationType = opType;
     }
     
    /**
     *  Accessor method of Transactions class
     * 
     * @return transactionAmount
     */
     public double getTransactionAmount()
     {
         return transactionAmount;
     }
         
    /**
     *  Mutator method of Transactions class
     *
     */
     public void setTransactionAmount(double transAmount)
     { 
         transactionAmount = transAmount;
     }
     
    /**
     *  Accessor method of Transactions class
     * 
     * @return transactionBalance
     */
     public double getTransactionBalance()
     {
         return transactionBalance;
     }
         
    /**
     *  Mutator method of Transactions class

     */
     public void setTransactionBalance(double transBalance)
     { 
         transactionBalance = transBalance;
     }
     
    /**
     *  Accessor method of Transactions class
     * 
     * @return transactionError
     */
     public String getTransactionError()
     {
         return transactionError;
     }
     
    /** 
     * Mutator method of Transactions class
     */
     public void setTransactionError(String transError)
     { 
         transactionError = transError;
     }
     
    /**
     *  Accessor method of Transactions class
     * 
     * @return transactionStatus
     */
     public String getTransactionStatus() {
         return transactionStatus;
     }
     
    /**
     *  Mutator method of Transactions class
     */
     public void setTransactionStatus(String transStatus) {
         transactionError = transStatus;
     }
     
    /**
     *  Create a String representation based on the Transactions Object
     * 
     * @return String representation
     */
    public String toString() {
    	return ("\n Account number " + getAccountNumber() + " Account Balance " + getTransactionBalance() + " Message " + getTransactionError());
    }

}

