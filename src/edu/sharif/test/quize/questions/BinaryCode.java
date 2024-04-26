package edu.sharif.test.quize.questions;

public class BinaryCode {
    public BinaryDto binaryCode(int x){
        String b= ""; //intToBinary(x); //binary code String
        int y=2; /*IMPORTANT*/
        int s;
        if(x<0){
            s=0;
            x = -x;
            b = concat(1,b);
        }else{
            s=2;
            b= concat(0,b);
        }

        if(x==0){
            b = concat(0,b);
        }

        while (x>0){
            DivDto divResult= divxy(x,y);
            int t= divResult.getS();
            int q= divResult.getQ();
            int r= divResult.getR();

            if(t>2){
                b= concat(r,b);
                x=q;
            }else{
                s=3;
                return new BinaryDto(s,b);
            }

        }
        return new BinaryDto(s,b);
    }

    public DivDto divxy(int x, int y){
        int s=1;
        int q=0;
        int r=0;

        if(y==0){
            return new DivDto(s, q, r);
        }

        s=2;
        q=0;
        r=0;

        if(s<0 || y<0){
            return new DivDto(s, q, r);
        }

        s=3;
        q=0;
        while (!(x<y)){
            s=4;
            q= q+1;
            x=x-y;
        }

        r=x;
        return new DivDto(s, q, r);
    }




    public String concat(int r, String b){
        return r+b;
    }
}




