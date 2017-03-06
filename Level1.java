
        String string ="";
       int digits =n+5;
       int num =2;
       while(true)
       {
           boolean prime= true;
           for(int i=2;i<=Math.sqrt(num);i++)
           {
               if(num%i==0)
               {
                   prime = false;
                   break;
               }
           }
           
           if(prime)
           {
               if(string!=null&&string.length()>=digits)
            {
               break;
            }
            else
            {
               string =string+num;
            }
           }
           num++;
           
       }
       
       return string.substring(n,n+5);