public class NaturalNumber {

    private int value;
    
    public NaturalNumber(int valueNumeric){
        if(valueNumeric <= 0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        
        this.value = valueNumeric;
    }
    
    public Classification getClassification() {


        int aliquotSum = aliquotSum(this.value);

        if(aliquotSum>this.value){
            return Classification.ABUNDANT;  
        }else if(aliquotSum == this.value){
            return Classification.PERFECT;
        }else{
           return Classification.DEFICIENT; 
        } 
    }

    private int aliquotSum(int value){
        int res = 0;
        for(int natural=1;natural<value;natural++){
            if(value%natural == 0){
                res += natural;
            }
        }
        return res;
    }

}
