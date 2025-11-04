package Practice;


public class finalVariableDemo {
    final String COMPANY_NAME="TechCorp";
    final double TAX_RATE;
    finalVariableDemo(double taxRate){
        this.TAX_RATE=taxRate;
    }
    void showInfo(){
        System.out.println("Company:"+COMPANY_NAME);
        System.out.println("Tax Rate:"+TAX_RATE);
    }
    public static void main(String[] args){
        finalVariableDemo demo= new finalVariableDemo(18.5);
        demo.showInfo();
    }
}
