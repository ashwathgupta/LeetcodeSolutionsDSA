class Solution {

    
    public String intToRoman(int num) {
        
        
        String result = "";
        int div=1000,q=0,x=0;
        
        
        while(num>=0)
        {

            q=num/div;
            
            if(q>0){
                
                x=(int)Math.log(div)/ (int )Math.log(10);
                int rem=num%div;
                
        
                if(x==3){
                    result=result.concat("M");
                num-=1000;
                }
                if(x==2){
                    if(num>=900)
                    {
                        result=result.concat("CM");
                        num=num-900;
                    }
                    else if(num>=500)
                    {
                        result=result.concat("D");
                        num=num-500;
                    }
                    else if(num>=400)
                    {
                        result=result.concat("CD");
                        num=num-400;
                    }
                    else{
                    result=result.concat("C");
                    num=num-100;}
                }
                if(x==1){
                    if(num>=90)
                    {
                        result=result.concat("XC");
                        num=num-90;
                    }
                   else if(num>=50)
                    {
                        result=result.concat("L");
                        num=num-50;
                    }
                     else if(num>=40)
                    {
                        result=result.concat("XL");
                        num=num-40;
                    }
                    else{
                    result=result.concat("X");
                    num=num-10;}
                }

                
                if(num==1){result=result.concat("I");num-=1;}
                if(num==2){   result=result.concat("II");num-=2;  }
                if(num==3) {result=result.concat("III"); num-=3;}
                if(num==4) {result=result.concat("IV");num-=4;}
                if(num==5) {result=result.concat("V");num-=5;}
                if(num==6) {result=result.concat("VI");num-=6;}
                if(num==7) {result=result.concat("VII");num-=7;}
                if(num==8) {result=result.concat("VIII");num-=8;}
                if(num==9) {result=result.concat("IX");num-=9;}
               
               
                

            }
           
           if(num/div==0)
           {
                div=div/10;
           }
           
            if(div==0)
            {
                break;
            }

        }
        
return result;
    }
}
